<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detailView.jsp</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#cartBtn").click(function(){
		if(${!empty auth}){
			
		}else{
			window.open("loginCk.login","loginck","width=400,height=400");
		}
	});
	$("#wish").click(function(){
		$.ajax({
			type:"post",
			url:"wishItem.item",
			data:{"goodsNum":"${dto.goodsNum }"},
			success:function(){
				if( $("#wish").attr("src") == "images/hart1.jpg" ){
					$("#wish").attr("src","images/hart.jpg");
					alert("관심상품으로 등록되었습니다.");
				}else{
					$("#wish").attr("src","images/hart1.jpg");
					alert("관심상품으로 등록이 취소되었습니다.");
				}
			},
			error:function(){
				alert('로그인 아웃 되었습니다.\n다시 로그인 해 주세요.');
				location.href="<c:url value='/' />";
				return false;
			}
		});
	});
});
</script>
</head>
<body>
<table width="800" align="center">
<caption>${dto.goodsName } 상품정보입니다.</caption>
<tr><td rowspan="5"><img src="goods/images/${dto.goodsMainStore }" height="200" /></td>
					<td>${dto.goodsName }</td></tr>
<tr>                <td>${dto.goodsPrice }</td></tr>
<tr>                <td><c:if test="${dto.deliveryCost == 0}">무료배송</c:if>	
						<c:if test="${dto.deliveryCost != 0}">${dto.deliveryCost}</c:if></td></tr>
<tr>                <td>수량 : <input type="number" min="1" step="1" value="1" /> </td></tr>
<tr>                <td><button type="button" id="cartBtn">장바구니</button> | 
 						바로구매 
					<c:if test="${empty isTrue }">
						<img src="images/hart1.jpg" width="20" id="wish"/>
					</c:if>
					<c:if test="${!empty isTrue }">
						<img src="images/hart.jpg" width="20" id="wish"/>
					</c:if>
					찜</td></tr>
<tr><td colspan="2">제품 상세 설명 | 리뷰 | 상품문의</td></tr>
</table>
</body>
</html>