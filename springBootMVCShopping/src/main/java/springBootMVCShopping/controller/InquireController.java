package springBootMVCShopping.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.EmployeeDTO;
import springBootMVCShopping.domain.InquireDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.EmployeeMapper;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.repository.InquireRepository;

@Controller
@RequestMapping("inquire")
public class InquireController {
	@Autowired
	InquireRepository inquireRepository;
	@GetMapping("inquireWrite")
	public String inquireWrite(
			@ModelAttribute(value="goodsNum") String goodsNum) {
		return "thymeleaf/inquire/inquireWrite";
	}
	@Autowired
	MemberMapper memberMapper;
	@PostMapping("inquireWrite")
	public String inquireWrite(InquireDTO inquireDTO
			, HttpSession session, HttpServletResponse response) {
		
		AuthInfoDTO auth = (AuthInfoDTO	)session.getAttribute("auth");
		MemberDTO dto = memberMapper.memberSelectOne(auth.getUserId());
		inquireDTO.setMemberNum(dto.getMemberNum());
		inquireRepository.inquireInsert(inquireDTO);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			String str = "<script>"
					+ "opener.parent.inquire();" 
					+ "window.self.close()" 
					+ "</script>";
			out.print(str);
			out.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping("inquireDelete")
	public @ResponseBody void inquireDelete(Integer inquireNum) {
		inquireRepository.inquireDelete(inquireNum);
	}
	@GetMapping("inquireUpdate")
	public String inquireUpdate(Integer inquireNum, Model model ) {
		List<InquireDTO> list = inquireRepository.inquireList(null,inquireNum);
		model.addAttribute("list", list);
		return "thymeleaf/inquire/goodsInquireUpdate"; 
	}
	@PostMapping("inquireUpdate")
	@ResponseBody
	public void inquireUpdate(InquireDTO inquireDTO , HttpServletResponse response) {
		inquireRepository.inquireUpdate(inquireDTO);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			String str = "<script>"
					+ "opener.parent.inquire();" 
					+ "window.self.close()" 
					+ "</script>";
			out.print(str);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("goodsQuestion")
	public String goodsQuestion(Model model) {
		List<InquireDTO> list = inquireRepository.inquireList(null,null);
		model.addAttribute("list", list);
		return "thymeleaf/inquire/goodsQuestion";
	}
	@RequestMapping("goodsInquireDetail/{num}")
	public String goodsInquireDetail(
			@PathVariable(value="num") Integer inquireNum, Model model) {
		List<InquireDTO> list = inquireRepository.inquireList(null,inquireNum);
		model.addAttribute("list", list);
		model.addAttribute("newLineChar", "\n");
		return "thymeleaf/inquire/goodsInquireDetail"; 
	}
	@Autowired
	EmployeeMapper employeeMapper;
	@PostMapping("answerWrite")
	public String answerWrite(InquireDTO inquireDTO, HttpSession  session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		String empNum = employeeMapper.getEmpNum(auth.getUserId());
		inquireDTO.setEmpNum(empNum);
		inquireRepository.inquireAnswerUpdate(inquireDTO);
		return "redirect:goodsQuestion";
	}
}








