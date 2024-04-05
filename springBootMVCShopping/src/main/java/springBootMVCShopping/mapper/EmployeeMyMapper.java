package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.EmployeeDTO;

@Mapper
public interface EmployeeMyMapper {
	public EmployeeDTO employeeInfo(String empId);
	public int employeeInfoUpdate(EmployeeDTO dto);
	public int employeePwUpdate(@Param("userPw") String userPw, 
			@Param("empId") String empId);
}
