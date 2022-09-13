<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String cnt = request.getParameter("countries01");
	String wt = request.getParameter("what01");
%>
나라 : <%= cnt %><br>
보고싶은 것 : <%= wt %><br>

</body>
</html>