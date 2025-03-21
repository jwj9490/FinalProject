<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- web-inf\common\common.jsp<br> -->

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


접속자 아이디 : ${sessionScope.loginInfo.id } <br> 
<!-- session으로 설정된 것중에 loginInfo라는게 있는데 거기에서 id 가져와봐라 -->
<!-- 지금 session설정한게 loginInfo밖에 없기때문에 sessionScope는 생략해도된다. 만약 같은 이름 세션 있으면 써줘야함 -->
<a href="start.jsp">시작페이지</a> <br>
<a href="logout.jsp">로그아웃</a> <br>
