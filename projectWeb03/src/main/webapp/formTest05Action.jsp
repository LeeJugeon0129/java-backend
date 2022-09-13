<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체크박스 받기</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String[] values = request.getParameterValues("chk");
%>
<%
	for(String str:values){
		%>
		<%=str %><br>
		<%
	}
%>
</body>
</html>