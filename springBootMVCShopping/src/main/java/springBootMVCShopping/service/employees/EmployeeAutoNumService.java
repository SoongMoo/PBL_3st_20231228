package springBootMVCShopping.service.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.command.EmployeeCommand;
import springBootMVCShopping.mapper.AutoNumMapper;

@Service
public class EmployeeAutoNumService {
	@Autowired
	AutoNumMapper autoNumMapper;
	//validated를 할 때 command를 사용하므로 미리 command에 저장하는 것이 좋다.
	public void execute(Model model) {
		String empNum = autoNumMapper.autoNumSelectOne("employees","emp_num", "emp");
		EmployeeCommand employeeCommand = new EmployeeCommand();
		employeeCommand.setEmpNum(empNum);
		model.addAttribute("employeeCommand", employeeCommand);
	}
}
