<%@include file="header.jsp" %>
<%@include file="nav.jsp" %>

<div class="container mt-5">
    <h3>
        Reserva tu Cita Medica
    </h3>
    <table class="table">
        <tbody>
            <tr>
                <td style="width: 50%">
                    <h3>Datos </h3>
                    <form action="ejercicio2.jsp" method="post">
                        <input type="hidden" value="si" name="pinta" />
                        <table class="table">
                            <tbody>
                                <tr>
                                    <td scope="col">Nombres y Apellidos</td>
                                    <td scope="col"><input type="text" name="paciente" value=""></td>
                                </tr>
                                <tr>
                                    <td scope="col">Documento :</td>
                                    <td scope="col">
                                        <div class="input-group mb-3">
                                            <div class="input-group-prepend">
                                                <select class="form-control form-control-sm" name="doc">
                                                    <option value="No Selecciono Tipo doc">Seleccione</option>
                                                    <option value="DNI">DNI</option>
                                                    <option value="Pasaporte">Pasaporte</option>
                                                    <option value="C. Extr">Carnet de Extranjeria</option>
                                                </select>
                                            </div>
                                            <input type="text" class="form-control" name="numdoc"
                                                aria-label="Text input with dropdown button">
                                        </div>


                                    </td>


                                </tr>
                                <tr>
                                    <td>Genero</td>
                                    <td><input type="radio" name="genero" value="Masculino">Masculino<br>
                                        <input type="radio" name="genero" value="Femenino">Femenino</td>

                                </tr>
                                <tr>
                                    <td>Edad</td>
                                    <td><input type="number" name="edad" value="" maxlength="3"></td>

                                </tr>
                                <tr>
                                    <td>Especialidad</td>
                                    <td>
                                        <select class="form-control form-control-sm" name="espec">
                                            <option value="No selecciono especialidad">Seleccione</option>
                                            <option value="Cardiologia">Cardiologia</option>
                                            <option value="Dermatologia">Dermatologia</option>
                                            <option value="Oftalmologia">Oftalmologia</option>
                                            <option value="Destista">Destista</option>
                                            <option value="Neumologia">Neumologia</option>
                                            <option value="Endocrinologia">Endocrinologia</option>
                                            <option value="Estomatologia">Estomatologia</option>
                                        </select>

                                    </td>

                                </tr>
                                <tr>
                                    <td>Turno</td>
                                    <td>
                                        <select class="form-control form-control-sm" name="turno">
                                            <option value="No selecciono turno">Seleccione</option>
                                            <option value="Mañana">Mañana</option>
                                            <option value="Tarde">Tarde</option>

                                        </select>

                                    </td>

                                </tr>
                                <tr>
                                    <td>Sintomas</td>
                                    <td>
                                        <textarea name="sintomas" id="sintomas" cols="40" rows="5" value="">

                                       </textarea>

                                    </td>

                                </tr>
                                <tr>
                                    <td colspan="2" style="text-align: center">
                                        <input type="submit" value="Reservar Cita" class="btn btn-outline-primary">
                                    </td>

                                </tr>
                            </tbody>
                        </table>
                    </form>
                </td>
                <td>







                    <h5>Datos del Paciente</h5>
                    <c:set var="si" value="${param.pinta}" />
                    <c:if test="${si=='si'}">

                        <div class="card mb-3" style="max-width: 540px;">
                            <div class="row no-gutters">
                                <div class="col-md-4">
                                    <img src="img/foto.jpg" class="card-img" alt="...">
                                </div>
                                <div class="col-md-8">
                                    <div class="card-body">
                                        <h5 class="card-title">Paciente: ${param.paciente}</h5>
                                        <p class="card-text"><b>Nombre:</b> ${param.paciente}</p>
                                        <c:if test="${param.doc!=''}">
                                            <p class="card-text"><b>Doc: ${param.doc} -</b> ${param.numdoc}</p>
                                        </c:if>
                                        <p class="card-text"><b>Sexo:</b> ${param.genero}</p>
                                        <p class="card-text"><b>Edad:</b> ${param.edad}</p>
                                        <p class="card-text"><b>Especialidad:</b> ${param.espec}</p>
                                        <p class="card-text"><b>Turno:</b> ${param.turno}</p>
                                        <p class="card-text"><b>Sintomas:</b>${param.sintomas} </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <span class="badge badge-success">Cita Confirmada</span>
                    </c:if>
                </td>
            </tr>

        </tbody>
    </table>
</div>

<%@include file="footer.jsp" %>