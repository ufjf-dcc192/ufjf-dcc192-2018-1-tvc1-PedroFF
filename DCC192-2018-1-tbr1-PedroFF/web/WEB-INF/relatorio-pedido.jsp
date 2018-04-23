<%@page import="ufjf.br.dcc192.Pedido"%>
<%@page import="ufjf.br.dcc192.Mesa"%>
<%@include file="jspf/cabecalho.jspf" %>
<%Mesa mesa = (Mesa) request.getAttribute("mesa");
    Pedido pedido = (Pedido) request.getAttribute("pedido");%>
<ul class="list-group">
    <li class="list-group-item">Descrição do pedido</li>
        <%for (int i = 0; i < pedido.getItensProduto().size(); i++) {%>
    <li class="list-group-item list-group-item-info"><%= pedido.getItensProduto().get(i) + " Preço:" + (pedido.getItensProduto().get(i).getQuantidade() * (pedido.getItensProduto().get(i).getItem().getPreco()))%></li>
        <%}%>
    <li class="list-group-item list-group-item-info"> Valor total: <%=pedido.getValorFinal()%> </li>
    <li class="list-group-item list-group-item-secondary">Hora de abertura do pedido: <%=pedido.getHoraAbertura()%></li>
        <%if (pedido.getConta() == false) {%>
        <li class="list-group-item list-group-item-secondary">Hora de fechamento do pedido: <%=pedido.getHoraFechamento()%></li>
        <%}%>
</ul>
<%@include file="jspf/rodape.jspf" %>