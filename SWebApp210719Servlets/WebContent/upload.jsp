<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejemplo de Subida de Archivo</title>
</head>

<body>    
    <div>FileUpload Apache </div>
    <form method="post" action="multiPartServlet" enctype="multipart/form-data">
        Buscar Archivo: 
        <input type="file" name="multiPartServle"/>
        <input type="submit" value="Enviar"/>
    </form>
</body>
</html>