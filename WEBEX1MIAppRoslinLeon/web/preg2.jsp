<%@page import="java.util.ArrayList"%>
<%@page import="com.rleon.exm.model.Sumandos"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp" %>
<%@include file="menunav.jsp" %>
<br>
<div class="container">

    <h1>Solucion Pregunta 2</h1>
    <hr>

    <div class="container">
        <div class="row">
            <div class="col">
                <form>
                    <h3>Configuracion</h3>
                    <hr>
                    <div class="form-group">
                        <label>Seleccione Nivel</label>
                        <select class="form-control" id="nivelSelect1">
                            <option value="n1">Nivel 1</option>
                            <option value="n2">Nivel 2</option>
                        </select>
                    </div>
                    <div class="form-group" id="nivel1" style="display: none">
                        <label>Nivel 1 (10 Mesas)</label>
                        <select class="form-control" id="nivelSelect2" seelct="">
                            <option>2 Mesas x Fila</option>
                            <option>5 Mesas x Fila</option>

                        </select>
                    </div>
                    <div class="form-group" id="nivel2" style="display: none">
                        <label>Nivel 2 (14 Mesas)</label>
                        <select class="form-control" id="nivelSelect3" name="nivel2select">
                            <option>2 Mesas x Fila</option>
                            <option>7 Mesas x Fila</option>

                        </select>
                    </div>

                    <button type="button" class="btn btn-outline-primary">Guardar</button>
                </form>
            </div>
            <div class="col">
                <div class="card-columns mt-4">
                    <% for (int i = 1; i < 10; i++) {%>
                    <div class="card border-danger">
                        <img src="img/m1.jpg" class="card-img-top " alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Mesa <%= i%> </h5>
                            <p class="card-text">Capacidad: 5 Personas</p>
                            <p class="card-text">Estado: <small class="text-muted"> Ocupado</small></p>
                            <a href="" class="btn btn-outline-danger btn-block">Detalles</a>
                        </div>
                    </div>
                    <%}%>

                        </div>
            </div>
        </div>
    </div>


</div>



<%@include file="footer.jsp" %>