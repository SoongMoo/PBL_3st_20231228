<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- API : APplication Interface-->
<%@ page import="com.oreilly.servlet.MultipartRequest, 
				 com.oreilly.servlet.multipart.DefaultFileRenamePolicy,
				 java.io.File" %>

<%
/*
	String userName = request.getParameter("userName");
	String upFile1 = request.getParameter("upFile1");
*/
	String savePoint = request.getRealPath("/upload");
	System.out.println(savePoint);
	int sizeLimit = 5 * 1024 * 1024; // 5,000,000
	///                                  M   K
	MultipartRequest multi = new MultipartRequest(request, savePoint, 
			sizeLimit, "utf-8", new DefaultFileRenamePolicy());
	String userName = multi.getParameter("userName");
	String storeFileName = multi.getFilesystemName("upFile1");
	String originalName = multi.getOriginalFileName("upFile1");
	File file = multi.getFile("upFile1");
	long fileSize1 = file.length();
%>
1번재 파일 원본이름 : <%= originalName %><br />
1번재 파일 저장이름 : <%= storeFileName %><br />
1번재 파일 사이즈 : <%= fileSize1 %>Byte<br />
2번재 파일 원본이름 : <%= multi.getOriginalFileName("upFile2") %><br />
2번재 파일 저장이름 : <%= multi.getFilesystemName("upFile2") %><br />
2번재 파일 사이즈 : <%
						file = multi.getFile("upFile2");
						out.print(file.length());
					%>Byte<br />
3번재 파일 원본이름 : <%= multi.getOriginalFileName("upFile3") %><br />
3번재 파일 저장이름 : <%= multi.getFilesystemName("upFile3") %><br />
3번재 파일 사이즈 : <%
						file = multi.getFile("upFile3");
						out.print(file.length());
					%>Byte<br />
</body>
</html>