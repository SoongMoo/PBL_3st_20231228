<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("goodsNum", request.getParameter("goodsNum"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inquireList.jsp</title>
<script type="text/javascript">
$(function(){
	$("#inquire1").click(function(){
		window.open("inquireWrite.inq?goodsNum=${goodsNum}","문의하기"
				,"width=700, height=650, top=100, left=100");
	});
});
</script>
</head>
<body>
<table width="800" align="center" border="1">
	<tr><td colspan="3" align="right">
		<button type="button" id="inquire1" >문의 하기</button>
	</td></tr>
	<tr><th width="15%">답변 상태</th><th>작성자</th><th>질문일자</th></tr>
</table>
</body>
</html>