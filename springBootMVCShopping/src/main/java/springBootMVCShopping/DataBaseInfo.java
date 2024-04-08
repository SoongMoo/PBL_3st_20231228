package springBootMVCShopping;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseInfo {
	/*
	 * @Bean public DataSource dataSource() { DriverManagerDataSource dataSource =
	 * new DriverManagerDataSource();
	 * dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	 * dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	 * dataSource.setUsername("rhee"); dataSource.setPassword("1234"); return
	 * dataSource; }
	 */

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext applicationContext)
			throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setTypeAliasesPackage("springBootMVCShopping.domain");
		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
		configuration.setMapUnderscoreToCamelCase(true);
		sessionFactory.setConfiguration(configuration);
		//sessionFactory.setMapperLocations(applicationContext.getResources("classpath:mappers/**/*Mapper.xml"));
		return sessionFactory.getObject();
	}

	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
