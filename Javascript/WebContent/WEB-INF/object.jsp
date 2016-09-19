<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<label>Name :</label>
<input type="text" id="name"/>
<label>Age :</label>
<input type="number" id="age"/>
<button onclick="checkEligibility()">Check Eligibility</button>
<div id="div1"></div>
<script>
function Person(name,age)
{
	debugger
	this.name=name;
	this.age=age;
	this.getEligibility=eligible(age);
	}
	
	function eligible(age)
	{
		debugger
		var currYear=new Date().getFullYear();
		var birthYear=currYear-age;
		if(birthYear<1976)
			{
			return true;
			}
		return false;
	}
	
	function checkEligibility()
	{
		debugger
		console.log(age);
		var p=new Person(document.getElementById('name').value,parseInt(document.getElementById('age').value));
		var el=p.getEligibility;
		if(p.getEligibility==true)
			{
			alert("You are eligible")
			}
		else
			{
			alert("Sorry you are not eligible");
			}
	}
</script>
</body>
</html>