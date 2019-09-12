/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.modelo.Pacientes;
import com.clinica.modelo.dao.PacientesDao;
import com.clinica.modelo.dao.impl.PacientesDaoImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leon Matias R.
 */
@WebServlet(name = "PacientesServlet", urlPatterns = {"/Pacientes"})
public class PacientesServlet extends HttpServlet {

    PacientesDao pacientes = new PacientesDaoImpl();

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

        Integer func = Integer.parseInt(request.getParameter("FUNC"));

        switch (func) {
            case 10:
                obtainPacientes(request, response);
                break;
            case 20:
                // code block
                break;
            default:
            // code block
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
        processRequest(request, response);
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

    private void obtainPacientes(HttpServletRequest request, HttpServletResponse response) {

        List<Pacientes> listPac = new ArrayList<>();
        listPac = pacientes.getPacientes();
        try {
            request.getSession().setAttribute("pacientes", listPac);
            request.getSession().setAttribute("oper", "LIST");

            request.getRequestDispatcher("pacientes.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(PacientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PacientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
