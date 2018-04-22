package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Pedido", urlPatterns = {"/pedido.html","/editar-pedido.html","/novo-pedido.html","/fechar-pedido.html"})
public class PedidoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("/pedido.html".equals(req.getServletPath())) {
            int mesa = Integer.parseInt(req.getParameter("mesa"));
            req.setAttribute("mesa", mesa);
            RequestDispatcher despachante = req.getRequestDispatcher("/WEB-INF/pedidos.jsp");
            despachante.forward(req, resp);
        }

    }
}    
