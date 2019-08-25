
<%@page import="com.restaurante.modelo.Plato"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@include file="header.jsp"%>
<%@include file="menu.jsp"%>
<div class="container">
    <h1 class="mt-3">Mantenedor de Platos</h1>
    <hr>
    <div class="container mt-5">  
        <div class="row">
            <div class="col-4"><%@include file="menuLateral.jsp" %></div>
            <div class="col-8">
                <% String accion = (String) request.getSession().getAttribute("accion");%>
                <% List<Plato> listaPlatos = (ArrayList<Plato>) request.getSession().getAttribute("listPlatos");%>



                <% if (accion != null) { %>

                <% if (accion.equals("NUEVO")) { %>
                <%@include file="formNuevo.jsp" %>
                <%} else if (accion.equals("LISTAR")) { %>
                <%@include file="listPlatos.jsp" %>
                <%}%>





                <%}%>


            </div>
        </div>
    </div>
</div>



<%@include file="footer.jsp" %>