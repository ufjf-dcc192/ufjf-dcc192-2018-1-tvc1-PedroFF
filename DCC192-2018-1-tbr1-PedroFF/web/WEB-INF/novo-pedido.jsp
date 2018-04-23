<%@page import="ufjf.br.dcc192.ItemPedido"%>
<%@page import="ufjf.br.dcc192.Item"%>
<%@include file="jspf/cabecalho.jspf" %>
<br/>
<form method="post" >
    <label>Escolha a bebida:</label>
    <div class="row">
        <div class="col">
            <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="bebida">
                <%for (int i = 0; i < ItemPedido.getItens().size(); i++) {%>
                <option value="<%=i%>"><%=i+1 + " - " + ItemPedido.getItens().get(i).getNome() + " R$ " + ItemPedido.getItens().get(i).getPreco()%></option>
                <%}%>
            </select>
        </div>
        <div class="col">
            <input name="qtd" type="number" class="form-control" placeholder="Quantidade" required="required">
        </div>
    </div><br/>
    <button class="btn btn-primary" type="submit">Concluir</button>

    <br/>
</form>


<%@include file="jspf/rodape.jspf" %>
