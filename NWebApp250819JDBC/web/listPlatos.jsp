<table class="table">
    <thead class="thead-dark">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Plato</th>
            <th scope="col">Precio</th>
            <th scope="col">Estado</th>
            <th scope="col">Accion</th>
        </tr>
    </thead>
    <tbody>
        <% for (Plato pl : listaPlatos) {%>
        <tr>
            <th scope="row"><%=pl.getIdPlato()%></th>
            <td><%=pl.getNombre()%></td>
            <td>S/. <%=pl.getPrecio()%></td>
            <td>
                <%if (pl.getEstado() == 1) {%>
                <span class="badge badge-pill badge-success">Disponible</span>
                <%} else {%>
                <span class="badge badge-pill badge-danger">Agotado</span>
                <%}%>
            </td>
            <td>

                <a class="btn btn-outline-primary" href="PlatoAdmin?accion=OBTENER&idPlato=<%=pl.getIdPlato()%>"><i class="fas fa-pen"></i></a>
                <a class="btn btn-outline-danger" href="#" ><i class="fas fa-trash"></i></a>
            </td>
        </tr>                     

        <%}%>
    </tbody>
</table>