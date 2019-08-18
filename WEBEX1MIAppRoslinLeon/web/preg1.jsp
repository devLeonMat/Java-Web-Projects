<%@page import="java.util.ArrayList"%>
<%@page import="com.rleon.exm.model.Sumandos"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp" %>
<%@include file="menunav.jsp" %>
<br>
<div class="container">    

    <h1>Solucion Pregunta 1</h1>
    <hr>

    <%  List<Sumandos> sumas = (List<Sumandos>) request.getSession().getAttribute("sumas");
              
    %>

    <table class="table">
        <thead class="thead-dark">
            <tr>
                
                <th scope="col">Sumando 1</th>
                <th scope="col">Sumando 2</th>
                <th scope="col">Resultado</th>
            </tr>
        </thead>
         <tbody>
            <% for (Sumandos s : sumas) { %>
            <tr>
                
                <td><%=s.getNum1() %></td>
                <td><%= s.getNum2() %></td>
                <td><%= s.getResult() %></td>
                
            </tr>       
            <% }%>
            <tr>
                <td colspan="3" class="text-center table-warning">La tabla tiene <%=sumas.size() %> sumas</td>
            </tr>
        </tbody>
       
    </table>

</div>



<%@include file="footer.jsp" %>