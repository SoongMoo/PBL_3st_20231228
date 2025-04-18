package springBootMVCShopping.service.employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.EmployeeDTO;
import springBootMVCShopping.domain.StartEndPageDTO;
import springBootMVCShopping.mapper.EmployeeMapper;
import springBootMVCShopping.service.StartEndPageService;

@Service
public class EmployeeListService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	StartEndPageService startEndPageService;
	
	String searchWord;
	public void execute(String searchWord, int page, Model model) {
		int limit= 10;
		StartEndPageDTO sepDTO = startEndPageService.execute(limit, page, searchWord);
		List<EmployeeDTO> list = employeeMapper.employeeAllSelect(sepDTO);
		
		int count = employeeMapper.employeeCount(searchWord);
 		startEndPageService.execute(page, count,limit, model,  searchWord);
		model.addAttribute("dtos", list);
	}
}
