<%@page import="ufjf.br.dcc192.ItemPedido"%>
<%@page import="ufjf.br.dcc192.Mesa"%>
<%@page import="ufjf.br.dcc192.ListaDeMesas"%>
<%@page import="ufjf.br.dcc192.Pedido"%>
<%@include file="jspf/cabecalho.jspf" %>
<%Mesa mesa = (Mesa) request.getAttribute("mesa");
  Pedido pedido = (Pedido) request.getAttribute("pedido");
  int codigo = mesa.getPedidos().indexOf(pedido);
%>
<br/>
<form method="post" >
    <label>Escolha a bebida:</label>
    <div class="row">
        <div class="col">
            <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="bebida">
                <%for (int i = 0; i < ItemPedido.getItens().size(); i++) {%>
                <option value="<%=i%>"><%=i + 1 + " - " + ItemPedido.getItens().get(i).getNome() + " R$ " + ItemPedido.getItens().get(i).getPreco()%></option>
                <%}%>
            </select>
        </div>
        <div class="col">
            <input name="qtd" type="number" class="form-control" placeholder="Quantidade" required="required">
            <input type="hidden" value="alteracao" name="alteracao"/>
            <input type="hidden" value="<%=codigo%>" name="codigo"/>
        </div>
    </div><br/>
    <button class="btn btn-primary" type="submit">Concluir</button>

    <br/>
</form>

<%@include file="jspf/rodape.jspf" %>
