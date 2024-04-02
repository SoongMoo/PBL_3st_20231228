package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.AuthInfoDTO;

@Mapper
public interface LoginMapper {
	public String idCheckSelectOne(String userId);
	public String emailCheckSelectOne(String userEmail);
	public AuthInfoDTO loginSelect(String userId);
}
