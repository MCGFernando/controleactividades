<%-- 
    Document   : addUtente
    Created on : 21/ago/2021, 15:30:01
    Author     : mfernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <label for="">ID Utente</label>
        <input type="" class="" name="" id="" value="${obj}" readonly="">
        <label for="">Utente</label>
        <input type="" class="" name="" id="" value="${obj}" readonly="">
        <label for="">Nascimento</label>
        <input type="" class="" name="" id="" value="${obj}" readonly="">
        <label for="">Entidade</label>
        <select class="" name="" id="" required="">
            <option value=""></option>
            <option value="${obj}">${obj}</option>
        </select>
        <label for="">Médico</label>
        <select class="" name="" id="" required="">
            <option value=""></option>
            <option value="${obj}">${obj}</option>
        </select>
        <label for="">Médico</label>
        <select class="" name="" id="" required="">
            <option value=""></option>
            <option value="${obj}">${obj}</option>
        </select>
        <label for="">Area</label>
        <select class="" name="" id="" required="">
            <option value=""></option>
            <option value="${obj}">${obj}</option>
        </select>
        <label for="">Quarto</label>
        <input type="" class="" name="" id="" value="${obj}" >
        <label for="">Cama</label>
        <input type="" class="" name="" id="" value="${obj}" >
        <label for="">Data Entrada</label>
        <input type="" class="" name="" id="" value="${obj}" >
        <label for="">Informções Adicionais</label>
        <textarea name=""></textarea>
    </body>
</html>
