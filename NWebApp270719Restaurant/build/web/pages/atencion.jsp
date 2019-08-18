<%-- 
    Document   : atencion
    Created on : 02-ago-2019, 5:39:56
    Author     : Leon Matias R.
--%>

<%@include file="header.jsp" %>

<body>
    <%@include file="menu.jsp" %>

    <h2 class="text-center mt-2">Sistema de Atencion</h2>
    <hr>

    <div class="container mt-5">
        <div class="row">
            <div class="col-3">
                <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                    <a class="nav-link active" id="v-pills-home-tab" data-toggle="pill" href="#mesas" role="tab"
                       aria-controls="mesas" aria-selected="true">Mesas</a>
                    <a class="nav-link" id="v-pills-profile-tab" data-toggle="pill" href="#v-pills-profile" role="tab"
                       aria-controls="v-pills-profile" aria-selected="false">Facturacion</a>
                </div>
            </div>
            <div class="col-9">
                <div class="tab-content" id="v-pills-tabContent">
                    <div class="tab-pane fade show active" id="mesas" role="tabpanel"
                         aria-labelledby="v-pills-home-tab">

                        <nav>
                            <div class="nav nav-tabs" id="nav-tab" role="tablist" style="background-color: #ffff">
                                <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home"
                                   role="tab" aria-controls="nav-home" aria-selected="true">Nivel 1</a>
                                <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile"
                                   role="tab" aria-controls="nav-profile" aria-selected="false">Nivel 2</a>
                            </div>
                        </nav>
                        <div class="tab-content" id="nav-tabContent">
                            <div class="tab-pane fade show active" id="nav-home" role="tabpanel"
                                 aria-labelledby="nav-home-tab">
                                <div class="card-columns mt-4">                                   
                                    <% for (int i = 1; i < 10; i++) {%>
                                    <div class="card border-danger">
                                        <img src="img/m1.jpg" class="card-img-top " alt="...">
                                        <div class="card-body">
                                            <h5 class="card-title">Mesa <%= i %> </h5>
                                            <p class="card-text">Capacidad: 5 Personas</p>
                                            <p class="card-text">Estado: <small class="text-muted"> Ocupado</small></p>
                                            <a href="" class="btn btn-outline-danger btn-block">Detalles</a>
                                        </div>
                                    </div>                               
                                    <%}%>

                                </div>
                            </div>
                            <div class="tab-pane fade" id="nav-profile" role="tabpanel"
                                 aria-labelledby="nav-profile-tab">
                                 <div class="card-columns mt-4">                                   
                                        <% for (int i = 1; i < 14; i++) {%>
                                        <div class="card border-success">
                                            <img src="img/m1.jpg" class="card-img-top" alt="...">
                                            <div class="card-body">
                                                <h5 class="card-title">Mesa <%= i %> </h5>
                                                <p class="card-text">Capacidad: 8 Personas</p>
                                                <p class="card-text">Estado: <small class="text-muted"> Libre</small></p>
                                                <a href="" class="btn btn-outline-success btn-block">Detalles</a>
                                            </div>
                                        </div>                               
                                        <%}%>
    
                                    </div>
                                </div>
                        </div>

                    </div>
                    <div class="tab-pane fade" id="v-pills-profile" role="tabpanel"
                         aria-labelledby="v-pills-profile-tab">...</div>

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