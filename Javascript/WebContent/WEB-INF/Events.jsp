<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h2>Chose a meal plan :</h2>
	<input type="checkbox"
		onclick="addToOrder('Meal1')" />
	<label id="meal1" onmouseover="showDetails('Meal1')"
		onmouseout="hideDetails()"> Meal1</label>
	<br>
	<input type="checkbox"
		onclick="addToOrder('Meal2')" />
	<label id="meal2" onmouseover="showDetails('Meal2')"
		onmouseout="hideDetails()"> Meal2</label>
	<br>
	<input type="checkbox"
		onclick="addToOrder('Meal3')" />
	<label id="meal3" onmouseover="showDetails('Meal3')" title="test"
		onmouseout="hideDetails()">Meal3</label>
	<button id="b1" onclick="placeOrder()">place order</button>
	<div id="description"></div>

	<br>
	<script>
		var order = new Array();
		var meals = new Array();
		var meal1 = new Meal("Meal1", "Vegetarian Meal");
		var meal2 = new Meal("Meal2", "Non Vegetarian Meal");
		var meal3 = new Meal("Meal3", "Fruit Platter");
		meals.push(meal1);
		meals.push(meal2);
		meals.push(meal3);
		function addToOrder(mealPlan) {
			console.log(mealPlan)
			var meal = getMeal(mealPlan);
			order.push(meal);
		}
		function Meal(name, description) {
			this.name = name;
			this.description = description;
		}
		function showDetails(name) {
			var meal = getMeal(name);
			document.getElementById('description').innerHTML = "<p>"
					+ meal.description + "</p>";
		}
		function hideDetails() {
			document.getElementById('description').innerHTML = "";
		}
		function placeOrder() {
			var text = "";
			text = text + "<h4>You have ordered:</h4><br><p><ul>";

			for (i = 0; i < order.length; i++) {
				text = text + "<li>" + order[i].name + " : "
						+ order[i].description + "</li>"
			}
			text = text + "<ul></p>";
			document.getElementById('description').innerHTML = text;
		}
		function getMeal(name) {
			var meal = new Meal();
			for (i = 0; i < meals.length; i++) {
				if (meals[i].name == name) {
					meal = meals[i];
				}
			}
			
			return meal;
		}
	</script>

</body>
</html>