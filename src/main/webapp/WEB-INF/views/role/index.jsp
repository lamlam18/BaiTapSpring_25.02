<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ROLE</title>
</head>
<body>
	<c:forEach items="${ listRole }" var="item">
	<h6>${item.id }</h6>
	<h6>${item.name }</h6>
	<h6>${item.description }</h6>
	</c:forEach>
</body>
</html>