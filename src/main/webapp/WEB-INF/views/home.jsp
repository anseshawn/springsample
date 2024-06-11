<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/> 
<%-- <%@ page session="false" %> --%> <%-- 세션 사용하지 않겠다는 의미 --%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Hello world!  
	</h1>
	
	<P>  The time on the server is ${serverTime}. </P>
	<hr/>
	<p>
		<a href="${ctp}/0611/index">index.jsp</a>
	</p>
</body>
</html>
