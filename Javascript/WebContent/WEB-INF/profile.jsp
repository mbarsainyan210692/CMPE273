<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>About me: </h1>
<img id="output"  style=" max-width: 160px; max-height: 120px; border: none;"/>
<br>
<label>upload Profile picture</label>
<input type="file" accept="image/*" onchange="loadFile(event)">
<br>

<label> My videos: </label>
<label>Upload videos here :</label>
<video width="400" controls>
  <source src="file:///C:/Users/New/Pictures/Camera Roll" type="video/mp4">
 
</video>

<p>
Video courtesy of
<a href="https://www.youtube.com/watch?v=MKkDF2LhV20" target="_blank">Big Buck Bunny</a>.
</p>

<script>
  var loadFile = function(event) {
    var output = document.getElementById('output');
    output.src = URL.createObjectURL(event.target.files[0]);
  };
</script>
 
</body>
</html>