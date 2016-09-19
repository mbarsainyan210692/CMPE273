<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
<label>Student Id :</label>
<input type='text' id='studentid' autofocus>
<br>
<label>User Name :</label>
<input type='text' id='username' pattern="[A-Za-z]{3}" >
<br>
<label>Password :</label>
<input type='text' id='password' required>
<br>
<label>Email :</label>
<input type="email" id='email' placeholder="abc@abc.com" >
<br>
<label>Phone no: </label>
<input type="tel"  id='phone' pattern='[\+]\d{1}[\(]\d{3}[\)]\d{3}[\-]\d{4}'>
<br>
<button type="submit" >submit</button>
</form>
<script>
function submitForm()
{
alert("done");	
	
}
</script>
</body>
</html>