<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!--

 
@Pratik Patel
@Tuesday, February 17, 2026
 
Description - Here is the form, where the User will enter all information, such as 
			  the Full Name, Email, etc. This code redirects to another page after correct inputs.
			  The code uses form validation to make sure correct information is being
			  added and to stop SQL injection into the data. 


-->


<form action="<%=request.getContextPath()%>/MidtermServlet" method="post">




	<table style="width: 100%; border-collapse: collapse;">
	
		<!-- Required to enter FullName and a field to only allow characters upto 50 width -->
		<tr>
            <td>Full Name:</td>
            <td><input type="text" name="fullName" pattern="[A-Za-z ]{1,50}" maxlength="50" required></td>
        </tr>
        
        <!-- Required to enter a mobile number that only allow 10 digits only -->
        <tr>
            <td>Contact Number:</td>
            <td><input type="text" name="contact" pattern="[0-9]{10}" maxlength="10"  required></td>
        </tr>
        
        
        <!-- Required to enter a email in standard email format -->
        <tr>
			<td>Email:</td>
			<td><input type="email" name="email" required /></td>
					
		</tr>
		
		
		<!-- Required to enter a date that only permit dates format only -->
		<tr>
			<td>Date Available:</td>
			<td><input type="date" name="dateAvailable" required /></td>
		</tr>
		
		
		
		<!-- Required to enter a salary in decimal notation values up to 6 digits followed by 2 precision values like $999900.60 -->
		<tr>
            <td>Salary:</td>
            <td><input type="text" name="salary" pattern="0\.00|0\.[0-9]{2}|[1-9][0-9]{0,5}\.[0-9]{2}" required></td>
        </tr>
	
	
	
	
	</table>



	<input type="submit" value="Submit"/>



</form>



</body>
</html>