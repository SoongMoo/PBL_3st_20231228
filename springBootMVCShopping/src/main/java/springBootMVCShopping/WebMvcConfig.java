package springBootMVCShopping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig  implements WebMvcConfigurer{
	@Autowired
	InteceptorConfig inteceptorConfig;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		List<String> excludeList = new ArrayList<String>();//로그인 하지 않아도 되는 페이지 저장
		excludeList.add("/register/**/*");
		excludeList.add("/checkRest/**/*");
		excludeList.add("/help/**/*");
		excludeList.add("/login/**/*");
		excludeList.add("/corner/**/*");
		excludeList.add("/static/**/*");
		excludeList.add("/review/**/*");// 허용된 페이지 이외에는 다 차단되었습니다.
		registry.addInterceptor(inteceptorConfig)
		        .addPathPatterns("/**/*") // 모두차단
		        .excludePathPatterns(excludeList); // 허용할 주소
	}
}
