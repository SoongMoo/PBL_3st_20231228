<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	 String userName = request.getParameter("userName");
	 String item [] = request.getParameterValues("item");
	 String cp [] = request.getParameterValues("cp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>requestValues.jsp</title>
</head>
<body>
이름 : <%= userName %><br />
취미 : <%
		for(String it : item){
			out.print(it + ",");
		}
%><br />
관심여부 : 
<% 
		for(String c : cp){
			out.print(c + ",");
		}
%><br />
결혼 여부 : <%= request.getParameter("M_Status") %>
</body>
</html>