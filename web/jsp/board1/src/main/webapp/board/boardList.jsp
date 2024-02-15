<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList.jsp</title>
</head>
<body>
게시판 리스트<br />
<a href="boardWrite.bd">글쓰기</a><br />
<table border=1 width=600>
	<tr><td>번호</td><td>글쓴이</td><td>제목</td></tr>
	<c:forEach items="${list }" var="dto" >
	<tr><td>${dto.boardNum }</td>
		<td>${dto.boardWriter }</td>
		<td><a href="boardDetail.bd?num=${dto.boardNum }">${dto.boardSubject }</a></td></tr>
	</c:forEach>
</table>
</body>
</html>
