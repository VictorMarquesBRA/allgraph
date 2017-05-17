<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${user != null}">
    <c:redirect url="${pageContext.request.contextPath}/user/feed.jsp"></c:redirect>
</c:if>

<%@include file="WEB-INF/jspf/header.jspf" %>
<div id="novo-graphite">
    <div id="novo-graphite-menu">
        <div id="novo-graphite-menu-top">Novo grafite</div>
        <div id="novo-graphite-menu-form">
            <form method="post" action="../FrontController">
                <input name="name" type="text" placeholder="Nome do grafite" />
                <input name="cep" type="text" placeholder="CEP" />
                <input name="img" type="file" placeholder="imagem" />
                <input name="cmd" type="hidden" value="CadastrarGrafite" />
                <button type="submit">Grafitar</button>
            </form>
            <div id="novo-graphite-menu-close" onclick="javascript:closeNewGraphite();">Fechar</div>
        </div>
    </div>
</div>
<div id="top">
    <a id="logo-text" href="feed.jsp" title="Atualizar">AllGraph</a>
</div>
<div class="container">
    <div id="button-new"><span class="button-new-graph" onclick="javascript:openNewGraphite();" title="Criar novo grafite">Cadastrar novo grafite</span></div>
</div>
<div id="galeriaFotos">
    <div class="grafite"><img src="../img/exemplo.jpg" alt="grafite" title="${grafite.nome}" /></div>
    <div class="grafite"><img src="../img/exemplo.jpg" alt="grafite" title="${grafite.nome}" /></div>
    <div class="grafite"><img src="../img/exemplo.jpg" alt="grafite" title="${grafite.nome}" /></div>
    <div class="grafite"><img src="../img/exemplo.jpg" alt="grafite" title="${grafite.nome}" /></div>
    <div class="grafite"><img src="../img/exemplo.jpg" alt="grafite" title="${grafite.nome}" /></div>
</div>
<%@include file="WEB-INF/jspf/footer.jspf" %>