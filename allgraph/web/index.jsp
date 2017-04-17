<%@include file="WEB-INF/jspf/header.jspf" %>

<div class="containerLogin">
    <form  id="formularioCadastro" action="CadastroController" method="POST">
        <img alt="allgraph" src="img/titulo.png" title="AllGraph Logo"/>
        <h2>Cadastro</h2>
        <input name="username" type="text" placeholder="Nome de usuário" />
        <input name="name" type="text" placeholder="Nome completo" />
        <input name="email" type="email" placeholder="Email"/>
        <input name="password" type="password" placeholder="Senha" /> 
        <input name="password_to_verify" type="password" placeholder="Confirmar senha" /> 
        <input name="cmd" type="hidden" value="Cadastrar" />
        <button type="submit">Cadastrar</button>
    </form>
    <form id="formularioLogin" action="LoginController" method="POST">
        <h2>Login</h2>
        <input name="email" type="email" placeholder="Email" />
        <input name="password" type="password" placeholder="Senha" /> 
        <input name="cmd" type="hidden" value="Login" />
        <button type="submit">Login</button>
    </form>
</div>

<%@include file="WEB-INF/jspf/footer.jspf" %>