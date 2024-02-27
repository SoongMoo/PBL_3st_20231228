package controller.user;

import javax.servlet.http.HttpServletRequest;

import model.dao.UserDAO;
import model.dto.AuthInfoDTO;

public class IDCheckService {
	public void execute(HttpServletRequest request) {
		String userId = request.getParameter("idCheck");
		UserDAO dao = new UserDAO(); 
		AuthInfoDTO dto = dao.loginSelect(userId);
		request.setAttribute("auth", dto);
		request.setAttribute("idCheck", userId);
	}
}
