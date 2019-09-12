
<%@page import="java.util.List"%>
<%@page import="com.clinica.modelo.Pacientes"%>
<%@include file="pages/header2.jspf" %>
<%@include file="pages/navbar-principal.jspf" %>
<% String operacion = (String) request.getSession().getAttribute("oper");%>
<% List<Pacientes> pacientes = (List<Pacientes>) request.getSession().getAttribute("pacientes");%>

<div class="container mt-5">
    <% if (operacion.equals("LIST")) { %>

    <h3>Listado de Pacientes</h3>
    <hr>
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nombres</th>
                <th scope="col">Diagnostico</th>
            </tr>
        </thead>
        <tbody>
            <% for (Pacientes e : pacientes) {%>

            <tr>
                <th scope="row">1</th>
                <td><%=e.getNombres() + " " + e.getApellidos()%></td>
                <td><%=e.getDiagnostico() %></td>
            </tr>
            <%}%>

        </tbody>
    </table>


    <%}%>



</div>





<%@include file="pages/footer2.jspf" %>