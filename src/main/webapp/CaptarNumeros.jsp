<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplica��o e Redirecionamento</title>
</head>
<body>
	<h2>Digite dois n�meros</h2>
	<form action="ProcessarNumeros" method="post">
		<input type="number" name="num1" placeholder="N�mero 1" required>
        <input type="number" name="num2" placeholder="N�mero 2" required>
        <button type="submit">Calcular</button>
	</form>
</body>
</html>