<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<script>
		var temp = [ 98, 98, 99, 100, 102, 100, 98 ];

		var fLen = temp.length;
		for (var i = 0; i < fLen; i++) {
			if (temp[i] > 104) {
				var x = "Call Doctor"
			} else {
				var x = "No need to call the doctor";
			}
		}
		alert(x);
	</script>
</body>
</html>