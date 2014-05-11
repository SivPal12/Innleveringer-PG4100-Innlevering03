<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Prime checker</title>
</head>
<body>

<h1>Prime checker</h1>

<form>
	<label>Skriv inn et tall for å sjekke om det er primtall</label>
	<input name="number" pattern="^[1-9]\d*$" title="Enter positive number"/>
	<input type="submit" value="Send"/>
</form>

<c:out value="${result}"></c:out>

</body>
</html>