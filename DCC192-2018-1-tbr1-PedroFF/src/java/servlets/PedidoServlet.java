package servlets;

import java.io.IOException;
import java.time.LocalTime;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ufjf.br.dcc192.Item;
import ufjf.br.dcc192.ItemPedido;
import ufjf.br.dcc192.ListaDeMesas;
import ufjf.br.dcc192.Mesa;
import ufjf.br.dcc192.Pedido;

@WebServlet(name = "Pedido", urlPatterns = {"/pedido.html", "/editar-pedido.html", "/novo-pedido.html", "/fechar-pedido.html","/relatorio-pedido.html"})
public class PedidoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        if ("/pedido.html".equals(request.getServletPath())) {
            Mesa mesa = ListaDeMesas.getInstance().get(Integer.parseInt(request.getParameter("mesa")));
            request.setAttribute("mesa", mesa);
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/pedidos.jsp");
            despachante.forward(request, resp);
        } else if ("/editar-pedido.html".equals(request.getServletPath())) {
            Mesa mesa = ListaDeMesas.getInstance().get(Integer.parseInt(request.getParameter("mesa")));
            Pedido pedido = mesa.getPedidos().get(Integer.parseInt(request.getParameter("pedido")));
            request.setAttribute("mesa", mesa);
            request.setAttribute("pedido", pedido);
            if(pedido.getConta()==false){
                RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/relatorio-pedido.jsp");
                despachante.forward(request, resp);
            }else{
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/editar-pedido.jsp");
            despachante.forward(request, resp);
            }
        } else if ("/novo-pedido.html".equals(request.getServletPath())) {
            Mesa mesa = ListaDeMesas.getInstance().get(Integer.parseInt(request.getParameter("mesa")));
            request.setAttribute("mesa", mesa);
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/novo-pedido.jsp");
            despachante.forward(request, resp);
        } else if ("/fechar-pedido.html".equals(request.getServletPath())) {
            Mesa mesa = ListaDeMesas.getInstance().get(Integer.parseInt(request.getParameter("mesa")));
            Pedido pedido = mesa.getPedidos().get(Integer.parseInt(request.getParameter("pedido")));
            request.setAttribute("mesa", mesa);
            request.setAttribute("pedido", pedido);
            pedido.setConta(false);
            pedido.setHoraFechamento(LocalTime.now());
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/relatorio-pedido.jsp");
            despachante.forward(request, resp);
        } else if ("/relatorio-pedido.html".equals(request.getServletPath())) {
            Mesa mesa = ListaDeMesas.getInstance().get(Integer.parseInt(request.getParameter("mesa")));
            Pedido pedido = mesa.getPedidos().get(Integer.parseInt(request.getParameter("pedido")));
            request.setAttribute("mesa", mesa);
            request.setAttribute("pedido", pedido);
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/relatorio-pedido.jsp");
            despachante.forward(request, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("alteracao".equals(req.getParameter("alteracao"))) {
            Mesa mesa = ListaDeMesas.getInstance().get(Integer.parseInt(req.getParameter("mesa")));
            Pedido pedido = mesa.getPedidos().get(Integer.parseInt(req.getParameter("codigo")));
            int i = Integer.parseInt(req.getParameter("bebida"));
            ItemPedido itemPedido = new ItemPedido(ItemPedido.getItens().get(i), Integer.parseInt(req.getParameter("qtd")));
            pedido.getItensProduto().add(itemPedido);
            pedido.acrescentaFinal(itemPedido.getQuantidade()*itemPedido.getItem().getPreco(), pedido);
            resp.sendRedirect("mesas.html");
        }else{ 
            Mesa mesa = ListaDeMesas.getInstance().get(Integer.parseInt(req.getParameter("mesa")));
            int i = Integer.parseInt(req.getParameter("bebida"));
            ItemPedido itemPedido = new ItemPedido(ItemPedido.getItens().get(i), Integer.parseInt(req.getParameter("qtd"))); 
            mesa.getPedidos().add(new Pedido(itemPedido));
            resp.sendRedirect("mesas.html");
        }

    }

}
