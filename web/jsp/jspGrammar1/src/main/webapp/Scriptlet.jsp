<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar, java.util.Date" %>
<%@ page import="java.util.ArrayList" %>

<%! // 선언부 : 변수선언, 함수선언
	int iii = 100;
	public int calc(int num1, int num2, String otp){
		int result = 0;
		if (otp.equals("+")){
			result = num1 + num2;
		}else if(otp.equals("-")){
			result = num1 - num2;
		}else if(otp.equals("*")){
			result = num1 * num2;
		}else if(otp.equals("/")){
			result = num1 / num2;
		}
		return result;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scriptlet.jsp</title>
</head>
<body>
<%  // 스크립트릿 : html내에 java 코드가 있음을 나타내준다.
	for(int i = 1; i <= 9; i++){
		out.print("5 * " + i + " = " + 5 * i + "<br />");
	}
%>
<% for (int i = 1 ; i <= 9; i++){ 
		out.print("5 * " + i + " = " + 5 * i + "<br />");
%>
<% } %>
<% for (int i = 1; i <= 9; i++){ %>
		<!-- 표현식 -->
		<%= "5 * " + i + " = " + 5 * i + "<br />" %>
<% } %>
1부터 100까지의 합을 구하시오.
<%
	int sum = 0;
	for(int i = 1; i <= 100; i++){
		sum += i;
	}
%>
1+2+3+4+...+100 = <%= sum %>
<br />
<%
	sum = 0;
	for(int i = 1; i <= 100 ; i++){
		if (i < 100){
			out.print(i + "+");
		}else{
			out.print(100);
		}
		if(i % 30 == 0) out.print("<br />");
		sum += i;
	}
%>
= <%= sum %>
<br />
<%
	sum = 0;
	for(int i = 1; i <= 100 ; i++){
		if (i < 100){
%>
			<%= i + "+" %>;
<% 
		}else{
%>
			100
<%		}
		if(i % 30 == 0) out.print("<br />");
		sum += i;
	}
%>
= <%= sum %>
<%
	Calendar cal = Calendar.getInstance(); 
%>
<br />
오늘 날짜는 <%= cal.getTime() %><br />
5 + 1 = <%= calc(5, 1, "+") %><br />
5 - 1 = <%= calc(5, 1, "-") %><br />
형변환<br />
<%= (char)65 %><br />
<%= (int)'A' %><br />
<%
	long l = 10; // 4byte => 8byte
	out.print(l+"<br />");
	l = 10000000000L; // 8byte
	out.print(l+"<br />");
	double d = 0.5; // 8byte
	out.print(d+"<br />");
	float f  = 0.5f; // 8byte => 4byte
	out.print(f+"<br />");
	f = l ; // 정수를 실수로 : 자동형변환
	out.print(f+"<br />");
	int i1 = (int)d; // 실수를 정수로 : 강제형변환
	out.print(i1+"<br />");
%>
배열<br />
<%
	int [] intArray = new int[5];
	intArray[0] = 10;
	intArray[1] = 20;
	intArray[2] = 30;
	intArray[3] = 40;
	intArray[4] = 50;
	for(int s : intArray){
		out.print(s + ",");
	}
	out.print("<br />");
%>
<table border=1> 
	<tr><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td></tr>
	<tr><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td></tr>
	<tr><td>11</td><td>12</td><td>13</td><td>14</td><td>15</td></tr>
	<tr><td>16</td><td>17</td><td>18</td><td>19</td><td>20</td></tr>
</table>
<br />
<table border=1> 
<%
	int num = 1;
	for(int row = 1; row <= 4 ; row++){
		out.print("<tr>");
		for(int td = 1; td <= 5; td++){
			out.print("<td>"+ num++ +"</td>");
		}
		out.print("</tr>");
	}
%>
</table>
<br />
<%
	num  = 12 /3;
	switch(num){
	case 1 : out.print(1); break;
	case 2 : out.print(2); break;
	case 3 : out.print(3); break;
	case 4 : out.print(4); break;
	case 5 : out.print(5); break;
	default : out.print("default");
	}
%>
<br />
문자열 메서드<br />
<%
	String str1 = "first string";
				 //0123456789
	String str2 = "second string";
%>
str1 : <%= str1 %>
str1.indexOf("ing") : <%= str1.indexOf("ing") %><br />
str2.indexOf('s') : <%= str1.indexOf('s') %><br />
str2.indexOf('s', 3) : <%= str1.indexOf('s', 3) %><br />
str1.indexOf('s', 4) : <%= str1.indexOf('s', str1.indexOf('s') + 1 %><br />
str1.length() : <%= str1.length() %><br />
str1.charAt(4) : <%= str1.charAt(4) %><br />
str1.substring(6, 6 + 3) : <%= str1.substring(6, 6 + 3) %><br />
str1.substring(6) : <%= str1.substring(6) %><br />

















</body>
</html>




