<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function hello()
{
	
	var message1 = document.getElementById("message1");
	var message2 = document.getElementById("message2");
	var message3 = document.getElementById("message3");
	var team = ["csk","dd","rr","kkr","srh","mi","rcb","kxip"];
	var a= Math.floor((Math.random()*6)+1);
	message1.innerHTML="<h1>"+team[a]+" vs "+team[a+1];
	message2.innerHTML="<h2>Score: "+Math.floor((Math.random()*200)+1)+"/"+Math.floor((Math.random()*10)+1);
	message3.innerHTML="<h3>Overs: "+Math.floor((Math.random()*20)+1)+"."+Math.floor((Math.random()*5)+1); 
	
}

</script>
<style>
th
{
		text-align: centre;
}
</style>

</head>
<body onload="return hello()">
<a href="Home.jsp">Home</a>
</body>
<br/>
<div id="message1">Message will come here </div>
<div id="message2">Message will come here </div>
<div id="message3">Message will come here </div>
</html>