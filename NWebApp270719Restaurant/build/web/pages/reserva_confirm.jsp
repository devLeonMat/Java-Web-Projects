<%@page import="com.rleon.restaurante.model.Receta"%>
<%@page import="com.rleon.restaurante.model.Plato"%>
<%@page import="java.util.List"%>
<%@page import="com.rleon.restaurante.model.Nosotros"%>
<%@include file="header.jsp" %>

<body>
    <%@include file="menu.jsp" %>
    <div class="container mt-5">
        <div class="card mb-3">
            <div class="row no-gutters">
                <div class="col-md-4">
                    <img src="img/reserva-confirm.jpg" class="card-img" alt="...">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">Confirmacion de Rserva</h5>
                        <p>Sr/Srta: <%=request.getSession().getAttribute("nombre") %></p>
                        <p class="card-text">¡Su mesa fue reservada. Gracias por su Preferencia!</p>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>






    <%@include file="footer.jsp" %>
    <script src="js/jquery-3.3.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>


</html>