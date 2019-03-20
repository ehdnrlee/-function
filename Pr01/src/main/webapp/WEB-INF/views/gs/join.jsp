<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <title>회원가입</title>
</head>
<body>
<h1>
   회원가입 정보입력   
</h1>
<form action="/pro/gsjoin" method="post">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
<P> 아이디: <input type="text" name="id"></P>
<P> 비번: <input type="password" name="pwd"></P>
<P> 이름: <input type="text" name="irum"></P>
<P> 폰번호: <input type="text" name="pNumber"></P>
<P> 이메일: <input type="text" name="email"></P>
<input type="submit" value="입력" >
</form>
</body>
</html>