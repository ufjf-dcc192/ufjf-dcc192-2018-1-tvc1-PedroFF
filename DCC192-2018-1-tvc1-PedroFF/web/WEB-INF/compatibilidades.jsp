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
    <li class="list-group-item"><h5><%=ListaDeAnfitriao.getInstance().get(j).getNome()%> pode hospedar <%=ListaDeIntercambista.getInstance().get(i).getNome()%></h5></li>
    <li class="list-group-item">Email do anfitrião: <%=ListaDeAnfitriao.getInstance().get(j).getEmail()%></li>
    <li class="list-group-item">Email do intercambista: <%=ListaDeIntercambista.getInstance().get(i).getEmail()%></li>
    <li class="list-group-item"><br/></li>
    <%
                }
                j++;
            }
    }%>
    
</ul>
<%@include file="jspf/rodape.jspf" %>