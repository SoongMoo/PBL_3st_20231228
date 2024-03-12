<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>item/goodsOrder.jsp</title>
</head>
<body>
<table width="700" align="center">
	<tr><td>상품 대표 이미지</td><td>주문 상품 정보</td><td>수량/상품금액</td><td>금액</td>
		<td>배송비</td></tr>
	
	<c:forEach items="${dtos }" var="dto">
	<tr><td><img src="goods/images/${dto.goodsImage }" /></td>
		<td>주문 상품 정보</td><td>수량/상품금액</td><td>금액</td>
		<td>배송비</td></tr>
	</c:forEach>				
</table>
</body>
</html>