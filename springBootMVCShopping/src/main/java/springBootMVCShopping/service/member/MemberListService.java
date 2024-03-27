package springBootMVCShopping.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.domain.StartEndPageDTO;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.service.StartEndPageService;

@Service
public class MemberListService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	StartEndPageService startEndPageService;
	public void execute(Model model, Integer page, String searchWord) {
		Integer limit = 10; // 한페이지에 몇개를 보여줄것인지?
		StartEndPageDTO sepDTO = startEndPageService.execute(limit, page, searchWord);
		List<MemberDTO> list= memberMapper.memberSelectList(sepDTO);
		int count = memberMapper.memberCount();
		startEndPageService.execute(page, count, limit, model, searchWord);
		model.addAttribute("dtos", list); // 최대 10개	
	}
}
