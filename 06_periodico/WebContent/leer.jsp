<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca de noticias</title>
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
 
			
</head>
<body>
<h2>Consulta aquí las noticias actuales</h2>

<a href="Consultar">Leer noticias</a>
<br>
<p>
<table>

<%
//String msg =(String)session.getAttribute("servletMsg");
//if (msg!=null){
//	out.println(msg);
	
//}

String resultado =(String)session.getAttribute("servletMsg");
if (resultado!=null){
	
	out.println(resultado);
}



%>
</table>
</p>
      <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>

</body>
</html>