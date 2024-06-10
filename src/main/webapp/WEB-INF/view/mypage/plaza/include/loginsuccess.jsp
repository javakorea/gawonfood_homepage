<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
%>
	<h3>로그인성공</h3>
	<%--<c:out value="${idx}"/> --%>
	<span>아이디:</span><c:out value="${userInfo.userId}"/> 
	<span>아이디:</span><c:out value="${userInfo.userPw}"/> 
</body>
</html>