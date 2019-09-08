<%@page import="com.restaurante.modelo.Plato"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@include file="header.jsp"%>
<%@include file="menu.jsp"%>
<div class="container">
    <h1 class="mt-3">Graficos</h1>
    <% String action = (String) request.getSession().getAttribute("accion");%>
    <hr>
    <div class="container">       
        <div class="row">
            <div class="col-4">
                <a class="btn btn-primary btn-block" href="Grafica?accion=GRAFICAPYEDA"><i class="fas fa-hockey-puck"></i> Grafico Platos Disponibles</a>
                <a class="btn btn-primary btn-block" href="Grafica?accion=GRAFICAPYEDB"><i class="fas fa-hockey-puck"></i> Grafico Platos no Disponibles</a>
                <a class="btn btn-primary btn-block" href="Grafica?accion=GRAFICABARRA"><i class="fas fa-signal"></i> Grafico de Barras</a>
                <a class="btn btn-primary btn-block" href="Grafica?accion=TODOS"><i class="fas fa-signal"></i> Mostrar Todos</a>


            </div>
            <%=action%>
            <%if (action == null || action.equals("BARRA")) {%>
            <h4>Graficos estadisticos</h4>
            <hr>            
            <img src="img/noimages.jpg" width="500" height="250" />                             
            <%} else if (action.equals("GRAFICABARRA")) {%>
            <img src="<%=request.getContextPath()%>/Grafica?accion=BARRA" />  
            <%} else if (action.equals("GRAFICAPYEDA")) {%>
            <img src="<%=request.getContextPath()%>/Grafica?accion=PYEDA" />  
            <%} else if (action.equals("GRAFICAPYEDB")) {%>
            <img src="<%=request.getContextPath()%>/Grafica?accion=PYEDB" />   
            <%} else if (action.equals("TODOS")) {%>            
            <img src="<%=request.getContextPath()%>/Grafica?accion=PYEDA" />
            <img src="<%=request.getContextPath()%>/Grafica?accion=PYEDB" /> 
            <img src="<%=request.getContextPath()%>/Grafica?accion=BARRA" /> 
            <%}%>

        </div>
    </div>




</div>




<%@include file="footer.jsp" %>