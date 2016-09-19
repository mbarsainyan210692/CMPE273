<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h3 id="welcome">Welcome Guest :</h3>
	<div id="div1">
		<button onclick="login()">Login</button>
		<button onclick="signup()">Sign Up</button>
	</div>
	<script>
		function login() {
			var str = document.getElementById('welcome').innerHTML;
			var txt = str.replace(/Guest/i, "User");
			document.getElementById('welcome').innerHTML = txt;
			var text = "";
			text += "<label>Username :</label>";
			text += "<input type=\"text\" id=\"username\"/>"
			text += "<label>Username :</label>";
			text += "<input type=\"password\" id=\"pwd\"/>"
			text += "<button>login</button>"
			document.getElementById('div1').innerHTML = text;
		}
		function signup() {
			var str = document.getElementById('welcome').innerHTML;
			var txt = str.replace(/Guest/i, "Future User");
			document.getElementById('welcome').innerHTML = txt;
			var text = "";
			text += "<label>Chose a username :</label>";
			text += "<input type=\"text\" id=\"username\"/>"
			text += "<label>Chose a password :</label>";
			text += "<input type=\"password\" id=\"pwd\"/>"
			text += "<button>login</button>"
			document.getElementById('div1').innerHTML = text;
		}
	</script>
</body>
</html>