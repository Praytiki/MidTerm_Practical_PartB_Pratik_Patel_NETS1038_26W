<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="<%=request.getContextPath()%>/MidtermServlet" method="post">




	<table style="width: 100%; border-collapse: collapse;">
	
	
		<tr>
            <td>Full Name:</td>
            <td><input type="text" name="fullName" pattern="[A-Za-z ]{1,50}" maxlength="50" required></td>
        </tr>
        
        <tr>
            <td>Contact Number:</td>
            <td><input type="text" name="contact" pattern="[0-9]{10}" maxlength="10"  required></td>
        </tr>
        
        <tr>
			<td>Email:</td>
			<td><input type="email" name="email" required /></td>
					
		</tr>
		
		
		<tr>
			<td>Date Available:</td>
			<td><input type="date" name="dateAvailable" required /></td>
		</tr>
		
		<tr>
            <td>Salary:</td>
            <td><input type="text" name="salary" pattern="0\.[0-9]{2}|[1-9][0-9]{0,5}\.[0-9]{2}" required></td>
        </tr>
	
	
	
	
	</table>



	<input type="submit" value="Submit"/>



</form>



</body>
</html>