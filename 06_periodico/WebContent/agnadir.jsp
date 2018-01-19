<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca de noticias</title>
</head>
<body>
<p> 
<h1>Añadir noticia</h1>
<br>
</p>

 <form action="Agnadir" method="post">
			<p>
			Mail: <input type="text" name="mail">
		</p>
		<p>
			Categoría: <input type="number" name="categoria">
		</p>
		<p>
			Título: <input type="text" name="titulo">
		</p>
		<p>
			Contenido: <input type="text" name="contenido">
		</p>

		<br> <input type="submit" value="Publicar">
	
  </form>
</body>
</html>