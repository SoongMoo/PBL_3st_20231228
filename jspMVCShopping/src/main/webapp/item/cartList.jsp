<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cartList.jsp</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#checkBoxs").click(function(){
		if($("#checkBoxs").prop("checked")){
			$("input:checkbox[name='prodCk']").prop("checked",true);
		}else{
			$(":checkbox[name='prodCk']").prop("checked",false);
		}
	});
});
</script>
</head>
<body>
<table width="600" align = "center">
	<tr><td><input type="checkbox" id="checkBoxs" checked="checked" /></td>
		<td>이미지</td><td>제품이름</td><td>수량</td><td>합계금액</td></tr>
	<c:forEach items="${dtos }" var="dto">
	<tr><td><input type="checkbox" name="prodCk" checked="checked" /></td>
		<td><img src="goods/images/${dto.goodsImage }" width="30"/></td>
		<td>${dto.goodsName }</td>
		<td>${dto.cartQty }</td>
		<td>${dto.totalPrice }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>