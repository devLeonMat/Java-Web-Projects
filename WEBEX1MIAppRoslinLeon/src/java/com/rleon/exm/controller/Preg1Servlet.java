/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rleon.exm.controller;

import com.rleon.exm.model.Sumandos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.rleon.exm.utils.Utils;

/**
 *
 * @author RLEON
 */
@WebServlet(name = "Preg1Servlet", urlPatterns = {"/preg1"})
public class Preg1Servlet extends HttpServlet {

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
            out.println("<title>Servlet Preg1Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Preg1Servlet at " + request.getContextPath() + "</h1>");
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

        List<Sumandos> sumas = new ArrayList<>();

        Sumandos sum = new Sumandos();
        sum.setNum1(2);
        sum.setNum2(4);
        sum.setResult(Utils.validSuma(sum.getNum1(), sum.getNum2()));
        sumas.add(sum);

        sum = new Sumandos();
        sum.setNum1(2);
        sum.setNum2(5);
        sum.setResult(Utils.validSuma(sum.getNum1(), sum.getNum2()));
        sumas.add(sum);

        sum = new Sumandos();
        sum.setNum1(8);
        sum.setNum2(10);
        sum.setResult(Utils.validSuma(sum.getNum1(), sum.getNum2()));
        sumas.add(sum);

        sum = new Sumandos();
        sum.setNum1(7);
        sum.setNum2(5);
        sum.setResult(Utils.validSuma(sum.getNum1(), sum.getNum2()));
        sumas.add(sum);

        request.getSession().setAttribute("sumas", sumas);
        request.getRequestDispatcher("preg1.jsp").forward(request, response);

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
        processRequest(request, response);
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
