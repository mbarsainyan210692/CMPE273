<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Convert Strings to other types:</h3>

<label>Enter your string</label>
<input type='text' id="convertStringToOtherTypes"/>

<input type="button" onclick="convert()" value="Convert">
<p id="output"></p>

<script>
var convert = function () {
    var stringValue = document.getElementById("convertStringToOtherTypes").value,
            booleanValue,
            numberValue;
stringValue=stringValue.toString();
    document.getElementById("output").innerHTML=
            "String to Number : " + Number(stringValue) + "<br>" +
            "String to String : " + String(stringValue) + "<br>" +
            "String to Boolean: " + Boolean(stringValue);
}


</script>
</body>
</html>