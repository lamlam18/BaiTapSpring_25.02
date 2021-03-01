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
	<tbody>
                    	<c:forEach items="${ listRole }" var="item">
	                        <tr>
	                            <td>${ item.id }</td>
	                            <td>${ item.name }</td>
	                            <td>${ item.description }</td>
	                            <td>
	                                <a href="<%=request.getContextPath()%>/role/edit?id=${item.id}" class="btn btn-sm btn-info">
	                                    <i class="fa fa-pencil-square-o"></i>
	                                </a>
	                                <a href="<%=request.getContextPath()%>/role/delete?id=${item.id}" class="btn btn-sm btn-danger">
	                                    <i class="fa fa-trash-o"></i>delete
	                                </a>
	                            </td>
	                        </tr>
                        </c:forEach>
                    </tbody>
</body>
</html>