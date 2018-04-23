<%@page import="ufjf.br.dcc192.ListaDeMesas"%>
<%@page import="ufjf.br.dcc192.Pedido"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ufjf.br.dcc192.Mesa"%>
<%@include file="jspf/cabecalho.jspf" %>
<%Mesa mesa = (Mesa) request.getAttribute("mesa");
    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    pedidos = mesa.getPedidos();
%>
<table class="table table-striped">
    <thead>
        <tr>
            <th scope="col">Pedido</th>
            <th scope="col">Status</th>
            <th scope="col">Edição de Pedido</th>
            <th scope="col">Fechar Pedido</th>
        </tr>
    </thead>
    <tbody>
        <%for (int i = 0; i < pedidos.size(); i++) {%>
        <tr>
            <td><%=i+1%></td>
            <td><%=pedidos.get(i).getConta() ? "Aberta" : "Fechada"%></td>
            <td><a href="editar-pedido.html?mesa=<%= ListaDeMesas.getInstance().indexOf(mesa) %>&pedido=<%=i%>">Editar Pedido</a></td>
            <td><a href="fechar-pedido.html">Fechar Pedido</a></td>
        </tr>
        <%}%>
        <tr>
            <td colspan="4"><a href="novo-pedido.html?mesa=<%= ListaDeMesas.getInstance().indexOf(mesa) %>">Novo Pedido</a></td>
        </tr>
    </tbody>
</table>



<%@include file="jspf/rodape.jspf" %>