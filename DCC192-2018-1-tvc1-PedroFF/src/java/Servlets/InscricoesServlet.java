/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ufjf.br.dcc192.Anfitriao;
import ufjf.br.dcc192.Intercambista;
import ufjf.br.dcc192.ListaDeAnfitriao;
import ufjf.br.dcc192.ListaDeIntercambista;

/**
 *
 * @author Pedro
 */
@WebServlet(name = "InscricoesServlet", urlPatterns = {"/inscricoes.html", "/anfitriao.html", "/intercambista.html","compatibilidades.html"})
public class InscricoesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/inscricoes.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/inscricoes.jsp");
            despachante.forward(request, response);
        } else if ("/intercambista.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/intercambista.jsp");
            despachante.forward(request, response);
        } else if ("/anfitriao.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/anfitriao.jsp");
            despachante.forward(request, response);
        }else if ("/compatibilidades.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/compatibilidades.jsp");
            despachante.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("anfitriao".equals(req.getParameter("anfitriao"))) {
            String cat,nome,disp;
            cat = req.getParameter("cat");
            nome = req.getParameter("nome");
            disp = req.getParameter("disp");
            ListaDeAnfitriao.getInstance().add(new Anfitriao(nome, cat, disp));
            resp.sendRedirect("index.html");
        }else{
            String pais,nome,est;
            pais = req.getParameter("pais");
            nome = req.getParameter("nome");
            est = req.getParameter("est");
            ListaDeIntercambista.getInstance().add(new Intercambista(nome, pais, est));
            resp.sendRedirect("index.html");
        }
    }
    
}
