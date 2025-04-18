package springBootMVCShopping.command;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmployeeCommand {
	String empNum;
	@NotEmpty(message = "아이디를 입력해주세요. ")
	@Size(min = 8, max = 12)
	String empId;
	@Pattern(regexp = "^(?=.*?[A-Za-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-+]).{8,}$", 
			 message = "영문자와 숫자 그리고 특수문자가 포함된 8글자 이상")
	String empPw;
	@NotEmpty(message = "비밀번호확인 입력하여 주세요.")
	String empPwCon;
	@NotBlank(message = "이름을 입력하여 주세요.")
	String empName;
	@NotBlank(message = "주소를 입력하여 주세요.")
	String empAddr;
	String empAddrDetail;
	Integer empPost;
	@NotBlank(message = "연락처을 입력하여 주세요.")
	String empPhone;
	@Email(message = "형식에 맞지 않습니다.")
	@NotEmpty(message = "이메일을 입력하여 주세요.")
	String empEmail;
	@NotEmpty(message = "주민번호를 입력하여 주세요.")
	String empJumin;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date empRegiDate;
	//empPw와 empPwCon를 비교하기 위한 메서드
	public boolean isEmpPwEqualsEmpPwCon() {
		return empPw.equals(empPwCon);
	}
}
