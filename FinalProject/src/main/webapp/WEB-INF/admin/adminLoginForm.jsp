<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

adminLoginForm.jsp <br><br>

<script type="text/javascript">
	function insert() {
		location.href="insert.admin";
	}
</script>

<form action="login.admin" method="post">
	
	<h2>관리자 로그인</h2>
	
	유저명 : <input type="text" name="username"> <br><br>
	비번 : <input type="text" name="password"> <br><br>
	
	<input type="submit" value="로그인">
	<input type="reset" value="취소">
	<input type="button" value="회원가입(관리자)" onClick="insert()">
</form>