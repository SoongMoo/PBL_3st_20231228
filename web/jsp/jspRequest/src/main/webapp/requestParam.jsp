<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	// requestParam_jsp.class
	String name = request.getParameter("name");
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String desc = request.getParameter("desc");
	String item = request.getParameter("item");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
getMethod.jsp로 부터 전달된 이름 : <%= name %><br />
아이디 : <%= userId %><br />
비밀번호 : <%= userPw %><br />
자기소개서 : <%= desc %><br />
취미 : <%= item %>
</body>
</html>