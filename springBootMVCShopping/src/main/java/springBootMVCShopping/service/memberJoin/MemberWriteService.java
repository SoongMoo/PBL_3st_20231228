package springBootMVCShopping.service.memberJoin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class MemberWriteService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	MemberMapper memberMapper;
	
	public void execute(MemberCommand memberCommand,Model model) {
		String memberPw = memberCommand.getMemberPw();		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setMemberAddr(memberCommand.getMemberAddr());
		memberDTO.setMemberAddrDetail(memberCommand.getMemberAddrDetail());
		memberDTO.setMemberEmail(memberCommand.getMemberEmail());
		memberDTO.setMemberGender(memberCommand.getMemberGender());
		memberDTO.setMemberId(memberCommand.getMemberId());
		memberDTO.setMemberName(memberCommand.getMemberName());
		memberDTO.setMemberPhone1(memberCommand.getMemberPhone1());
		memberDTO.setMemberPhone2(memberCommand.getMemberPhone2());
		memberDTO.setMemberPost(memberCommand.getMemberPost());
		memberDTO.setMemberPw(passwordEncoder.encode(memberPw));
		memberDTO.setMemberBirth(memberCommand.getMemberBirth());
		
		int i = memberMapper.memberJoinInsert(memberDTO); ///회원가입
		model.addAttribute("userName", memberDTO.getMemberName());
		model.addAttribute("userEmail", memberDTO.getMemberEmail());
		
		if(i > 0) {
			String html = "<html><body>";
				   html+= "이숭무님의 회원 가입을 축하합니다. <br />";
				   html+= "가입을 완료하시려면 ";
				   html+= "<a href='http://localhost:8080/userConfirm?chk="
						+ memberDTO.getMemberEmail()
				   	    + "'>여기</a>를 클릭하세요."; 		  
				   html+= "</body></html>";
			String subject = "환영 인사입니다.";
			String toEmail = memberDTO.getMemberEmail();
		}
		
		
		
		
		
	}
}
