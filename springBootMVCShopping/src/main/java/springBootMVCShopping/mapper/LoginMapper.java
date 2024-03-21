package springBootMVCShopping.mapper;

import org.springframework.stereotype.Repository;

@Repository("springBootMVCShopping.mapper.LoginMapper")
public interface LoginMapper {
	public String idCheckSelectOne(String userId);
	public String emailCheckSelectOne(String userEmail);
}
