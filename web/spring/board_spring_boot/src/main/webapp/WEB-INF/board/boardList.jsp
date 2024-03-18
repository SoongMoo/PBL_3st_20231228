<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시판 리스트<br />
<a href="boardWrite">게시글 쓰기</a><br />
<table border = 1 width=600>
	<tr><th>번호</th><th>글쓴이</th><th>제목</th></tr>
	<c:forEach items="${dtos}" var="dto">
	<tr><td><a href="boardDetail?num=${dto.boardNum }">${dto.boardNum }</a></td>
		<td><a href="boardDetail?num=${dto.boardNum }">${dto.boardWriter }</a></td>
		<td>${dto.boardContent }</td></tr>
	</c:forEach>
</table>
</body>
</html>