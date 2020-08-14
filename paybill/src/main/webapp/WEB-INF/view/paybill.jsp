<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center"> Bill </h1>

<form:form action="showinfo" method="get" modelAttribute="Bill">
<div align="center">		
<p>
<label for ="card" >Card number :</label>
<form:input  id="card" path="cardnumber"/>
</p>

		<p>
<label for ="amount" >Amount  :  </label>
<form:input  id="amount" path="amount"/>
</p>


<input type="submit" value="Pay Bill">


</div>

</form:form>

</body>
</html>