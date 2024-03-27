package springBootMVCShopping.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.FileDTO;

@Service
public class FileDelService {
	public int execute(String orgFile, String storeFile, HttpSession session) {
		int num = 0;
		FileDTO dto = new FileDTO();
		dto.setOrgFile(orgFile);
		dto.setStoreFile(storeFile);
		Boolean newFile = true; // 새로운 파일인지 확인 
		List<FileDTO> list = (List<FileDTO>)session.getAttribute("fileList");
		if(list == null ) {
			list = new ArrayList<FileDTO>();
		}
		for(FileDTO fd : list) { // session에 있으면 삭제 
			if(fd.getStoreFile().equals(storeFile)) {
				list.remove(fd);
				newFile = false;
				break;
			}
		}
		if(newFile) { // session에 없으면 등록
			list.add(dto);
			num = 1;
		}
		session.setAttribute("fileList", list);
		return num;
	}
}
