package java_20240118;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemberEx {
	public static void main(String[] args) {
		Member member1 = new Member();
		/*
		member1.memberNum ="hk12234";
		member1.memberName = "이숭무";
		member1.memberAddr = "서울";
		member1.memberGender ='F';
		*/
		member1.setMemberAddr("서울");
		member1.setMemberGender('F');
		System.out.println(member1.getMemberGender());	
		
		String day = "2014/10/25";
		/// 날짜 형식 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;
		try {
			date = sdf.parse(day);  // 문자를 날짜로 형변환
		}catch(Exception e){}
		
		member1.memberBirth = date;
		// 날짜 형식 지정
		sdf = new SimpleDateFormat("yyyy년MM월dd일");
		String birthDay = sdf.format(member1.memberBirth);// 날짜를 문자로
		System.out.println(birthDay);
		
		Member member2 = new Member();
		
		Member member3 = new Member();
		
		Member member4 = new Member();

	}
}
