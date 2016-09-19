<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<button onclick="getQueryPerformance()">Get Query Performance</button>
<button onclick="noOfQueries()">Get No of Queries run in last ten minutes</button>
<button onclick="getQueryTime()">Get Average Query Time</button>
<button onclick="getQueriesRunning()">Get No of Queries running</button>
<div id="showDetails"></div>
<script>
var text = '{"queries":[' +
'{"QueryPerformane":"78%","NoOfQueries":"97","QueryTime":"10sec","QueriesRunning":"147" }]}';

obj = JSON.parse(text);
console.log(obj.queries[0]);
function getQueryPerformance()
{
	document.getElementById("showDetails").innerHTML =
		obj.queries[0].QueryPerformane;
	}
function noOfQueries()
{
	document.getElementById("showDetails").innerHTML =
		obj.queries[0].NoOfQueries;
	}
function getQueryTime()
{
	document.getElementById("showDetails").innerHTML =
		obj.queries[0].QueryTime;
	}
function getQueriesRunning()
{
	document.getElementById("showDetails").innerHTML =
		obj.queries[0].QueriesRunning;
}
</script>

</body>
</html>