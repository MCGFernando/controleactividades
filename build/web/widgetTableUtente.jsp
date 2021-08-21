<%-- 
    Document   : tableWidget
    Created on : 21/ago/2021, 12:49:43
    Author     : mfernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table>
    <thead>
        <tr>
            <th>ID Utente</th>
            <th>Nome Utente</th>
            <th>External Code</th>
            <th>Nascimento</th>
            <th>Entidade</th>
            <th>Acao</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="obj" items="${objList}">
            <tr>
                <td>${obj}</td>
                <td>${obj}</td>
                <td>${obj}</td>
                <td>${obj}</td>
                <td>${obj}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>