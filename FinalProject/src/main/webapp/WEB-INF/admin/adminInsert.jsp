<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/common.jsp" %>    
<!-- 관리자 추가 -->

adminInsert.jsp <br><br>

<form:form action="insert.admin" method="post" commandName="Admin">

아이디 : <input type="text" name="username" value="${Admin.username }">
<br><br>
비번 : <input type="text" name="password" >
<br><br>
이메일 : <input type="text" name="email" value="${Admin.email }">
<br><br>
등급 : 
	<select name="permissionLevel">
		<option value="super">super
		<option value="manager">manager
	</select>
	
<br><br>	
<input type="submit" value="추가">
<input type="button" value="메인화면">	
</form:form>