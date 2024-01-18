package java_20240118;

import java.util.Date;

public class Member {
	String memberNum;
	String memberName;
	String memberAddr;
	String memberPhone;
	Date memberBirth; 
	char memberGender;
	
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public void setMemberBirth(Date memberBirth) {
		this.memberBirth = memberBirth;
	}
	public void setMemberGender(char memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public Date getMemberBirth() {
		return memberBirth;
	}
	public char getMemberGender() {
		return memberGender;
	}
	

}
