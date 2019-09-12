<%@include file="pages/header.jspf" %>

<% String success = request.getSession().getAttribute("success") == null ? "" : (String) request.getSession().getAttribute("success");%>

<body class="body-index">
  <div class="container">
    <div class="form-login">
      <form action="Login" method="post">
        <div class="inputs-group">

          <input type="text" name="usuario" placeholder="Usuario">
          <input type="password" name="password" placeholder="Password">
          <input type="submit" value="Iniciar Sesion" class="myButton">
        </div>
      </form>
      <%if (success.equals("active")) { %>
      <div class="alert alert-danger msg-alert" role="alert">
        El usuario o password ingresado es incorrecto
      </div>
      <%}%>
        </div>

    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
</script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
</script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
</script>
</body>
    <%@include file="pages/footer.jspf" %>