<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberModify.jsp</title>
</head>
<body>
${dto.memberNum }회원님의 정보수정입니다.<br />
<form action="memberModify" method="post" name="frm">
회원번호 : <input type="text" name="memberNum" value="${memberCommand.memberNum }" readonly="readonly"/><br />
이름 : <input type="text" name="memberName" value="${memberCommand.memberName }"/><br />
아이디 : <input type="text" name="memberId" value="${memberCommand.memberId }"/><br />
주소 : <input type="text" name="memberAddr" value="${memberCommand.memberAddr }" /><br />
상세주소 : <input type="text" name="memberAddrDetail" value="${memberCommand.memberAddrDetail }"/><br />
우편번호 : <input type="text" name="memberPost" value="${memberCommand.memberPost }"/><br />
연락처1 : <input type="tel" name="memberPhone1" value="${memberCommand.memberPhone1 }"/><br />
연락처2 : <input type="tel" name="memberPhone2" value="${memberCommand.memberPhone2 }"/><br />
성별 : <input type="radio" name="memberGender" value="M" 
		<c:if test="${memberCommand.memberGender == 'M'}">checked</c:if> />남자
	 <input type="radio" name="memberGender" value="F" 
	 	<c:if test="${memberCommand.memberGender == 'F'}">checked</c:if> />여자<br />
등록일 : <input type="date" name="memberRegist" value="${memberCommand.memberRegist }"/><br />
생년월일 : <input type="date" name="memberBirth" value="${memberCommand.memberBirth }"/><br />
이메일 : <input type="email" name="memberEmail" value="${memberCommand.memberEmail }"/><br />
<input type="submit" value="회원수정 완료" /> 
<input type="button" value="회원목록" onclick="javascript:location.href='memberList.mem'">
</form>
</body>
</html>