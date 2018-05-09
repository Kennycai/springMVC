<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="helloWorld" method="post">
	<button type="submit">submit</button>
</form>
<br>

<form action="Test/1" method="post">
	<button type="submit">postTest</button>
</form>
<br>

<form action="Test/2" method="get">
	<button type="submit">getTest</button>
</form>
<br>

<form action="Test/3" method="post">
	<input type="hidden" name="_method" value="PUT"/>
	<button type="submit">putTest</button>
</form>
<br>

<form action="Test/4" method="post">
	<input type="hidden" name="_method" value="DELETE"/>
	<button type="submit">deleteTest</button>
</form>
</body>
</html>