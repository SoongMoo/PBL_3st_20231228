package springBootMVCShopping.service.goods;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import springBootMVCShopping.command.GoodsCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.EmployeeMapper;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsWriteService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(GoodsCommand goodsCommand,HttpSession session) {
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsContent(goodsCommand.getGoodsContent());
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsNum(goodsCommand.getGoodsNum());
		dto.setGoodsPrice(goodsCommand.getGoodsPrice());
		dto.setDeliveryCost(goodsCommand.getDeliveryCost());
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		String empNum = employeeMapper.getEmpNum(auth.getUserId());
		dto.setEmpNum(empNum);
		/// 파일 추가
		URL resource =  getClass().getClassLoader().getResource("static/upload");
		System.out.println("resource : " + resource);
		String filrDir = resource.getFile();
		////////// 파일 관련 내용
		MultipartFile mf = goodsCommand.getGoodsMainStore();
		String originalFile = mf.getOriginalFilename(); /// a.a.a.a.hwp
		// 확장자 // jpg/png/
		String extension = originalFile.substring(originalFile.lastIndexOf("."));
		String storeName = UUID.randomUUID().toString().replace("-", "");
		String storeFileName = storeName + extension;
		File file = new File(filrDir+"/"+storeFileName);
		try {
			mf.transferTo(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//////
		dto.setGoodsMainStore(storeFileName);
		dto.setGoodsMainStoreImg(originalFile);
		if(!goodsCommand.getGoodsImages()[0].getOriginalFilename().isEmpty()) {
			String originalTotal = ""; 
			String storeTotal = "";
			for(MultipartFile mf1 : goodsCommand.getGoodsImages()) {
				originalFile = mf1.getOriginalFilename(); 
				extension = originalFile.substring(originalFile.lastIndexOf("."));
				storeName = UUID.randomUUID().toString().replace("-", "");
				storeFileName = storeName + extension;
				file = new File(filrDir+"/"+storeFileName);
				try {
					mf1.transferTo(file);
				} catch (Exception e) {
					e.printStackTrace();
				}
				originalTotal += originalFile + "/";
				storeTotal += storeFileName +"/";
			}
			dto.setGoodsImages(storeTotal);
			dto.setGoodsImagesImg(originalTotal);
		}
		goodsMapper.goodsInsert(dto);
	}
}














	
