package springBootMVCShopping.service.goods;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import springBootMVCShopping.command.GoodsCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.FileDTO;
import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.EmployeeMapper;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsUpdateService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(GoodsCommand goodsCommand, HttpSession session
			, BindingResult result, Model model) {
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsContent(goodsCommand.getGoodsContent());
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsNum(goodsCommand.getGoodsNum());
		dto.setGoodsPrice(goodsCommand.getGoodsPrice());
		dto.setDeliveryCost(goodsCommand.getDeliveryCost());
		// 수정한 직원의 정보를 알기 위해 로그인 정보를 이용해서 직원정보를 가지고왔습니다.
		AuthInfoDTO auth = (AuthInfoDTO) session.getAttribute("auth");
		String empNum = employeeMapper.getEmpNum(auth.getUserId());
		dto.setUpdateEmpNum(empNum);
		System.out.println(dto.getGoodsName());
		
		// 파일의 정보를 디비로 부터 가져오기
		GoodsDTO goodsDTO = goodsMapper.selectOne(goodsCommand.getGoodsNum());
		// session정보를 가져온다.
		List<FileDTO> list = (List<FileDTO>) session.getAttribute("fileList");
		
		//1. 디렉터리 정보
		URL resource = getClass().getClassLoader().getResource("/static/upload");
		String fileDir = 
				"C:\\dev\\src6\\PBL_3st_20231228\\springBootMVCShopping\\target\\classes\\static\\upload";//resource.getFile();
		System.out.println(fileDir);
		if(!goodsCommand.getGoodsMainStore().getOriginalFilename().isEmpty()) {
			// 2. 파일객체를 불러오기
			MultipartFile mf = goodsCommand.getGoodsMainStore();
			// 3. 파일이름 가져오기
			String originalFile = mf.getOriginalFilename();
			// 4. 확장자 불리하기
			String extension = originalFile.substring(originalFile.lastIndexOf("."));
			// 5. 새로운 파일면 만들기
			String storeName = UUID.randomUUID().toString().replace("-", "");
			// 6. 새로운 파일명과 확장자 붙이기
			String storeFileName =  storeName + extension;
			// 7. 파일객체 만들기
			File file = new File(fileDir + "/" +storeFileName);
			// 8. 파일 저장
			try {
				mf.transferTo(file);
			} catch (Exception e) {			
				e.printStackTrace();
			}
			// 9. dto에 파일이름 저장
			dto.setGoodsMainStore(storeFileName);
			dto.setGoodsMainStoreImg(originalFile);
		}else {
			if(list != null) {
				for(FileDTO fd : list) {
					if(fd.getStoreFile().equals(goodsDTO.getGoodsMainStore())) {
						//session에 삭제 정보가 있는데  file을 가져오지 않으면메모장
						result.rejectValue("goodsMainStore", "error");
						model.addAttribute("error", "대문이미지를 선택해주세요.");
						model.addAttribute("goodsCommand", goodsDTO);
						session.removeAttribute("fileList");
						return;
					}
				}
			}
		}
		String originalTotal = "";
		String storeTotal = "";
		if(!goodsCommand.getGoodsImages()[0].getOriginalFilename().isEmpty()) {
			
			//1. 디렉터리 정보
			//2. 파일정보를 불러오기
			for(MultipartFile mf : goodsCommand.getGoodsImages()) {
				//  3. 파일이름 가져오기 : a.a.a.a.hwp
				String originalFile = mf.getOriginalFilename();
				// 4. 확장자 : .hwp
				String extension = originalFile.substring(originalFile.lastIndexOf("."));
				// 5. 새로운 파일명 만들기 : y897rfwefgvw
				String storeName = UUID.randomUUID().toString().replace("-", "");
				//6. 새로운 파일명과 확장자 붙이기 : y897rfwefgvw.hwp
				String storeFileName = storeName + extension;
				// 7. 파일객체 만들기
				File file = new File(fileDir + "/" + storeFileName);
				// 8. 파일 저장
				try {
					mf.transferTo(file);
				}catch(Exception e) {
					e.printStackTrace();
				}
				originalTotal += originalFile + "/";
				storeTotal += storeFileName + "/";
			}
		}
		// session에 있는 정보를 디비로부터 제거
		String dbOrg [] =  goodsDTO.getGoodsImagesImg().split("/") ; 
		String dbStore [] = goodsDTO.getGoodsImages().split("/");
		List<String> goodsImages = new ArrayList<String>();
		List<String> goodsOrgImages = new ArrayList<String>();
		if(dbStore != null) {
			for(String img : dbStore) {
				goodsImages.add(img);
			}
			for(String img : dbOrg) {
				goodsOrgImages.add(img);
			}
		}
		System.out.println(goodsImages.size());
		System.out.println(goodsOrgImages.size());
		if(list != null) {
			for(FileDTO fdto : list) {
				for(String img : goodsImages) {
					if(fdto.getStoreFile().equals(img)) {
						goodsImages.remove(fdto.getStoreFile());
						goodsOrgImages.remove(fdto.getOrgFile());
						break;
					}
				}
			}
		}
		for(String img : goodsImages) {
			storeTotal += img + "/";
		}
		for(String img : goodsOrgImages) {
			originalTotal += img + "/";
		}
		dto.setGoodsImages(storeTotal);
		dto.setGoodsImagesImg(originalTotal);			
		int i = goodsMapper.goodsUpdate(dto);
		if(i > 0) {
			if(list != null) {
				for(FileDTO fd : list) {
					 File file = new File(fileDir + "/" + fd.getStoreFile());
					 if(file.exists()) file.delete();
				}
			}
		}
	}
}













