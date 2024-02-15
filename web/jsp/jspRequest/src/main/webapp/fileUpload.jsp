<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileUpload.jsp</title>
</head>
<body>                                               <!-- 이진데이터로 전송 -->
<form method="post" name="frm" action="fileRequest.jsp" en 
enctype="multipart/form-data">
이름 : <input type="text" name="userName" /><br />
파일 : <input type="file" name="upFile1"/><br />
	  <input type="file" name="upFile2"/><br />
	  <input type="file" name="upFile3"/><br />
<input type="submit" value="전송" />
</form>
</body>
</html>