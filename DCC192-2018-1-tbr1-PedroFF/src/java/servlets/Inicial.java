package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ufjf.br.dcc192.ListaDeMesas;
import ufjf.br.dcc192.Mesa;

@WebServlet(name = "Inicial", urlPatterns = {"/index.html","/mesas.html","/nova-mesa.html"})
public class Inicial extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        if ("/index.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/index.jsp");
            despachante.forward(request, resp);
        } else if ("/mesas.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/mesas.jsp");
            despachante.forward(request, resp);
        }else if ("/nova-mesa.html".equals(request.getServletPath())) {
            ListaDeMesas.getInstance().add(new Mesa());
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/mesas.jsp");
            despachante.forward(request, resp);
        }
    }

}
