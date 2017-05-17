<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="../img/logo_icone.ico" type="imag/x-icon" />
        <title>AllGraph</title>
        <meta charset="utf-8">
        <link href="https://fonts.googleapis.com/css?family=Satisfy" rel="stylesheet">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="top">
            <a id="logo-text" href="feed.jsp" title="Atualizar">AllGraph</a>
        </div>

        <!--Menu -->    
        <div id="menu">
            <h2 class="safisty">Olá, ${user.name}</h2>
            <img id="menu-user-image" src="../img/default-user.png" alt="User Image"/>
            <div id="menu-buttons">
                <a class="menu-button" href="#" title="Perfil"><i class="material-icons">account_box</i></a> 
                <a class="menu-button" href="#" title="Galeria"><i class="material-icons">photo_library</i></a>
                <a class="menu-button" href="${pageContext.request.contextPath}/FrontController?cmd=Logout" title="Sair"><i class="material-icons">close</i></a>
            </div>
        </div>

        <!--Post -->
        <div class="post">
            <div class="post-title"><p>${poster.owner.name}, ${poster.name}</p></div>
            <div class="post-image-div"><img class="post-image" src="../img/exemplo.jpg" alt="post" title="exemplo"></div>
            <div class="post-footer"><a class="footer-button like" href="#" title="like"><i class="material-icons">thumb_up</i></a></div>
            <!--<i class="material-icons">thumb_down</i>-->
        </div>

        <div class="post">
            <div class="post-title"><p>${poster.owner.name}, ${poster.name}</p></div>
            <div class="post-image-div"><img class="post-image" src="../img/exemplo.jpg" alt="post" title="exemplo"></div>
            <div class="post-footer"><a class="footer-button like" href="#" title="like"><i class="material-icons">thumb_up</i></a></div>
            <!--<i class="material-icons">thumb_down</i>-->
        </div>
    </body>
</html>