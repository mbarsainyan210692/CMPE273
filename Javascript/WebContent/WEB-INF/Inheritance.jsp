<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form>
    <label>Customer Type:</label>
    <select id="customerType" onChange = "selectType()">
        <option >Please select the type</option>

        <option id="Gold" value="Gold" >Gold</option>
        <option id="Silver" value="silver">Silver</option>
    </select>

    <p id="output"></p>
</form>

<script>
    var customer = function() {

        this.wine = '';
        this.flowers ='';
        this.getContents = function() {
            return 'You have received '+ this.wine + ' and '+ this.flowers;
        };
        return this;
    };

    var gold = function() {
        this.wine = 'red wine';
        this.flowers = 'roses';
        return this;

    };
    var silver = function() {
        this.wine = 'white wine';
        this.flowers = 'lilies';

    };
    var selectType =function() {
        var type = document.getElementById("customerType").value;
        if(type === 'Gold') {
            gold.prototype = new customer();
            var g = new gold();
            document.getElementById("output").innerHTML = g.getContents();
        }
        else {
            silver.prototype = new customer();
            var s = new silver();
            document.getElementById("output").innerHTML = s.getContents();
        }
    };

</script>
</body>
</html>