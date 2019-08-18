<%@page import="com.rleon.exm.model.Articulos"%>
<%@page import="com.rleon.exm.model.Utiles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.rleon.exm.model.Sumandos"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp" %>
<%@include file="menunav.jsp" %>
<br>
<div class="container">

    <h1>Solucion Pregunta 4</h1>
    <hr>

    <% List<Utiles> listUtiles = (List<Utiles>) request.getSession().getAttribute("utiles");%>

    <% List<Articulos> listArt = (List<Articulos>) request.getSession().getAttribute("listArticulos");%>
    <% Double total = (Double) (request.getSession().getAttribute("total") == null ? 0.0 : request.getSession().getAttribute("total"));%>


    <form action="Preg4" method="POST">

        <div class="form-group row">
            <label for="utiles" class="col-sm-2 col-form-label">Seleccione Tipo de Utiles</label>
            <div class="col-sm-10">
                <select class="form-control" id="utilesSelect" style="width: 200px" name="selectUtiles">
                    <% for (Utiles u : listUtiles) {%>
                    <option value="<%=u.getId()%>"><%=u.getNombre()%></option>
                    <%}%>

                </select>
            </div>
            <label for="utiles" class="col-sm-2 col-form-label">Cantidad</label>
            <div class="col-sm-10" style="display: flex">
                <input type="text" name="cantidad" id="cant" placeholder="cant" style="width: 150px" class="form-control m-2">
                <input type="submit" value="Agregar" class="btn btn-outline-primary m-2">
            </div>
        </div>
    </form>
    <table class="table">
        <thead class="thead-dark">
            <tr>

                <th scope="col">BD UTILES</th>
                <th scope="col">DESCRIPCION</th>
                <th scope="col">CANT. COMPRAR</th>
                <th scope="col">PRECIO LISTA</th>
                <th scope="col">PROMOCION</th>
            </tr>
        </thead>
        <tbody>
            <% for (Articulos a : listArt) {%>
            <tr>

                <td><%=a.getId()%> </td>
                <td><%=a.getDescripcion()%> </td>
                <td><%=a.getCant()%> </td>
                <td>S/. <%=a.getPrecio()%> </td>
                <td><%=a.getPromocion()%>% </td>


            </tr>       
            <% }%>

        </tbody>

    </table>
    <hr>
    <button type="button" class="btn btn-primary">
        Total a Pagar: <span class="badge badge-light"><%=total%></span>
    </button>

</div>



<%@include file="footer.jsp" %>