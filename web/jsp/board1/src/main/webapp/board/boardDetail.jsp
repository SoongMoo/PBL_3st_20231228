<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardDetail.jsp</title>
</head>
<body>
번호 : ${dto.boardNum }<br />
글쓴이 : ${dto.boardWriter }<br />
제목 : ${dto.boardSubject }<br />
내용 : ${dto.boardContent }<br /> 
<a href="boardModify.bd?num=${dto.boardNum }"> 수정</a> | 
<a href="boardDelete.bd?num=${dto.boardNum }">삭제</a>
</body>
</html>