<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>purchaseList.jsp</title>
</head>
<body>
<table width="800" align="center">
	<tr><td>주문번호 / 결제번호</td><td> 상품명 </td><td> 주문상태 </td></tr>
<c:forEach items="${list }" var="dto">	
	<tr><td>${dto.purchaseNum } / 
			<c:if test="${empty dto.confirmNum }">결제대기중</c:if>
			<c:if test="${!empty dto.confirmNum }">${dto.confirmNum }</c:if> </td>
	<td> ${dto.goodsName } </td>
	<td> <c:if test="${empty dto.confirmNum }">
			<a href="paymentOk.item?purchaseNum=${dto.purchaseNum }">결제하기</a>
		 </c:if> 
		 <c:if test="${!empty dto.confirmNum }">결제취소</c:if> 
	</td></tr>
</c:forEach>
</table>
</body>
</html>