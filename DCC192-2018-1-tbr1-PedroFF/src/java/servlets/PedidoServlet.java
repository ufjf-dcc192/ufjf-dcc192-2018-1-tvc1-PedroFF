package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ufjf.br.dcc192.ListaDeMesas;
import ufjf.br.dcc192.Mesa;

@WebServlet(name = "Pedido", urlPatterns = {"/pedido.html","/editar-pedido.html","/novo-pedido.html","/fechar-pedido.html"})
public class PedidoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        if ("/pedido.html".equals(request.getServletPath())) {
            Mesa mesa = ListaDeMesas.getInstance().get(Integer.parseInt(request.getParameter("mesa")));
            request.setAttribute("mesa", mesa);
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/pedidos.jsp");
            despachante.forward(request, resp);
        }else if("/editar-pedido.html".equals(request.getServletPath())){
            
        }

    }
}    
