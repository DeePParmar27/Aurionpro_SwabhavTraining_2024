<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="Deep"></c:out><br>
<c:set var="num" value ="2" ></c:set>
<c:out value="${num}"></c:out> 

<c:if test="${num%2==0}">
<h2>Even</h2>
</c:if>


<c:set var="age" value="12"></c:set>
<c:out value="${age}"></c:out><br>

<c:remove var="age"/>
<c:out value="after removing :-${age}"></c:out>

<br>
<b>
<c:set var="income" value="40000"></c:set>
<c:choose>
<c:when test="${income < 20000}">Income not good</c:when>
<c:when test="${income > 20000}">Income is good</c:when>

</c:choose>
</b>
<br>
<h2>
<c:forEach var="i" begin="1" end="10">
<c:out value="${i}"></c:out>
</c:forEach>


</h2>


</body>
</html>