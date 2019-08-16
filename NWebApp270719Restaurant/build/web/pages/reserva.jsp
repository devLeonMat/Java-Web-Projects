<%@page import="com.rleon.restaurante.model.Receta"%>
<%@page import="com.rleon.restaurante.model.Plato"%>
<%@page import="java.util.List"%>
<%@page import="com.rleon.restaurante.model.Nosotros"%>
<%@include file="header.jsp" %>

<body>
    <%@include file="menu.jsp" %>
    <div class="container mt-5">
        <h2 class="text-center mt-2">Reservaciones</h2>
        <hr>
        <div class="card mb-3">
            <div class="row no-gutters">
                <div class="col-md-4">
                    <img src="img/reserva.jpg" class="card-img" alt="...">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">Ingrese sus Datos</h5>
                        <form method="post" action="Reserva">
                            <div class="form-group">
                                <label for="txtNombres">Nombres</label>
                                <input type="text" name="nombres" class="form-control" id="txtNombres"
                                    placeholder="Nombres">
                            </div>
                            <div class="form-group">
                                <label for="txttlfNumber">Numero</label>
                                <input type="text" name="number" class="form-control" id="txttlfNumber"
                                    placeholder="Numero">
                            </div>
                            <div class="form-group">
                                <label for="txtNumPers">Cantidad de Personas</label>
                                <input type="text" name="numPersonas" class="form-control" id="txtNumPers"
                                    placeholder="Cantidad de Personas">
                            </div>
                            <div class="form-group form-check">
                                <input type="checkbox" class="form-check-input" id="chkTerminos">
                                <label class="form-check-label" for="chkTerminos">Acepto terminos y condiciones</label>
                            </div>
                            <button type="submit" class="btn btn-warning">Rervar</button>
                        </form>
                    </div>
                </div>
            </div>
            <hr>
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Condiciones</h5>
                    <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi sunt ut,
                        aperiam ratione eos alias magni in, nulla incidunt impedit laboriosam porro earum sequi est quas
                        unde perspiciatis? Aspernatur, odio.</p>
                    <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi sunt ut,
                        aperiam ratione eos alias magni in, nulla incidunt impedit laboriosam porro earum sequi est quas
                        unde perspiciatis? Aspernatur, odio.</p>
                    <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi sunt ut,
                        aperiam ratione eos alias magni in, nulla incidunt impedit laboriosam porro earum sequi est quas
                        unde perspiciatis? Aspernatur, odio.</p>
                    <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi sunt ut,
                        aperiam ratione eos alias magni in, nulla incidunt impedit laboriosam porro earum sequi est quas
                        unde perspiciatis? Aspernatur, odio.</p>

                </div>
                <img src="img/reserva.jpg" class="card-img-top" alt="...">
            </div>
        </div>
    </div>






    <%@include file="footer.jsp" %>
    <script src="js/jquery-3.3.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>


</html>