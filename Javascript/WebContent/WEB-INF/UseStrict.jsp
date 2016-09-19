<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Use Strict</title>
</head>
<body>


<input type="button" value="Undefined Variable" onclick="noVarError()"/>
<br>
<br>
<input type="button" value="Undefined Function" onclick="deleteVariable()"/>
<br>
<br>
<p id="output"></p>
<p id="o"></p>
<script>

    var noVarError = function () {
        'use strict';
        try{
            a =3;
        }
        catch(err) {
            document.getElementById("output").innerHTML = err.message;
        }

    };

    var deleteVariable = function(){
        'use strict';
        try{
            if (true) {
                function foo() {
                }
            }
            return foo;
        }
        catch(err) {
            document.getElementById("output").innerHTML = err.message;
        }
    }

</script>
</body>
</html>