<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${!empty auth }">
이제 쇼핑몰을 시작하겠습니다.<br />
<a href="memberList.mem">회원 목록</a>
<a href="employeeList.emp">직원 목록</a>
<a href="logout.login">로그아웃</a>
</c:if>


<c:if test="${empty auth }">
<form action="login.login" method="post" >
<table border="1" align="center">
	<tr><td colspan="2">
			 자동로그인 | 아이디저장
		</td></tr>
	<tr><td>
			<input type="text" name="userId"  placeholder="아이디" />
			<div style="color:red">${errId }</div>
		</td>
		<td rowspan="2">
			<input type="submit" value="로그인" />
		</td></tr>
	<tr><td>
			<input type="password" name="userPw" placeholder="비밀번호"/>
			<div style="color:red">${errPw }</div>
		</td></tr>
	<tr><td colspan="2">
			아이디 / 비밀번호 찾기 | 
			<a href="userAgree.nhn">회원가입</a>
		</td></tr>
</table>
</form>
</c:if>
</body>
</html>