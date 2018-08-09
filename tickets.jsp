<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Match Tickets</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<script type="text/javascript">
function ticketInfo()
{
	var message1 = document.getElementById("message1");
	var message2 = document.getElementById("message2");
	var fixture = document.getElementById("info").value;
	var price = document.getElementById("class").value;
    var number = document.getElementById("number").value;
    var totalCost = price * number;
	message1.innerHTML = fixture;
	message2.innerHTML ="Your total cost is "+totalCost;
	message3.innerHTML = "<a href =\"tickets.jsp\">Click here to book more tickets.</a>";
	return false; 
}
</script>
<h1>
Buy your tickets here</h1>

<form method="post" onsubmit="return ticketInfo()">
	<table>
	<th><td>Date</td><td>Fixture</td><td>Venue</td><td>Time</td></th>
	<tr><td><input type="radio"  id="info" name="info"  value="May 13	for Mumbai Indian vs Rajasthan Royals in Mumbai	at 8:00 PM" ></input></td><td>May 13</td><td>Mumbai Indian vs Rajasthan Royals</td><td>Mumbai</td><td>8:00 PM</td></tr>
	<tr><td><input type="radio"  id="info"name="info"  value="May 14	for Kings XI Punjab vs Royal Challengers Bangalore in Mohali at	8:00 PM" ></input></td><td>May 14</td><td>Kings XI Punjab	vs Royal Challengers Bangalore</td><td>Mohali</td><td>8:00 PM</td></tr>
	<tr><td><input type="radio"  id="info"name="info"  value="May 15	for Kolkata Knight Riders vs Rajasthan Royals in Kolkata at 8:00 PM" ></input></td><td>May 15</td><td>Kolkata Knight Riders vs Rajasthan Royals</td><td>Kolkata</td><td>8:00 PM</td></tr>
	<tr><td><input type="radio"  id="info"name="info"  value="May 16	for Mumbai Indians vs Kings XI Punjab in Mumbai	at 8:00 PM" ></input></td><td>May 16</td><td>Mumbai Indians vs Kings XI Punjab</td><td>Mumbai</td><td>8:00 PM</td></tr>
	<tr><td><input type="radio"  id="info"name="info"  value="May 17	for Royal Challengers Bangalore vs Sunrisers Hyderabad in Bangalore at 8:00 PM" ></input></td><td>May 17</td><td>Royal Challengers Bangalore vs Sunrisers Hyderabad</td><td>Bangalore</td><td>8:00 PM</td></tr>
	<tr><td><input type="radio"  id="info"name="info"  value="May 18	for Delhi Daredevils vs Chennai Super Kings in Delhi at 8:00 PM" ></input></td><td>May 18</td><td>Delhi Daredevils vs Chennai Super Kings</td><td>Delhi</td><td>8:00 PM</td></tr>
	<tr><td><input type="radio"  id="info"name="info"  value="May 19	for Rajasthan Royals vs Royal Challengers Bangalore in Jaipur at 4:00 PM" ></input></td><td>May 19</td><td>Rajasthan Royals vs Royal Challengers Bangalore	</td><td>Jaipur</td><td>4:00 PM</td></tr>
	<tr><td><input type="radio" id="info" name="info"  value="May 19	for Sunrisers Hyderabad vs Kolkata Knight Riders in Hyderabad at 8:00 PM" ></input></td><td>May 19</td><td>Sunrisers Hyderabad vs Kolkata Knight Riders</td><td>Hyderabad</td><td>8:00 PM</td></tr>
	<tr><td><input type="radio" id="info" name="info"  value="May 20	for Delhi Daredevils vs Mumbai Indians	in Delhi at 4:00 PM" ></input></td><td>May 20</td><td>Delhi Daredevils vs Mumbai Indians</td><td>Delhi</td><td>4:00 PM</td></tr>
	<tr><td><input type="radio"  id="info"name="info"  value="May 20	for Chennai Super Kings vs Kings XI Punjab in Chennai at 8:00 PM" ></input></td><td>May 20</td><td>Chennai Super Kings vs Kings XI Punjab</td><td>Chennai</td><td>8:00 PM</td></tr>
	</table>
	<br>
	<br>
	<table>
	<tr><td>Number of tickets : </td><td><input type="number"  id="number" ></td></tr>
	</table>
	<br>
	<br>
	<table>
	<th><td>Class</td><td>Cost</td></th>
	<tr><td><input type="radio"  id="class" name="class"  value=8000></input></td><td>Lounge</td><td>Rs. 8000</td></tr>
	<tr><td><input type="radio"  id="class" name="class"  value=4000></input></td><td>First Class</td><td>Rs. 4000</td></tr>
	<tr><td><input type="radio"  id="class" name="class"  value=2000></input></td><td>Second Class</td><td>Rs. 2000</td></tr>
	<tr><td><input type="radio" id="class"  name="class"  value=1000></input></td><td>Third Class</td><td>Rs. 1000</td></tr>
	</table>
	<br>
	<br>
	<input type="submit"  value="Get Tickets">
</form>
<br>
<br>
<div id="message1"></div>
<br>
<br>
<div id="message2"></div>
<br>
<br>
<div id="message3"></div>
</body>
</html>