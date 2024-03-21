package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Param;

public interface AutoNumMapper {
	public String autoNumSelectOne(
			@Param("tableName") String tableName 
			,@Param("columnName") String columnName
			,@Param("sep") String sep);
}
