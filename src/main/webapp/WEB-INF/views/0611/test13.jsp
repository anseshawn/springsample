<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test13.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
	<script>
		'use strict';
		
		function fCheck(){
			let mid = document.getElementById("mid").value;
			let pwd = document.getElementById("pwd").value;
			
			location.href = "${ctp}/0611/test13/"+mid+"/"+pwd;
		}
	</script>
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>test13.jsp</h2>
	<hr/>
	<form>
		<table class="table table-bordered">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="mid" id="mid" value="admin" class="form-control" required /></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd" id="pwd" value="1234" class="form-control" required /></td>
			</tr>
			<tr>
				<td colspan="2" class="text-center">
					<input type="button" value="전송하기" onclick="fCheck()" class="btn btn-outline-success mr-3" />
					<input type="button" value="돌아가기" onclick="location.href='${ctp}/0611/index';" class="btn btn-outline-primary " />
				</td>
			</tr>
		</table>
	</form>
</div>
<p><br/></p>
</body>
</html>