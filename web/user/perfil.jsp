<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${user != null}">
    <c:redirect url="${pageContext.request.contextPath}/user/feed.jsp"></c:redirect>
</c:if>

<%@include file="WEB-INF/jspf/header.jspf" %>

<div id="top">
            <a id="logo-text" href="feed.jsp" title="Atualizar">AllGraph</a>
        </div>
        <div id="containerPerfil">
            <div id="headerPerfil">
                Editar perfil de ${usuario.nome}
            </div>
            <div id="formPerfilImage">
                <img src="../img/default-user.png">
                <form method="post" action="../FrontController">
                <input name="img" type="file" placeholder="imagem" />
                <input name="cmd" type="hidden" value="AlterarImagem" />
                <button type="submit">Salvar</button>
                </form>
            </div>
            <div id="formPerfil">
                <form method="post" action="../FrontController">
                    <input name="username" type="text" placeholder="Nome de usuário" value="${user.username}" />
                    <input name="name" type="text" placeholder="Nome completo" value="${user.name}" />
                    <input name="email" type="email" placeholder="Email" value="${user.email}"/>
                    <input name="password" type="password" placeholder="Senha" /> 
                    <input name="password_to_verify" type="password" placeholder="Confirmar senha" /> 
                    <input name="cmd" type="hidden" value="AlterarCadastro" />
                    <button type="submit">Salvar</button>
                </form>
            </div>
        </div>

<%@include file="WEB-INF/jspf/footer.jspf" %>