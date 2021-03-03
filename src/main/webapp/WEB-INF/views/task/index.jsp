<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
<c:forEach items="${ taskList }" var="item">
	<h6>${item.id }</h6>
	<h6>${item.name }</h6>
	<h6>${item.startDate }</h6>
	<h6>${item.endDate }</h6>
	<h6>${item.projectId }</h6>
	<h6>${item.userId }</h6>
	<h6>${item.statusId }</h6>
	</c:forEach>
</body>
</html>