package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.UserChangePasswordDTO;

@Mapper
public interface FindMapper {
	public String findId(String userPhone, String userEmail);
	public AuthInfoDTO userEmail(@Param("_userId") String userId,
			 @Param("_userPhone") String userPhone);
	public int pwUpdate(UserChangePasswordDTO dto);
}
