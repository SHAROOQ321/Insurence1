<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, label {
  width: 50%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>
<h2 align="center">Vehicle</h2>
<div class="container">
  <form action="/vehicle/success" method="post">
    <label for="fname">Year of Make</label>
  	<select name="year" id="year">
		<option value="auto">Auto</option>
		<option value="health">Health</option>
		<option value="mortgage">Mortgage</option>
	</select>
<br/>
    <label for="lname">Make of Car</label>
    <select name="make" id="make">
		<option value="auto">Auto</option>
		<option value="health">Health</option>
		<option value="mortgage">Mortgage</option>
	</select>
<br/>    
    <label for="address">Model of Car</label>
    <select name="address" id="address">
		<option value="auto">Auto</option>
		<option value="health">Health</option>
		<option value="mortgage">Mortgage</option>
	</select>
<br/>
    <label for="city">Body Style</label>
    <select name="bodytype" id="bodytype">
		<option value="auto">Auto</option>
		<option value="health">Health</option>
		<option value="mortgage">Mortgage</option>
	</select>
<br/>    
    <label for="city">Vehicle Type</label>
    <select name="vehicletype" id="vehicletype">
		<option value="auto">Auto</option>
		<option value="health">Health</option>
		<option value="mortgage">Mortgage</option>
	</select>
<br/>
    <label for="dob">Estimated Mileage</label>
    <select name="mileage" id="mileage">
		<option value="auto">Auto</option>
		<option value="health">Health</option>
		<option value="mortgage">Mortgage</option>
	</select>
<br/>
    <input type="submit" value="Next">
  </form>
</div>
</body>
</html>