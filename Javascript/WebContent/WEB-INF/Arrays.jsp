<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<label>Name : </label>
	<input type="text" id="name" />
	<label>Age : </label>
	<input type="text" id="age" />

	<button
		onclick="addToList(document.getElementById('name').value,document.getElementById('age').value)">Join
		now!</button>
	<br>
	<br>
	<hr>
	<h4>Existing users -:</h4>
	<div id="list"></div>
	<script>
		var arr = new Array();
		function addToList(name, age) {
			var member = new Member(name, age);
			arr.push(member);
			prepList();
		}
		function prepList() {

			var text = "<h4 color=\'red\'>" + "&emsp;&emsp;" + "Name"
					+ "&emsp;&emsp;" + "Age" + "</h4>";
			text += "<ul>";

			for (i = 0; i < arr.length; i++) {
				text = text + "<li>" + arr[i].name + "&emsp;&emsp;"
						+ arr[i].age + "</li>"
			}
			text = text + "</ul>"
			document.getElementById('list').innerHTML = text;
		}
		function Member(name, age) {
			this.name = name;
			this.age = age;

		}
	</script>
</body>
</html>