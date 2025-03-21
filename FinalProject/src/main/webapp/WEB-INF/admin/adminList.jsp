<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/common.jsp" %>    

<!-- 관리자 메인 페이지 (관리자 목록) -->

adminList.jsp <br>

<c:forEach var="al" items="${adminLists }">
	<c:if test="${al.permissionLevel == 'super' }">
		id : ${al.admin_id } <br>
		유저명 : ${al.username } <br> 
		비번 :  ${al.password } <br>
		이메일 : ${al.email } <br>
		등급 :  ${al.permissionLevel } <br>
	</c:if>
	<c:if test="${al.permissionLevel == 'manager' }"> <br>
		id : ${al.admin_id } <br>
		유저명 : ${al.username }  <br>
		비번 :  ${al.password } <br>
		이메일 : ${al.email } <br>
		등급 :  ${al.permissionLevel } <br>
	</c:if>
</c:forEach>
<br><br>
<a href="insert.admin">관리자 추가</a>