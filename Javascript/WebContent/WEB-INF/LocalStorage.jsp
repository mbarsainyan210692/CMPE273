<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form onsubmit="submit()">
<label>User Name :</label>
<input type="text" id="username" onChange="saveUserName()" >
<br>
<label>Password :</label>
<input type="password" id="password" required >
<br>
<label>Email id:</label>
<input type="text" id="email" onChange="saveemail()">
<br>
<label>Phone no: :</label>
<input type="text" id="phone" onChange="savePhone()" >
<br>
<input type="checkbox" id="remember" onChange="savePassword()"><label>Remember me</label>
<br>
<br>

<button onClick="">Submit</button>
</form>
<script>
function saveUserName()
{
	sessionStorage.setItem("username", document.getElementById('username').value);
	
}
function savePassword()
{
	if(document.getElementById('remember').checked)
		{
		localStorage.setItem("username", document.getElementById('username').value);
		localStorage.setItem("password", document.getElementById('password').value);
		}
	else
	{
		localStorage.removeItem("username");
		localStorage.removeItem("password");
	}
}
function saveemail()
{
	sessionStorage.setItem("email", document.getElementById('email').value);
	
}
function savePhone()
{
	sessionStorage.setItem("phone", document.getElementById('phone').value);
	
}
function submit()
{
	
	}
	
var username=localStorage.getItem("username");
document.getElementById('username').value=username;
var password=localStorage.getItem("password");
document.getElementById('password').value=password;
var email=sessionStorage.getItem("email");
document.getElementById('email').value=email;
var phone=sessionStorage.getItem("phone");
document.getElementById('phone').value=phone;

</script>
</body>
</html>