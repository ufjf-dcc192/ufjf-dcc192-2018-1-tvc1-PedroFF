<%@page import="ufjf.br.dcc192.Intercambista"%>
<%@page import="ufjf.br.dcc192.Anfitriao"%>
<%@page import="ufjf.br.dcc192.ListaDeAnfitriao"%>
<%@page import="ufjf.br.dcc192.ListaDeIntercambista"%>
<%@include file="jspf/cabecalho.jspf" %>

<ul class="list-group">
    <% for (Intercambista in: ListaDeIntercambista.getInstance()) {
            for (Anfitriao an : ListaDeAnfitriao.getInstance()) {
                
                if (in.getTempoEstadia().equals(an.getPossibilidadeDeEstadia())) {
    %>
    <li class="list-group-item"><h5><%=an.getNome()%> pode hospedar <%=in.getNome()%></h5></li>
    <li class="list-group-item">Email do anfitrião: <%=an.getEmail()%></li>
    <li class="list-group-item">Email do intercambista: <%=in.getEmail()%></li>
    <li class="list-group-item"><br/></li>
    <%          
                }
                
            }
    }%>
    
</ul>
<%@include file="jspf/rodape.jspf" %>