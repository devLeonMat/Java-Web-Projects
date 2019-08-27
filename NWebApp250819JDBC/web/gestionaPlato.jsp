<%@page import="com.restaurante.modelo.Plato"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@include file="header.jsp"%>
<%@include file="menu.jsp"%>
<div class="container">
    <h1 class="mt-3">Mantenedor de Platos</h1>
    <hr>
    <% String accion = (String) request.getSession().getAttribute("accion");%>
    <% List<Plato> listaPlatos = (ArrayList<Plato>) request.getSession().getAttribute("listPlatos");%>
    <% Plato p = (Plato) request.getSession().getAttribute("plato");%>

    <%if (accion.equals("LISTAR")) {%>

    <div class="row">
        <div class="col text-right">
            <a href="PlatoAdmin?accion=NUEVO" class="btn btn-primary">
                <i class="fas fa-user-plus"></i>
                Agregar</a>
        </div>
    </div>

    <%} else {%>
    <div class="row">
        <div class="col text-right">
            <a href="PlatoAdmin?accion=LISTAR" class="btn btn-warning">
                <i class="fas fa-arrow-left"></i>
                Regresar</a>
        </div>
    </div>
    <%}%>


    <div class="container mt-5">




        <% if (accion != null) { %>
        <% if (accion.equals("NUEVO")) { %>
        <%@include file="formNuevo.jsp" %>
        <%} else if (accion.equals("LISTAR")) {%>
        <%@include file="listPlatos.jsp" %>
        <%} else if (accion.equals("OBTENER")) {%>
        <%@include file="formEdit.jsp" %>
        <%}%>

        <%} else {%>
        <%@include file="listPlatos.jsp" %>
        <%}%>
    </div>
</div>




<%@include file="footer.jsp" %>