<%-- 
    Document   : index.jsp
    Created on : 25/08/2016, 09:19:31
    Author     : 1147106
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INDEX</title>
        
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section id="loginsection">
            <h1>ERROR</h1>
            <p>${error}</p>
            <c:set var="error" scope="session" value=""></c:set>
            <p>¯\_(ツ)_/¯</p>
        </section>
    </body>
</html>
