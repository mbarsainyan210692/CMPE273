<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<label>Maths : </label>
<input type="number" id="maths"/>
<label>Physics : </label>
<input type="number" id="physics"/>
<label>Chemistry : </label>
<input type="number" id="chemistry"/>
<button onclick="calculateGrade()">Calculate</button>
<br>
<div id="grade"></div>
<script>
function calculateGrade()
{
	var maths=parseInt(document.getElementById('maths').value);
	var physics=parseInt(document.getElementById('physics').value);
	var chemistry=parseInt(document.getElementById('chemistry').value);
	var total=maths+physics+chemistry;
	console.log(total);
	var grade="F";
	if(total>=250)
		{
		console.log(total);
		grade="A";
		}
	else if(total>=200&&total<250)
	{
		console.log(total);
	grade="B";
	}
	else if(total>=150&&total<200)
	{
		console.log(total);
	grade="C";
	}
	else if(total>=100&&total<150)
	{
		console.log(total);
	grade="D";
	}
	document.getElementById('grade').innerHTML="<h4>Student's grade is :"+grade+"</h4>"
}
</script>
</body>
</html>