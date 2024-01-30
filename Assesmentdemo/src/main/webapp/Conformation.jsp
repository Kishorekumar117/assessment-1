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
        margin: 0 auto;
        border-collapse: collapse; 
        width: 50%;
    }

    
    th,td {
        padding: 8px;
        border: 1px solid black;
    }
</style>
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
<br/><br/><br/>
<table>
    <tr>
        <th>First Name:</th>
        <td><%=fname %></td>
    </tr>
    <tr>
        <th>Last Name:</th>
        <td><%=lname %></td>
    </tr>
    <tr>
        <th>Password:</th>
        <td><%=pass %></td>
    </tr>
    <tr>
        <th>Age:</th>
        <td><%=age %></td>
    </tr>
    <tr>
        <th>Number:</th>
        <td><%=number %></td>
    </tr>
    
    
     <tr >
        <td  colspan="2" align="center">
       		 <form name="submission" action="<%=request.getContextPath() %>/Register" method="post" >
	
			<input type="hidden" name="action" value="submit">
			<input type="submit" value="Submit">
			
				
			</form>
        
        	<form name="submission" action="<%=request.getContextPath() %>/Register" method="post" >

			<input type="hidden" name="action" value="reset">
			<input type="submit" value="Reset">
				
			</form>
        </td>
    </tr>
</table>





</body>
</html>