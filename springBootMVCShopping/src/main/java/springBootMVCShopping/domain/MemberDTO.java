package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Alias("member")
public class MemberDTO {
	// table에 있는 컬럼과 같아야 한다.
	   String memberNum;
	   String memberId;
	   String memberPw;
	   String memberName;
	   String memberAddr;
	   String memberAddrDetail;
	   String memberPost;
	   @DateTimeFormat(pattern = "yyyy-MM-dd")
	   Date memberRegist;
	   String memberGender;
	   String memberPhone1;
	   String memberPhone2;
	   String memberEmail;
	   @DateTimeFormat(pattern = "yyyy-MM-dd")
	   Date memberBirth;
	   Integer memberPoint;
	   String memberEmailConf;
}
