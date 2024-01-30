<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	
    body {
        background-color: pink;
    }
    table {
        border-collapse: separate;
        border-spacing: 10px;
    }

    td {
        padding: 5px;
    }
</style>
</head>
<body>
<br/><br/><br/>
<div align="center"><h2>SignUp Page</h2>

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
<form name="register" action="<%=request.getContextPath() %>/Register" method="post">
    <table>
        <tr>
            <td><label>First Name:</label></td>
            <td><input type="text" name="fname" value="<%=fname %>"></td>
        </tr>
        <tr>
            <td><label>Last Name:</label></td>
            <td><input type="text" name="lname" value="<%=lname %>"></td>
        </tr>
        <tr>
            <td><label>Create Password:</label></td>
            <td><input type="text" name="password" value="<%=pass %>"></td>
        </tr>
        <tr>
            <td><label>Age:</label></td>
            <td><input type="text" name="age" value="<%=age %>"></td>
        </tr>
        <tr>
            <td><label>Phone Number:</label></td>
            <td><input type="text" name="number" value="<%=number %>"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="hidden" name="action" value="register">
                <button type="submit" value="register">Register</button>
            </td>
        </tr>
    </table>
</form>

</div>
</body>
</html>