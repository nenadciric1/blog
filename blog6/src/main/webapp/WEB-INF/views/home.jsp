<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1> 
<form action="HomeController.java" method="get">
  <p> Unesi Blog: <textarea name="Blog" rows="2" cols="110">Unesi Post</textarea></p>
   <p>Unesi Username: <input type="text" name="uname"><br></p>
   
      <button type="submit" formaction="HomeController.java">Potvrdi</button>
</form>

	Hello world!
</h1>
${controllerMessage}
</body>
</html>
