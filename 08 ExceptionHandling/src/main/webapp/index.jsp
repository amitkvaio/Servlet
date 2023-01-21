<!DOCTYPE html>
<html>
<head>
<meta charset="US-ASCII">
<title>Home Page</title>
</head>
<body>
	<h2>Welcome to Our Application</h2>
	<form action="myExp">
	<input type="submit" value="Exception">	
</form>
</body>
</html>


<!-- 
When a servlet throws an exception, the web container searches the configurations in web.xml 
that use the exception-type element for a match with the thrown exception type.

we would have to use the error-page element in web.xml to specify the 
	invocation of servlets in response to certain exceptions or HTTP status codes.
	
If we want to have a generic Error Handler for all the exceptions 
	then we should define following error-page instead of defining 
		separate error-page elements for every exception 
<error-page>
   <exception-type>java.lang.Throwable</exception-type >
   <location>/ErrorHandler</location>
</error-page>
  -->