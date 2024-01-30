<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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

First Name: <%=fname %><br/>
Last Name: <%=lname %><br/>
Password: <%=pass %><br/>
Age: <%=age %><br/>
Number : <%=number %><br/>

<form name="submission" action="<%=request.getContextPath() %>/Register" method="post" >

<input type="hidden" name="action" value="submit">
<input type="submit" value="Submit">

	
</form>

<form name="submission" action="<%=request.getContextPath() %>/Register" method="post" >

<input type="hidden" name="action" value="reset">
<input type="submit" value="Reset">
	
</form>

</body>
</html>