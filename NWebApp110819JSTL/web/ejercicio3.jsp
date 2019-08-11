<%@include file="header.jsp" %>
<%@include file="nav.jsp" %>

<div class="container mt-5">

    <h3>
        Variables y objetos impl�citos
    </h3>
    <hr>
    <div class="row">
        <c:set var="marca" value="Toyota" scope="page" />
        <c:set var="auto" value="${auto}" />

        <div class="col">
            <div class="card" style="width: 18rem;">
                <div class="card-header">
                    ${auto.marca}
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">Modelo: ${auto.modelo}</li>
                    <li class="list-group-item">Precio: ${auto.precio}</li>
                    <li class="list-group-item">Placa: ${auto.placa}</li>
                    <li class="list-group-item">Color: ${auto.color}</li>
                </ul>
            </div>
        </div>
        <div class="col">
            <c:set var="testeo" value="Dato page" scope="page" />
            <c:set var="testeo" value="Dato Request" scope="request" />
            <c:set var="testeo" value="Dato Sesion" scope="session" />
            <c:set var="testeo" value="Dato Aplication" scope="application" />

            <div class="card" style="width: 18rem;">
                <div class="card-header">
                    Diferencias Scope
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item"><b>Por Default</b>
                        <c:out value="${testeo}" />
                    </li>
                    <li class="list-group-item"><b>Valor page</b>
                        <c:out value="${pageScope.testeo}" />
                    </li>
                    <li class="list-group-item"><b>Valor Request</b>
                        <c:out value="${requestScope.testeo}" />
                    </li>
                    <li class="list-group-item"><b>Valor session</b>
                        <c:out value="${sessionScope.testeo}" />
                    </li>
                    <li class="list-group-item"><b>Valor application</b>
                        <c:out value="${applicationScope.testeo}" />
                    </li>
                </ul>
            </div>

        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col">
            <h4>IF ELSE</h4>
            <c:set var="numero" value="20" scope="page" />
            <c:set var="numero2" value="25" scope="page" />
            <c:set var="salario" value="930" scope="page" />

            <div class="card" style="width: 18rem;">
                <div class="card-header">
                    Resultados
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">
                        <c:if test="${numero%2==0}">
                            <c:out value="es un numero par" />
                        </c:if>
                        <c:if test="${numero%2!=0}">
                            <c:out value="es un numero impar" />
                        </c:if>

                    </li>
                    <li class="list-group-item">
                        <c:if test="${numero2%2==0}">
                            <c:out value="es un numero par" />
                        </c:if>
                        <c:if test="${numero2%2!=0}">
                            <c:out value="es un numero impar" />
                        </c:if>

                    </li>
                    <li class="list-group-item">
                        <c:choose>
                            <c:when test="${salario<=1000}">
                                Su salario es muy bajo
                            </c:when>
                            <c:when test="${salario>=5000}">
                                Su salario es regular
                            </c:when>
                            <c:otherwise>
                                Salario sin comentarios
                            </c:otherwise>
                        </c:choose>
                    </li>

                    <li class="list-group-item"><b>Salario</b>
                        <c:out value="${salario}" />
                    </li>

                </ul>
            </div>
        </div>
        <div class="col">
            <h4>FOR Y FOR EACH</h4>
            <c:set var="numero" value="20" scope="page" />


            <div class="card" style="width: 18rem;">
                <div class="card-header">
                    Resultados
                </div>
                <ul class="list-group list-group-flush">
                    <div class="form-group">
                        <select multiple class="form-control" name="nums" id="">
                            <c:forEach var="item" items="${autos}">
                                <option>
                                    <c:out value="${item.marca}"></c:out>
                                    </option>
                            </c:forEach>
                        </select>
                    </div>
                    <hr>
                    <div class="form-group">
                        <select multiple class="form-control" name="nums" id="">
                            <c:forEach var="n" begin="0" end="4" step="1">
                                <option>
                                    <c:out value="${n}"></c:out>
                                    </option>
                            </c:forEach>
                        </select>
                    </div>
                </ul>
            </div>
        </div>

    </div>
    <hr>
    <div class="row">
        <div class="col">
            <h4>FOR EACH, Tag Library Descriptor Y Tag Handler</h4>
            <table class="table table-striped table-inverse table-responsive">
                <thead class="thead-inverse">
                    <tr>
                        <th>Marca</th>
                        <th>Marca Invertida</th>
                        <th>Modelo</th>
                        <th>Precio</th>
                        <th>Placa</th>
                        <th>Color</th>
                        <th>Color Mayus</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${autos}">
                        <tr>
                            <td><c:out value="${item.marca}"></c:out></td>
                            <td><nt:invierte texto="${item.marca}"></nt:invierte></td>
                            <td><c:out value="${item.modelo}"></c:out></td>
                            <td><c:out value="${item.precio}"></c:out></td>
                            <td><c:out value="${item.placa}"></c:out></td>
                            <td><c:out value="${item.color}"></c:out></td>
                            <td><nt:UpperCase upper="${item.color}"/></td>
                        </tr>                    
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="col">

        </div>
    </div>



</div>

<%@include file="footer.jsp" %>