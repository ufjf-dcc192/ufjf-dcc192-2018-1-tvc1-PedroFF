<%@page import="ufjf.br.dcc192.Anfitriao"%>
<%@page import="ufjf.br.dcc192.ListaDeAnfitriao"%>
<%@page import="ufjf.br.dcc192.ListaDeIntercambista"%>
<%@include file="jspf/cabecalho.jspf" %>

<ul class="list-group">
    <% for (int i = 0; i < ListaDeIntercambista.getInstance().size(); i++) {
            for (Anfitriao an : ListaDeAnfitriao.getInstance()) {
                int j = 0;
                if (ListaDeIntercambista.getInstance().get(i).getTempoEstadia().equals(ListaDeAnfitriao.getInstance().get(j).getPossibilidadeDeEstadia())) {
    %>
    <li class="list-group-item"><%=ListaDeAnfitriao.getInstance().get(j).getNome()%> pode hospedar <%=ListaDeIntercambista.getInstance().get(i).getNome()%></li>

    <%
                }
                j++;
            }
    }%>
</ul>
<%@include file="jspf/rodape.jspf" %>