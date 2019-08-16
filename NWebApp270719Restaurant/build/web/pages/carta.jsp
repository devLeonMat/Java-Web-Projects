<%@page import="com.rleon.restaurante.model.Receta"%>
<%@page import="com.rleon.restaurante.model.Plato"%>
<%@page import="java.util.List"%>
<%@page import="com.rleon.restaurante.model.Nosotros"%>
<%@include file="header.jsp" %>

<body>
    <%@include file="menu.jsp" %>

    <% List<Plato> list = (List<Plato>) request.getSession().getAttribute("listPlatos");
        Receta r = new Receta();
        Plato p = new Plato();
        int i = 0;
    %>



    <div class="container mt-5">
        <h2 class="text-center mt-2">Nuestros Platos Criollos</h2>
        <hr>
        <div class="card-columns">

            <% for (Plato e : list) {%>

            <div class="card">
                <img src="<%= e.getImg()%>" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title"><%= e.getNomPlato()%></h5>
                    <p class="card-text"><%= e.getDescrip()%></p> 
                    <% p.setReceta(e.getReceta()); %>

                    <button type="button" class="btn btn-outline-primary btn-block" data-toggle="modal" data-target="#exampleModalCenter<%=i%>">
                        Receta
                    </button>
                </div>
            </div>

            <!-- Modal -->
            <div class="modal fade" id="exampleModalCenter<%=i%>" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalCenterTitle"><%= e.getNomPlato()%></h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <img src="<%= e.getImg()%>" class="img-fluid" alt="Responsive image">
                            <h3>Ingredientes</h3>
                            <hr>
                         <%= e.getReceta().getIngredientes() %>
                         
                         <h3 class="mt-3">Preparacion</h3>
                         <%= e.getReceta().getReceta() %>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-outline-danger" data-dismiss="modal">Cerrar</button>                            
                        </div>
                    </div>
                </div>
            </div>       

            <%i++;
                }%>
        </div>


        <hr>



    </div>






    <%@include file="footer.jsp" %>
    <script src="js/jquery-3.3.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>


</html>