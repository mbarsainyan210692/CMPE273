<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<button onclick='myFunc()'>Click me to visit my website</button>
<br>
<br>
<br>
<div id ="visited"></div>
</body>

<script type="text/javascript">
var i=0;
var myFunc =function() {	
i ++;
document.getElementById('visited').innerHTML="Visited "+i+" times";
}

</script>
</html>