<%@page import="ufjf.br.dcc192.Mesa"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="ufjf.br.dcc192.ListaDeMesas"%>
<%@include file="jspf/cabecalho.jspf" %>
<table border="1">
    <thead>
        <tr>
            <th>Mesa</th>
            <th>Pedidos</th>
            <th>Status mesa</th>
        </tr>
    </thead>
    <tbody>
        <% for (Mesa mesa : ListaDeMesas.getInstance()) {%>        
        <tr>
            <td><%= mesa.getNumMesa()%></td>
            <%for(int i = 0; i<ListaDeMesas.getInstance().size(); i++){%>
            <td><a href="pedido.html?mesa=<%=i%>"><%= mesa.getPedidos().size()%></a></td>
            <%}%>
            <td><%= mesa.getStatus()?"Aberta":"Fechada"%></td>

        </tr>
        <%}%>
    </tbody>
</table>

<%@include file="jspf/rodape.jspf" %>
