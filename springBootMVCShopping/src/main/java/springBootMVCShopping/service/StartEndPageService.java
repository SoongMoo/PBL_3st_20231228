package springBootMVCShopping.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.StartEndPageDTO;

@Service
public class StartEndPageService {
	public StartEndPageDTO execute(int limit, int page, String searchWord) {
		int startRow =  ((page - 1) * limit) + 1 ; // 1 : 1,  2 : 11 , 3: 21
		int endRow = startRow + limit - 1; 
		StartEndPageDTO sepDTO = new StartEndPageDTO();
		sepDTO.setStartRow(startRow);
		sepDTO.setEndRow(endRow);
		sepDTO.setSearchWord(searchWord);
		return sepDTO;
	}
	public void execute(int page, int count, int limit, Model model, String searchWord) {
		int limitPage = 10  ; 
		int startPage =(int)((double) page / limitPage + 0.95 - 1) * limitPage + 1; // 1
		// 1 ~ 10 : 1, 11 ~ 20 : 11, 21 ~ 30 : 21,..., 91 ~ 100 : 91,     
		int endPage = startPage + limitPage - 1;   // 10
		             //  (double)21  / 10 = 2.1 + 0.95 = (int)3.05 = 3 
		int maxPage = (int)((double)count /  limit  + 0.95); // 3; 
		if(maxPage < endPage) endPage = maxPage;
		/// 회원이 없는 경우 maxPage가 0이되어서 endPage가 0이되는 것을 막기 위해서		
		if(endPage == 0 ) endPage = 1;  
		model.addAttribute("searchWord", searchWord);
		model.addAttribute("page", page);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("count", count);
		model.addAttribute("maxPage", maxPage);	
	}
}
