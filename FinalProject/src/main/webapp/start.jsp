<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String adminMain = request.getContextPath() + "/" + "list.admin";
	String adminInsert = request.getContextPath() + "/" + "insert.admin";
%>

<a href="<%=adminMain %>">메인페이지</a> <br><br>
<a href="<%=adminInsert %>">어드민추가페이지</a> <br><br>