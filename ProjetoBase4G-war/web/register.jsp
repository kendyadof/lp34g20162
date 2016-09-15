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
            <form action="Controller" method="POST">
                <h1>Register</h1>
                <input type="hidden" name="command" value="Userlp3.register"/>
                <p>
                    <label for="username">Username:</label><br>
                    <input type="text" name="username" id="username" placeholder="username" required/>
                </p>
            
                <p>
                    <label for="password">Password:</label><br>
                    <input type="password" name="password" id="password" placeholder="password" required/>
                </p>
                <p>

                    <input type="password" name="password2" id="password2" placeholder="confirm password" required/>
                </p>
                <p>
                    <label for="firstname">Firstname:</label><br>
                    <input type="text" name="firstname" id="firstname" placeholder="firstname" required/>
                </p>
                <p>
                    <label for="lastname">Lastname:</label><br>
                    <input type="text" name="lastname" id="lastname" placeholder="lastname" required/>
                </p>
                <p>
                    <label for="email">email:</label><br>
                    <input type="email" name="email" id="email" placeholder="email" required/>
                </p>
                
                <p>
                    <input type="date" name="birthday" id="birthday" required/>
                    <label for="birthday">Birthday</label>
                </p>
                <p id="submitcontainer">
                    <input type="submit" value="REGISTER"/>
                </p>
            </form>
        </section>
    </body>
</html>
