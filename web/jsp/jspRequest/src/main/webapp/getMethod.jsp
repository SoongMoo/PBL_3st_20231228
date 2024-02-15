<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getMethod:request</title>
<!-- request는 서버단에서 client로부터 전송된 데이터를 받을 때 사용 -->
<!--                    서버                       -->
<!-- getMethod.jsp ==> getMethod_jsp.class(servlet) ==> html code변환 -->
</head>
<body>           <!--  requestParam_jsp.class -->
다음 페이지에 <a href="requestParam.jsp?name=이숭무">이숭무</a> 전달<br />
<form action="requestParam.jsp" method="get" >
	아이디 : <input type="text"  name="userId"/><br /><!-- 일줄 문자 -->
	비밀번호 : <input type="password"  name="userPw" /><br />
	자기소개서 : <textarea rows="5" cols="10" name="desc"></textarea><br /><!-- 여러줄 문자 -->	
	 item : <select name="item">
	 			<option>배구</option>
	 			<option>야구</option>
	 			<option>축구</option>
	 			<option>공구</option>
	 		</select><br />
	<input type="submit" value="전송" />
	<input type="reset" value="초기화" />
</form>
</body>   
</html>







