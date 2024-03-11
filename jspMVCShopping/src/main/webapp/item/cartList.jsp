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
	
	$("input[name='prodCk']").click(function(){
		var checkCnt = $("input[name='prodCk']").length;
		var checked = $("input[name='prodCk']:checked").length;
		if(checkCnt != checked) $("#checkBoxs").prop("checked", false);
		else $("#checkBoxs").prop("checked", true);
	});
});

function itemsDel(){
	if($("input[name='prodCk']:checked").length <= 0){
		alert("적어도 하나이상 체크되어 있어야합니다.");
		return false;
	}else{
		con = confirm("삭제한 상품은 복구가 불가능합니다. \n그래도 삭제하시겠습니까?");
		if(con){
			var goodsNums = "";
			$("input[name='prodCk']:checked").each(function(){
				goodsNums += $(this).val() + "`";
			});
			console.log(goodsNums);
			location.href="cartItemsDel.item?goodsNums="+goodsNums;
		}
	}
}
function itemDel(goodsNums){
	location.href="cartItemsDel.item?goodsNums="+goodsNums+"`";
}
</script>
</head>
<body>
<table width="600" align = "center">
	<tr><td><input type="checkbox" id="checkBoxs" checked="checked" /></td>
		<td>이미지</td><td>제품이름</td><td>수량</td><td>합계금액</td>
		<td><button type="button" onclick="itemsDel();" >선택상품삭제</button></td></tr>
	<c:forEach items="${dtos }" var="dto">
	<tr><td><input type="checkbox" name="prodCk" value="${dto.goodsNum }" checked="checked" /></td>
		<td><img src="goods/images/${dto.goodsImage }" width="30"/></td>
		<td>${dto.goodsName }</td>
		<td>${dto.cartQty }</td>
		<td>${dto.totalPrice }</td>
		<td><button type="button" onclick="itemDel('${dto.goodsNum }');" >삭제</button></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>