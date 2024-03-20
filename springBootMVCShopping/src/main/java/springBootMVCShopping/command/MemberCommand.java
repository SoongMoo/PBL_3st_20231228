package springBootMVCShopping.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class MemberCommand {
	/// 자료형이 String @NotEmpty, @NotBlank를 사용할 수 있다.
	/// html에 있는 input의 이름과 같아야 한다.
	String memberNum; // 자동부여
	@NotEmpty(message = "아이디를 입력해주세요")
	String memberId;
	String memberPw;
	@NotBlank(message = "비밀번호 확인을 입력해주세요.")
	String memberPwCon;
	@NotEmpty(message = "이름을 입력해주세요")
	String memberName;
	@NotBlank(message = "주소를 입력하여 주세요.")
	String memberAddr;
	String memberAddrDetail;
	String memberPost;
	String memberGender;
	@NotBlank(message = "연락처을 입력하여 주세요.")
	String memberPhone1;
	String memberPhone2;
	@NotBlank(message = "이메일을 입력하여 주세요.")
	String memberEmail;
	@NotNull(message="생년월일을 입력해주세요.")	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date memberBirth;
	/// String이 아닌 자료형은 @NotNull이다 
	
	public boolean isMemberPwEqualsMemberPwCon() {
		return memberPw.equals(memberPwCon);
	}
	
	
	
	
	
	
	
}
