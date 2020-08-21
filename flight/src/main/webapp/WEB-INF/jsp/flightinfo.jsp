<html>
<head>
<title>Flight  Page</title>
</head>
<body>
   please enter airline Name:
   <form method="get" action="/">
<input type="text" name="airlineName"><br>
 <input type="submit"  name="VERIFY"/>
   </form>
</body>
</html>



<html>
<head>
<title>Flight  Page</title>
</head>
<body>
<form method="Get" action="/downloadFile/">
<c:forEach var="flight" items="${databaseFile}">  
   please enter airline Name:
<input type="${airlineName}" name="airlineName"><br>
 <input type="submit"  name="VERIFY"/>
 </c:forEach>
   </form>
</body>
</html>



<td><img src="data:image/jpg;base64,"+encodedImage;${flight.flightticketPhoto}" width="240" height="300"/></td>