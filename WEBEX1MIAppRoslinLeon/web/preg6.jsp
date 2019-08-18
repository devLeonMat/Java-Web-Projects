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

    <h1>Solucion Pregunta 6</h1>
    <hr>

    <div class="container">
        <div class="row">
            <div class="col">
                <form>
                    <div class="form-group">
                        <label for="multiplo">Multiplo</label>
                        <input type="number" class="form-control" id="multiplo" name="multiplo" placeholder="Multiplo">
                    </div>
                    <div class="form-group">
                        <label for="inicio">Inicio</label>
                        <input type="number" class="form-control" id="inicio" name="inicio" placeholder="Fin">
                    </div>
                    <div class="form-group">
                        <label for="fin">Fin</label>
                        <input type="number" class="form-control" id="fin" name="fin" placeholder="Fin">
                    </div>

                    <button type="button" class="btn btn-primary" onclick="multiplos()">Operar</button>
                </form>
            </div>
            <div class="col">
                <textarea name="resultado" id="resultado" cols="30" rows="10"></textarea>
            </div>
        </div>
    </div>



</div>
<%@include file="footer.jsp" %>