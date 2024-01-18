package java_20240118;

public class EmployeeEx {

	public static void main(String[] args) {
		Employee emp = new Employee("123", "이숭무", "서울");
		System.out.println(emp.getEmpAddrDetail());
		Employee emp1 = new Employee("345", "이상범", "서울", "성동구", "12345");
	}

}
