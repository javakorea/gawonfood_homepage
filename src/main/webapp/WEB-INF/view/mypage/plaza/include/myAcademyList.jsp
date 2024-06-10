<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<h3 style="color:red">.do로 통해서 들어옴myAcademyList 화면입니다</h3>
	<%--
	<%
		String a = ((PlazaAcademyApplySO)request.getAttribute("reserveInfo")).getCusGbCd();
		System.out.println("request--"+a);
	%>
	<h2 style="color:red">스크립틀릿 값: <%=a %></h2>
	
	<h2><c:out value="${memberArr}"/></h2>
	 --%>
	<c:choose>
		<c:when test="${reserveInfo.cusGbCd eq '49'}">
			<spring:message code="column.rsv_stat_cd"/>
		</c:when>
		<c:otherwise>
			<c:forEach var="idx" begin="1" end="5">
				<c:out value="${idx}"/>
			</c:forEach>
			<br/><br/>
			<c:forEach var="arr" items="${newArr}">
				<c:out value="${arr}"/>
			</c:forEach>
			<br/><br/>
			<c:forEach var="member" items="${memberArr}">
				이름:<c:out value="${member.name}"/>
				코드:<c:out value="${member.cusGbCd}"/> 
				<br/>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	
	<form id="testform" name="testform" method="post" action="xhr/mypage/digitalplaza/academy/getLoginInfo.do">
		<span>아이디:</span><input name="userId" type="text" size="30" value="">
		<span>비밀번호:</span><input name="userPw" type="password" size="30" value="">
		<input type="submit" value="로그인">
	</form>
</body>
</html>