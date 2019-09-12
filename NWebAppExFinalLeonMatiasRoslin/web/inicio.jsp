
<%@include file="pages/header2.jspf" %>


<%@include file="pages/navbar-principal.jspf" %>

<div class="container mt-5">
    <div class="jumbotron">
        <%if (perfil.equalsIgnoreCase("admin")) {%>
        <h1 class="display-4">Bienvenido Administrador!</h1>
        <p class="lead">Este es el Portal principal donde podra gestionar todo el Contenido</p>
        <%}%>
        <%if (perfil.equalsIgnoreCase("user")) {%>
        <h1 class="display-4">Bienvenido Estimado Usuario!</h1>
        <p class="lead">Este es el Portal principal donde podra gestionar sus consultas, citas medicas, etc</p>
        <%}%>
        <%if (perfil.equalsIgnoreCase("doc")) {%>
        <h1 class="display-4">Bienvenido Estimado Doctor!</h1>
        <p class="lead">Este es el Portal principal donde podra gestionar su trabajo</p>
        <%}%>

        <hr class="my-4">
        <p>Le pedimos que use el sistema de manera responsable, que tenga un excelente dia.</p>
        <a class="btn btn-primary btn-lg" href="#" role="button">Leer Mas...</a>
    </div>
</div>

<%@include file="pages/footer2.jspf" %>