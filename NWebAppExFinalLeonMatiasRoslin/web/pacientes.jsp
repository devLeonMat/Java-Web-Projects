<%@page import="java.util.List"%>
<%@page import="com.clinica.modelo.Pacientes"%>
<%@include file="pages/header2.jspf" %>
<%@include file="pages/navbar-principal.jspf" %>
<% String operacion = (String) request.getSession().getAttribute("oper");%>
<% String conf = (String) request.getSession().getAttribute("confirmsearch");%>

<% List<Pacientes> pacientes = (List<Pacientes>) request.getSession().getAttribute("pacientes");%>
<% Pacientes pac = (Pacientes) request.getSession().getAttribute("paciente");%>

<div class="container mt-5">
    <% if (operacion.equals("LIST")) { %>

    <h3>Listado de Pacientes</h3>
    <hr>
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nombres</th>
                <th scope="col">Documento</th>
                <th scope="col">Diagnostico</th>
                <th scope="col">Opciones</th>
            </tr>
        </thead>
        <tbody>
            <% for (Pacientes e : pacientes) {%>

            <tr>
                <th scope="row">1</th>
                <td><%=e.getNombres() + " " + e.getApellidos()%></td>
                <td><%=e.getNumDocumento()%></td>
                <td><%=e.getDiagnostico()%></td>
                <td>
                    <button type="button" class="btn btn-danger">Dar de alta</button></td>
            </tr>
            <%}%>

        </tbody>
    </table>
 
    <%} else if (operacion.equals("SEARCH")) {%>
    <h3>Busqueda de Pacientes</h3>
    <hr>
    <form action="Pacientes" method="post">
        <input type="hidden" name="FUNC" value="40">
        <div class="input-group flex-nowrap">
            <div class="input-group-prepend">
                <span class="input-group-text" id="addon-wrapping"><i class="fas fa-search"></i></span>
            </div>
            <input type="text" class="form-control" name="numDoc" placeholder="Numero de Documento"
                   aria-describedby="addon-wrapping">
            <div class="input-group-append">
                <button class="btn btn-primary" type="submit" id="button-addon2">Buscar</button>
            </div>
        </div>
    </form>
    <%}%>
    <% if (conf == null) {
            conf = "";
        }
    %>
    <%if (conf.equals("SUCCESS")) {%>
    <hr>
    <div class="card" style="width: 18rem;">
        <div class="card-header">
            Datos del Paciente
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item"><b>Nombres: </b><%=pac.getNombres() + " " + pac.getApellidos()%></li>
            <li class="list-group-item"><b>Dianostico: </b><%=pac.getDiagnostico()%></li>
        </ul>
    </div>
    <%} else if (conf.equals("UNSUCCESS")) {%>
    <hr>
    <div class="alert alert-warning mt-5" role="alert">
        No se encontro resultados para su Busqueda
    </div>
    <%}%>
</div>
<%
    session.removeAttribute("confirmsearch");

%>

<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalCenterTitle">Nuevo Paciente</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form action="Pacientes" method="post">
                <input type="hidden" name="FUNC" value="30">
                <div class="modal-body">
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="inputGroupSelect01">Documento</label>
                        </div>
                        <select class="custom-select" id="inputGroupSelect01" name="tipodoc">
                            <option selected>Seleccione...</option>
                            <option value="1">DNI</option>
                            <option value="3">RUC</option>
                            <option value="4">PASAPORTE</option>
                        </select>
                    </div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <label class="input-group-text" >Numero Doc.</label>
                        </div>
                        <input type="text" class="form-control" name="numdoc" placeholder="Numero de Documento">
                    </div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <label class="input-group-text" >Nombres</label>
                        </div>
                        <input type="text" class="form-control" name="nombres" placeholder="Nombres">
                    </div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <label class="input-group-text">Apellidos</label>
                        </div>
                        <input type="text" class="form-control" name="apellidos" placeholder="Apellidos">
                    </div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <label class="input-group-text" >Edad</label>
                        </div>
                        <input type="text" class="form-control" name="edad" placeholder="Edad">
                    </div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <label class="input-group-text">Sexo</label>
                        </div>
                        <select class="custom-select" name="sexo">
                            <option selected>Seleccione...</option>
                            <option value="M">Masculino</option>
                            <option value="F">Femenino</option>                            
                        </select>
                    </div>         
                    <div class="form-group">
                        <label for="exampleFormControlTextarea1">Diagnostico</label>
                        <textarea class="form-control"  rows="3" name="diagnostico"></textarea>
                    </div>                    
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                    <button type="submit" class="btn btn-primary" >Guardar</button>
                </div>
            </form>
        </div>
    </div>
</div>


<%@include file="pages/footer2.jspf" %>