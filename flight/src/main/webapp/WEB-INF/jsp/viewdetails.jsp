<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
<head>
</head>
<body style="background-color: lightblue;">
<h1  style="margin-left:400px;">Flight Details List</h1>  
<table border="8" width="50%" cellpadding="20" style="margin-left:auto;margin-right:auto;margin-top:0px;margin-bottom:100px;">
	<tr>
    <th id="id">ID</th>
    <th id="airlineName">Airline Name</th>
    <th id="source">Source</th>
    <th id="destination">Destination</th>
    <th id="duration"> Duration </th>
    <th id="details"> Insurance Selected </th>
    <th id="flightticketPhoto"> Flight Ticket </th>
  </tr>  
   <c:forEach var="flight" items="${databaseFile}">   
   <tr>  
   <td>${flight.id}</td>  
   <td>${flight.airlineName}</td>  
   <td>${flight.source}</td>  
   <td>${flight.destination}</td>  
   <td>${flight.duration}</td>
   <td>${flight.details}</td>  
   <td><img width="100" height="100" src="value='${flight.flightticketPhoto}"></td>
   </tr>    
    <br/>
   </c:forEach>  
   </table>  
   </body>  
</html>

 <html>
<body>
<form method="Get" action="/paymentdetails/">
<h1><input type="radio" id="credit-card" name="payment" value="credit-card">
<label for="credit-card">Credit Card</label><br>
<input type="radio" id="debit-card" name="payment" value="debit-card">
<label for="debit-card">Debit Card</label><br>
<input type="radio" id="credit-card" name="payment" value="other">
<label for="other">Other</label></h1>
<br>
 <input type="submit"  value="Paynow"/>
 </form>
</body>
</html>

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
