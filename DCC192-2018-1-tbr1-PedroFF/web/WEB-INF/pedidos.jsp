<%@page import="ufjf.br.dcc192.Pedido"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ufjf.br.dcc192.Mesa"%>
<%@include file="jspf/cabecalho.jspf" %>
<%Mesa mesa = (Mesa) request.getAttribute("mesa");
    ArrayList<Pedido> pedidos = new ArrayList<>();
    pedidos = mesa.getPedidos();
%>
<table border="1">
    <thead>
        <tr>
            <th>Pedido</th>
            <th>Status</th>
        </tr>
    </thead>
    <tbody>
        <%for (int i = 0; i < pedidos.size(); i++) {%>
        <tr>
            <td><%=pedidos.indexOf(i)%></td>
            <td><%=pedidos.get(i).getConta() ? "Aberta" : "Fechada"%></td>
            <td><a href="editar-pedido.html?pedido=<%=i%>">Editar Pedido</a></td>
            <td><a href="fechar-pedido.html">Fechar Pedido</a></td>
        </tr>
        <%}%>
        <tr>
            <td colspan="4"><a href="novo-pedido.html">Novo Pedido</a></td>
        </tr>

    </tbody>
</table>



<%@include file="jspf/rodape.jspf" %>