<%@include file="header.jsp" %>
<%@include file="nav.jsp" %>

<div class="container mt-5">
    <h3>
        Trabajando con JSTL
    </h3>
    <table class="table">
        <tbody>            
            <tr>
                <td class="p-3">
                    <h3>Ejercicio </h3>
                    <form action="ejercicio1.jsp" method="post">
                        <input type="hidden" value="si" name="pinta" />
                        <table class="table">
                            <tbody>
                                <tr>
                                    <td scope="col">Nombre</td>
                                    <td scope="col"><input type="text" name="participante" value=""></td>
                                </tr>
                                <tr>
                                    <td>Genero</td>
                                    <td><input type="radio" name="genero" value="Masculino">Masculino<br>
                                        <input type="radio" name="genero" value="Femenino">Femenino</td>

                                </tr>
                                <tr>
                                    <td>Deporte</td>
                                    <td>
                                        <input type="checkbox" name="dep" value="Ciclismo">Ciclismo<br>
                                        <input type="checkbox" name="dep" value="Tenis">Tenis<br>
                                        <input type="checkbox" name="dep" value="Natacion">Natacion<br>
                                        <input type="checkbox" name="dep" value="Karate">Karate<br>
                                        <input type="checkbox" name="dep" value="Karate">Atletismo<br>
                                        <input type="checkbox" name="dep" value="Karate">surf<br>

                                    </td>

                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <input type="submit" value="Enviar Datos" class="btn btn-outline-primary">
                                    </td>

                                </tr>
                            </tbody>
                        </table>
                    </form>
                </td>
                <td>
                    <div style="background-color: #ffff">
                        <h4>Datos Del Atleta</h4>
                        <hr>
                    <c:set var="si" value="${param.pinta}"/>
                    <c:if test="${si=='si'}">
                        <div class="card border-primary mb-3" style="max-width: 18rem;">
                            <div class="card-header">Participante: ${param.participante}</div>
                            <div class="card-body text-primary">
                                <p class="card-text">Variables Recogidas: ${param.genero}</p>
                                <hr>
                                <p class="card-text"><b>Nombre:</b> ${param.participante}</p>
                                <p class="card-text"><b>Sexo:</b> ${param.genero}</p>
                                <p class="card-text"><b>Deportes:</b></p>
                                <ul>
                                    <c:forEach items="${paramValues.dep}" var="x">
                                        <span class="badge badge-pill badge-info"><c:out value="${x}"/></span>

                                    </c:forEach>
                                </ul>
                            </div>
                        </div>  
                    </c:if>
                    </div>
                </td>
            </tr>

        </tbody>
    </table>
</div>

<%@include file="footer.jsp" %>