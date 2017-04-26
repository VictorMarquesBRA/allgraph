<%@include file="../WEB-INF/jspf/header.jspf" %>

    <h1>Hello, ${user.name}!</h1>
    
    <a href="${pageContext.request.contextPath}/FrontController?cmd=Logout">Logout</a>

<%@include file="../WEB-INF/jspf/footer.jspf" %>
