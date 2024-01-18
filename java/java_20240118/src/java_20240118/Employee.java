package java_20240118;

public class Employee {
	//직원번호
	String empNum;
	//직원이름
	String empName;
	//직원주소
	String empAddr;
	//직원상세주소
	String empAddrDetail;
	//직원우편번호
	String empPost;
	//직원연락처
	String empPhone;
	//직원성별
	char empGender;
	
	public Employee() {}
	public Employee(String empNum, String empName,String empAddr) {
		/*
		this.empNum = empNum;
		this.empName = empName;
		this.empAddr = empAddr;*/
		this(empNum, empName, empAddr, "성동구", "12345");
		//  this 생성자
	}
	public Employee(String empNum, String empName,String empAddr, 
			String empAddrDetail, String empPost) {
		this.empNum = empNum;
		this.empName = empName;
		this.empAddr = empAddr;
		this.empAddrDetail = empAddrDetail;
		this.empPost = empPost;
	}
	
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	public String getEmpNum() {
		return empNum;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public String getEmpAddrDetail() {
		return empAddrDetail;
	}
	public void setEmpAddrDetail(String empAddrDetail) {
		this.empAddrDetail = empAddrDetail;
	}
	public String getEmpPost() {
		return empPost;
	}
	public void setEmpPost(String empPost) {
		this.empPost = empPost;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public char getEmpGender() {
		return empGender;
	}
	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
}