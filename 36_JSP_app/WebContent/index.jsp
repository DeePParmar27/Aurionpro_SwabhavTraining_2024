<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <%@ include file="testFile.jsp" %>

<h1>
<%= new java.util.Date() %>
</h1>

<%--  <%=    Declaration Tag  --%>
<%--  <%!    Assigment Tag  --%>
<%--  <%    Scripting Tag  --%>
<%--  <%@   Directive Tag  --%>
<%--  page = applicable to whole page --%>



<%! int a = 10 ; int b = 20; %>

<h1><%= (a+b) %></h1>

<%! String name = "Deep" ; %>
<h1> Welcome <%= name %></h1>

</body>
</html>