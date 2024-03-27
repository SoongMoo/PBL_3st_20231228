package springBootMVCShopping.mapper;

import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.AuthInfoDTO;

@Repository("springBootMVCShopping.mapper.LoginMapper")
public interface LoginMapper {
	public String idCheckSelectOne(String userId);
	public String emailCheckSelectOne(String userEmail);
	public AuthInfoDTO loginSelect(String userId);
}
