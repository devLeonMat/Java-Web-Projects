/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.modelo.Pacientes;
import com.clinica.modelo.Personas;
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
                initPacientes(request, response);
                break;
            case 30:
                savePacientes(request, response);
                break;
            case 40:
                searchPacientes(request, response);
                break;
            default:
                obtainPacientes(request, response);
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
            for (Pacientes p : listPac) {
                System.out.println("pac-->"+p.getNumDocumento());
            }
            request.getSession().setAttribute("pacientes", listPac);
            request.getSession().setAttribute("oper", "LIST");

            request.getRequestDispatcher("pacientes.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(PacientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PacientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void initPacientes(HttpServletRequest request, HttpServletResponse response) {

        try {
            request.getSession().setAttribute("oper", "SEARCH");

            request.getRequestDispatcher("pacientes.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(PacientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PacientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void savePacientes(HttpServletRequest request, HttpServletResponse response) {

        Integer tipodoc = Integer.parseInt(request.getParameter("tipodoc"));
        String numDoc = request.getParameter("numdoc");
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String edad = request.getParameter("edad");
        String sexo = request.getParameter("sexo");
        String diag = request.getParameter("diagnostico");

        Personas per = new Personas(tipodoc, nombres, apellidos, edad, sexo, numDoc);

        boolean successComplete = false;
        boolean successPersona = pacientes.savePersona(per);
        if (successPersona) {
            Personas person = pacientes.findPersonaByNumDoc(numDoc);
            if (person != null) {
                Pacientes pac = new Pacientes(person.getIdPersona(), diag);
                boolean successPaciente = pacientes.savePaciente(pac);
                if (successPaciente) {
                    successComplete = true;
                }
            }
        }
        if (successComplete) {
            obtainPacientes(request, response);
        }

    }

    private void searchPacientes(HttpServletRequest request, HttpServletResponse response) {

        String numdoc = request.getParameter("numDoc");
        String valid = "";
        if (numdoc != null) {
            try {

                Pacientes paciente = pacientes.findPacienteByNumDoc(numdoc);
                if (paciente != null) {
                    request.getSession().setAttribute("paciente", paciente);
                    valid = "SUCCESS";
                } else {
                    valid = "UNSUCCESS";
                }
                request.getSession().setAttribute("confirmsearch", valid);
                request.getSession().setAttribute("oper", "SEARCH");

                request.getRequestDispatcher("pacientes.jsp").forward(request, response);
            } catch (ServletException ex) {
                Logger.getLogger(PacientesServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PacientesServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
