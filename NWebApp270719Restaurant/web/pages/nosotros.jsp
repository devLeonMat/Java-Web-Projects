<%@page import="com.rleon.restaurante.model.Nosotros"%>
<%@include file="header.jsp" %>

<body>
    <%@include file="menu.jsp" %>

    <% Nosotros n = (Nosotros) request.getSession().getAttribute("story");%>

    <div class="container mt-5">
        <div class="card mb-3">
            <img src="<%=n.getPath()%>" class="card-img-top" alt="<%=n.getTittle()%>">
            <div class="card-body p-5">
                <h5 class="card-title"><%=n.getTittle()%></h5>
                <p class="card-text text-justify"><%=n.getText()%></p>        
            </div>
        </div>

        <div class="row mt-3 mb-5">
            <div class="col-sm-6">
                <div class="card text-white bg-info">
                    <div class="card-body">
                        <h5 class="card-title">MISIÓN</h5>
                        <p class="card-text"><%=n.getMision() %></p>                        
                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="card text-white bg-dark">
                    <div class="card-body">
                        <h5 class="card-title">VISIÓN</h5>
                        <p class="card-text"><%=n.getVision() %></p>
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