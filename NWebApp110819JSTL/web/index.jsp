<%@include file="header.jsp" %>
<%@include file="nav.jsp" %>

<div class="container mt-5">
    <h3>
        Trabajando con JSTL
    </h3>
    <table class="table">
        <tbody>
            <tr>
                <td>

        <c:set var="nombre" value="leon matias" />
        <c:set var="edad" value="26" />
        <div class="card" style="width: 18rem;">
            <ul class="list-group list-group-flush">
                <li class="list-group-item">Nombre: <c:out value="${nombre}"></c:out>
                </li>
                <li class="list-group-item"><b>Edad:</b>
                <c:out value="${edad}"></c:out>
                </li>
            </ul>
        </div>

        </td>
        <td>
            <h3>Formularios</h3>

            <form>
                <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1"
                           aria-describedby="emailHelp" placeholder="Enter email">
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with
                        anyone else.</small>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1"
                           placeholder="Password">
                </div>
                <div class="form-group form-check">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Check me out</label>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </td>
        </tr>
        </tbody>
    </table>
</div>

        <%@include file="footer.jsp" %>