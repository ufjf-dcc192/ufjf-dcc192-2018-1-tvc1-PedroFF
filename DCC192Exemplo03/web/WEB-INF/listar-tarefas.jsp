<%@page import="br.ufjf.dcc192.ListaDeTarefas"%>
<%@page import="br.ufjf.dcc192.Tarefa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Tarefas</title>
    </head>
    <body>
        <h1>Lista de Tarefas</h1>
        <table border = '1'>
            <tbody>
                <%for (int i=0; i<ListaDeTarefas.getInstance().size();i++) {
                Tarefa tarefa = ListaDeTarefas.getInstance().get(i);
                %>
                <tr>
                    <td><a href="tarefa-editar.html?linha=<%=i%>">Editar</a></td>
                    <td><a href="troca-estado.html?linha=<%=i%>"><%=tarefa.getConcluida()?"Concluída":"A fazer"%></a></td>
                    <td><%=tarefa.getTitulo()%></td>
                    <td><%=tarefa.getDescricao()%></td>
                    <td><a href="tarefa-excluir.html?linha=<%=i%>">Excluir</a></td>
                </tr>
                <%
                    }
                %>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan="3"><a href="nova.html">Nova Tarefa</a></td>
                </tr>
            </tfoot>
        </table>
    </ul>
</body>
</html>
