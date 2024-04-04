package springBootMVCShopping.service.memberJoin;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.service.EmailSendService;
import springBootMVCShopping.service.SMSMassageService;

@Service
public class MemberWriteService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	EmailSendService emailSendService;
	@Autowired
	SMSMassageService sMSMassageService;
	public void execute(MemberCommand memberCommand,Model model) {
		String memberPw = memberCommand.getMemberPw();		
		MemberDTO memberDTO = new MemberDTO();
		/*
		memberDTO.setMemberAddr(memberCommand.getMemberAddr());
		memberDTO.setMemberAddrDetail(memberCommand.getMemberAddrDetail());
		memberDTO.setMemberEmail(memberCommand.getMemberEmail());
		memberDTO.setMemberGender(memberCommand.getMemberGender());
		memberDTO.setMemberId(memberCommand.getMemberId());
		memberDTO.setMemberName(memberCommand.getMemberName());
		memberDTO.setMemberPhone1(memberCommand.getMemberPhone1());
		memberDTO.setMemberPhone2(memberCommand.getMemberPhone2());
		memberDTO.setMemberPost(memberCommand.getMemberPost());
		memberDTO.setMemberBirth(memberCommand.getMemberBirth());
		*/
		BeanUtils.copyProperties(memberCommand, memberDTO);
		memberDTO.setMemberPw(passwordEncoder.encode(memberPw));
		
		int i = memberMapper.memberJoinInsert(memberDTO); ///회원가입
		model.addAttribute("userName", memberDTO.getMemberName());
		model.addAttribute("userEmail", memberDTO.getMemberEmail());
		
		if(i > 0) {
			String html = "<html><body>";
				   html+= memberDTO.getMemberName() + "님의 회원 가입을 축하합니다. <br />";
				   html+= "가입을 완료하시려면 ";
				   html+= "<a href='http://localhost:8080/userConfirm?chk="
						+ memberDTO.getMemberEmail()
				   	    + "'>여기</a>를 클릭하세요."; 		  
				   html+= "</body></html>";
			String subject = "환영 인사입니다.";
			String fromEmail = "soongmoostudent@gmail.com";
			String toEmail = memberDTO.getMemberEmail();
			emailSendService.mailsend(html, subject, fromEmail, toEmail);
		}
		String content =  "안녕하세요 한경쇼핑몰 관리자입니다.";
			   content += memberDTO.getMemberName() + "님 가입을 환영합니다.";
			   content += "이메일에서 회원가입인증이 필요합니다.";
		sMSMassageService.smsSend("010-7146-1970", memberDTO.getMemberPhone1(), content);	   
		////
	}
}
