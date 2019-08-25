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
        <% for (Plato p : listaPlatos) {%>
        <tr>
            <th scope="row"><%=p.getIdPlato()%></th>
            <td><%=p.getNombre()%></td>
            <td><%=p.getPrecio()%></td>
            <td>
                <%if (p.getEstado() == 1) {%>
                <span class="badge badge-pill badge-success">Disponible</span>
                <%} else {%>
                <span class="badge badge-pill badge-danger">Agotado</span>
                <%}%>
            </td>
            <td>
                <button  class="btn btn-outline-primary"><a>Editar</a></button>
                <button  class="btn btn-outline-danger"><a>Eliminar</a></button>
            </td>
        </tr>                     

        <%}%>
    </tbody>
</table>