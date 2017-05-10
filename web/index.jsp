<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${user != null}">
    <c:redirect url="${pageContext.request.contextPath}/user/feed.jsp"></c:redirect>
</c:if>

<%@include file="WEB-INF/jspf/header.jspf" %>

<div class="containerLogin">
    <form  id="formularioCadastro" action="FrontController" method="POST">
        <img alt="allgraph" src="img/titulo.png" title="AllGraph Logo"/>
        <h2>Cadastro</h2>
        <input name="username" type="text" placeholder="Nome de usuário" />
        <input name="name" type="text" placeholder="Nome completo" />
        <input name="email" type="email" placeholder="Email"/>
        <input name="password" type="password" placeholder="Senha" /> 
        <input name="password_to_verify" type="password" placeholder="Confirmar senha" /> 
        <input name="cmd" type="hidden" value="Cadastrar" />
        <c:choose>
            <c:when test="${error == 'Usuário já cadastrado'}">
                <span class="error">Usuário já cadastrado</span>
            </c:when>
            <c:when test="${error == 'Há campos em branco ou senhas não são iguais'}">
                <span class="error">Há campos em branco ou senhas não são iguais</span>
            </c:when>
        </c:choose>
        <button type="submit">Cadastrar</button>
    </form>
    <form id="formularioLogin" action="FrontController" method="POST">
        <h2>Login</h2>
        <input name="email" type="email" placeholder="Email" />
        <input name="password" type="password" placeholder="Senha" /> 
        <input name="cmd" type="hidden" value="Login" />
        <button type="submit">Login</button>
    </form>
</div>

<%@include file="WEB-INF/jspf/footer.jspf" %>