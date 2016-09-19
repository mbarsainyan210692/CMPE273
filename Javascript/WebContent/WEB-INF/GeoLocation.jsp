<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Geo Location</title>
</head>
<body>


<label>Target Location's latitude: </label><input type="text" id="secondlatitude"/>
<br>
<br>
<label>Target Location's longitude: </label><input type="text" id="secondlongitude"/>
<br>
<br>
<input type="button" value="Show Distance" onclick="getLocation()">

<p id="output"></p>


<script>
    var x = document.getElementById("demo");
    var latitude1,latitude2, longitude1, longitude2, earthRadius= 6371; // Radius of the earth in km;
    function getLocation() {
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(showPosition);
        } else {
            x.innerHTML = "Geolocation is not supported by this browser.";
        }
    }

    function showPosition(position) {
        latitude1 = position.coords.latitude;
        longitude1 = position.coords.longitude;
        showDistance();
    }


    var showDistance = function () {
        //getLocation();
        latitude2 = document.getElementById("secondlatitude").value;
        longitude2 = document.getElementById("secondlongitude").value;
        var distanceInLatitude = (latitude2 - latitude1); // Javascript functions in radians
        var distanceInLongitude = (longitude2-longitude1);
        var a = Math.sin(distanceInLatitude/2) * Math.sin(distanceInLatitude/2) +
                Math.cos(latitude1) * Math.cos(latitude2) *
                Math.sin(distanceInLongitude/2) * Math.sin(distanceInLongitude/2);

        var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        var d = earthRadius * c; // Distance in km
        document.getElementById("output").innerHTML = 'Your latitude: '+latitude1+ '<br>'+
                'Your longitude: '+ longitude1+ '<br>'
                + 'Target latitude: '+ latitude2 + '<br>'+
                'Your longitude: '+ longitude2+ '<br>'+
                'Total Distance: ' + d+' meters';

    }
</script>
</body>
</html>