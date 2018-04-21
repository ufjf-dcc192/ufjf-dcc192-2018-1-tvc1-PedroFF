package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListarTarefas", urlPatterns = {"/listar.html", "/nova.html", "/troca-estado.html", "/tarefa-editar.html","/tarefa-excluir.html"})
public class ListarTarefas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/listar.html".equals(request.getServletPath())) {
            listarTarefas(request, response);
        } else if ("/nova.html".equals((request.getServletPath()))) {
            criarTarefaForm(request, response);
        } else if ("/troca-estado.html".equals(request.getServletPath())) {
            trocarEstado(request, response);
        } else if ("/tarefa-editar.html".equals(request.getServletPath())) {
            editarTarefa(request, response);
        } else if ("/tarefa-excluir.html".equals(request.getServletPath())) {
            excluiTarefa(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        if (request.getParameter("alteracao") != null) {

            int indice = Integer.parseInt(request.getParameter("alteracao"));
            String titulo = request.getParameter("titulo");
            String descricao = request.getParameter("descricao");
            ListaDeTarefas.getInstance().get(indice).setDescricao(descricao);
            ListaDeTarefas.getInstance().get(indice).setTitulo(titulo);
            response.sendRedirect("listar.html");
        } else {
            String titulo = request.getParameter("titulo");
            String descricao = request.getParameter("descricao");
            Tarefa novaTarefa = new Tarefa(titulo, descricao, false);
            ListaDeTarefas.getInstance().add(novaTarefa);
            response.sendRedirect("listar.html");
        }
    }

    private void listarTarefas(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Tarefa> tarefas = ListaDeTarefas.getInstance();
        request.setAttribute("tarefas", tarefas);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-tarefas.jsp");
        despachante.forward(request, response);
    }

    private void criarTarefaForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefas-novo.jsp");
        despachante.forward(request, response);
    }

    private void trocarEstado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-tarefas.jsp");
        //despachante.forward(request, response);
        int linha = Integer.parseInt(request.getParameter("linha"));
        ListaDeTarefas.getInstance().get(linha).setConcluida(!ListaDeTarefas.getInstance().get(linha).getConcluida());
        response.sendRedirect("listar.html");
    }

    private void editarTarefa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int linha = Integer.parseInt(request.getParameter("linha"));
        Tarefa tarefa = ListaDeTarefas.getInstance().get(linha);
        request.setAttribute("tarefa", tarefa);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefa-editar.jsp");
        despachante.forward(request, response);
    }
    
        private void excluiTarefa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int linha = Integer.parseInt(request.getParameter("linha"));
        ListaDeTarefas.getInstance().remove(linha);
        response.sendRedirect("listar.html");
    }

}
