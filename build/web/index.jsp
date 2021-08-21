<%-- 
    Document   : index
    Created on : 21/ago/2021, 12:51:12
    Author     : mfernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Formulário de Login</h2>
        <form class="" action="LoginController">
            <input type="text" class="" name="utilizador" id="utilizador" value="" placeholder="Digite o seu Utilizador" required>
            <input type="password" class="" name="passe" id="passe" value="" placeholder="Digite a sua Palavra-passe" required>
            <input type="submit">
        </form>
    </body>
</html>
