<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	
%>
<c:set var="ctp" value="${pageContext.request.contextPath}"/> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test8.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>이곳은 test8.jsp 입니다.</h2>
	<hr/>
	<p>
		성명 : ${vo.name} / ${name}<br/>
		별명 : ${vo.NName}<br/>
		아이디 : ${vo.mid}<br/>
		비밀번호 : ${vo.pwd}<br/>
		나이 : ${vo.age}<br/>
		성별 : ${vo.strGender}<br/>
	</p>
	<hr/>
	<p>
		<a href="${ctp}/0611/index" class="btn btn-success">돌아가기</a>
	</p>
</div>
<p><br/></p>
</body>
</html>