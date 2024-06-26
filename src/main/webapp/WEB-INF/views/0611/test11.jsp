<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test11.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
	<script>
		'use strict';
		if('${msg}' != null && '${msg}' != "" ) alert("${msg}");
	</script>
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>회 원 가 입</h2>
	<hr/>
	<form method="post">
		<table class="table table-bordered">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="mid" id="mid" value="${mid}" class="form-control" required /></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd" id="pwd" value="${pwd}" class="form-control" required /></td>
			</tr>
			<tr>
				<th>성명</th>
				<td><input type="text" name="name" id="name" value="${name}" class="form-control" required /></td>
			</tr>
			<tr>
				<th>별명</th>
				<td><input type="text" name="nName" id="nName" value="${nName}" class="form-control" required /></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="number" name="age" id="age" value="${age}" class="form-control" required /></td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<input type="radio" name="strGender" id="gender1" class="mr-2 ml-2" value="남자" ${strGender=='남자'? 'checked' : ""} />남자&nbsp;
					<input type="radio" name="strGender" id="gender2" class="mr-2 ml-2" value="여자" ${strGender=='여자'? 'checked' : ""} />여자
				</td>
			</tr>
			<tr>
				<td colspan="2" class="text-center">
					<input type="submit" value="회원가입" class="btn btn-outline-success mr-3" />
					<input type="button" value="돌아가기" onclick="location.href='${ctp}/0611/index';" class="btn btn-outline-primary " />
				</td>
			</tr>
		</table>
	</form>
</div>
<p><br/></p>
</body>
</html>