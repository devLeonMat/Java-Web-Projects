<%@page import="com.rleon.exm.model.Plato"%>
<%@page import="com.rleon.exm.model.Articulos"%>
<%@page import="com.rleon.exm.model.Utiles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.rleon.exm.model.Sumandos"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp" %>
<%@include file="menunav.jsp" %>
<br>
<div class="container">

    <h1>Solucion Pregunta 5</h1>
    <hr>
    <button class="btn btn-outline-success" onclick="mostrarPlatos()">Mostrar Platos y Postres</button>

    <% List<Plato> list = (List<Plato>) request.getSession().getAttribute("listPlatos");       
        Plato p = new Plato();
        
    %>



    <div class="container mt-5" id="cartaid" style="display: none">
        <h2 class="text-center mt-2">Nuestros Platos Criollos</h2>
        <hr>
        <div class="card-columns">

            <% for (Plato e : list) {%>

            <div class="card">
                <img src="<%= e.getImg()%>" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title"><%= e.getNomPlato()%></h5>
                    <p class="card-text"><%= e.getDescrip()%></p>
                </div>
            </div>


            <%}%>
        </div>


        <hr>



    </div>



</div>
<%@include file="footer.jsp" %>