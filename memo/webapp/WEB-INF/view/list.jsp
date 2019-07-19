<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<c:forEach var="memoDto" items="${list}">
	<h3>${memoDto.content}</h3>
	<h3>${memoDto.when}</h3>
</c:forEach>   
