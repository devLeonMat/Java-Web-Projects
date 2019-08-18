/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rleon.exm.controller;

import com.rleon.exm.model.Articulos;
import com.rleon.exm.model.Utiles;
import com.rleon.exm.utils.Utils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RLEON
 */
@WebServlet(name = "Preg4Servlet", urlPatterns = {"/Preg4"})
public class Preg4Servlet extends HttpServlet {

    List<Articulos> listArticulos = new ArrayList<>();
    double total = 0;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Preg4Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Preg4Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Articulos> listArticulos = new ArrayList<>();

        request.getSession().setAttribute("utiles", Utils.getUtiles());
        request.getSession().setAttribute("listArticulos", listArticulos);
        request.getSession().setAttribute("total", total);
        request.getRequestDispatcher("preg4.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String value = request.getParameter("selectUtiles");
        String cantidad = request.getParameter("cantidad");

        Optional<Utiles> utiles = Utils.getUtiles().stream()
                .filter(s -> value.equals(String.valueOf(s.getId())))
                .findFirst();

        Utiles util = utiles.isPresent() ? utiles.get() : null;

        Articulos a = new Articulos();
        a.setId(util.getId());
        a.setDescripcion(util.getNombre());
        a.setCant(cantidad);
        a.setPrecio(util.getPrecio());
        a.setPromocion(String.valueOf(util.getPromocion()));
        listArticulos.add(a);

        total += Double.parseDouble(cantidad) * util.getPrecio();

        request.getSession().setAttribute("total", total);
        request.getSession().setAttribute("utiles", Utils.getUtiles());
        request.getSession().setAttribute("listArticulos", listArticulos);

        request.getRequestDispatcher("preg4.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
