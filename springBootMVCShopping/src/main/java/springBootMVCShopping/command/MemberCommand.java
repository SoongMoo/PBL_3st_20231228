package springBootMVCShopping.command;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

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
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$",
			message = "영문자와 숫자 그리고 특수문자가 포함된 8글자 이상")
	String memberPw;  // Abcdse!234 // 1233Axbcd!
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
	@Size(min = 11, max = 13)
	String memberPhone1;
	@Size(min = 11, max = 13)
	String memberPhone2;
	@NotBlank(message = "이메일을 입력하여 주세요.")
	String memberEmail;
	@NotNull(message="생년월일을 입력해주세요.")	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date memberBirth;
	/// String이 아닌 자료형은 @NotNull이다 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date memberRegist;
	public boolean isMemberPwEqualsMemberPwCon() {
		System.out.println(memberPw);
		System.out.println(memberPwCon);
		return memberPw.equals(memberPwCon);
	}
}
