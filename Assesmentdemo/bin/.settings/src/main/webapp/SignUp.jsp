<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>SignUp Page</h2>
<hr color="blue"> 
<%
String fname = "";
String  lname= "";
String  pass= "";
String  age= "";
String  number= "";
Cookie[] cookies = request.getCookies();

	
	if (cookies != null) {
	    for (Cookie cookie : cookies) {
	        
	    	if (cookie.getName().equals("regData")) {
	            String combinedData = cookie.getValue();
	            String[] userDataArray = combinedData.split(":");
	            
	             fname = userDataArray[0];
	             lname = userDataArray[1];
	             pass = userDataArray[2];
	             age = userDataArray[3];
	             number = userDataArray[4];

	        }
	    }
	}
	


%>
<form name="register" action="<%=request.getContextPath() %>/Register" method="post" >
<label>First Name:</label>
<input type="text" name="fname" value=<%=fname %>><br/>
<label>Last Name:</label>
<input type="text" name="lname" value=<%=lname %>><br/>
<label>Create PassWord:</label>
<input type="text" name="password" value=<%=pass %>><br/>

<label>Age:</label>
<input type="text" name="age" value=<%=age %>><br/>

<label>Phone Number:</label>
<input type="text" name="number" value=<%=number %>><br/>
<input type="hidden" name="action" value="register"/>
<button type="submit" value="register">Register</button>

</form>
<hr>
</body>
</html>