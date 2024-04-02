package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface AutoNumMapper {
	public String autoNumSelectOne(
			@Param("tableName") String tableName 
			,@Param("columnName") String columnName
			,@Param("sep") String sep);
	public void numsDelete(
			@Param("nums") String nums[], 
			@Param("tableName") String tableName,
			@Param("columnName") String columnName);
}
