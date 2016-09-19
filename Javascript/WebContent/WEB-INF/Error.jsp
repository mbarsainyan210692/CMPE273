<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<label style="width: 60">Name :</label>
<input type="text" id="name"/>
<br>
<br>
<label style="width: 60px">Chose a UserName :</label>
<input type="text" id="username"/>
<button onclick="checkName()">Verify</button>
<br>
<br>
<label>Chose a password :</label>
<input type="text" id="password"/>
<button onclick="checkPassword()">Verify</button>
<br>
<br>
<label>Email id :</label>
<input type="text" id="email"/>
<button onclick="checkEmail()">Verify</button>
<br>
<br>
<div id="response"></div>
<br>
<button onClick="doNothing()">Submit</button>
<script>
function checkName()
{
	
	var name= document.getElementById('username').value;
	try{
	if(name==undefined||name.length==0)
		{
		throw "Username empty";
		}
	if(name.length<6)
	{
	throw "Username is too small";
	}
	else
	{
	document.getElementById('response').innerHTML ="";
	}
	}
	
	catch(err)
	{
		document.getElementById('response').innerHTML =err;
	}
}
function checkPassword()
{
	var pwd= document.getElementById('password').value;
	try{
	if(pwd==undefined||pwd.length==0)
		{
		throw "Password empty";
		}
	if(pwd.length<8)
	{
	throw "Password is too small";
	}
	else
	{
	document.getElementById('response').innerHTML ="";
	}
	}
	catch(err)
	{
		document.getElementById('response').innerHTML =err;
	}
}
function checkEmail()
{
	var email= document.getElementById('email').value;
	try{
	if(email==undefined||email.length==0)
		{
		throw "Email empty";
		}
	if(!email.includes('.com'))
	{
	throw "Please enter correct email id";
	}
	else
		{
		document.getElementById('response').innerHTML ="";
		}
	}
	catch(err)
	{
		document.getElementById('response').innerHTML =err;
	}
}
</script>
</body>
</html>