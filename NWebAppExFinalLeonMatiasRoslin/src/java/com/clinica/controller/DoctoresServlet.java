/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.modelo.Doctores;
import com.clinica.modelo.Pacientes;
import com.clinica.modelo.Personas;
import com.clinica.modelo.dao.MedicosDao;
import com.clinica.modelo.dao.PacientesDao;
import com.clinica.modelo.dao.impl.MedicosDaoImpl;
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
@WebServlet(name = "DoctoresServlet", urlPatterns = {"/Doctores"})
public class DoctoresServlet extends HttpServlet {

    MedicosDao medicos = new MedicosDaoImpl();
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
                obtainMedics(request, response);
                break;
            case 20:
                initMedicos(request, response);
                break;            
            case 30:
                saveMedico(request, response);
                break;            
            case 40:
                searchMedico(request, response);
                break;
            default:
                obtainMedics(request, response);
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

    private void obtainMedics(HttpServletRequest request, HttpServletResponse response) {

        List<Doctores> listDoc = new ArrayList<>();
        listDoc = medicos.getMedicos();
        try {
            request.getSession().setAttribute("doctores", listDoc);
            request.getSession().setAttribute("oper", "LIST");

            request.getRequestDispatcher("medicos.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(DoctoresServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DoctoresServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void initMedicos(HttpServletRequest request, HttpServletResponse response) {

        try {
            request.getSession().setAttribute("oper", "SEARCH");

            request.getRequestDispatcher("medicos.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(DoctoresServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DoctoresServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void saveMedico(HttpServletRequest request, HttpServletResponse response) {

        Integer tipodoc = Integer.parseInt(request.getParameter("tipodoc"));
        String numDoc = request.getParameter("numdoc");
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String edad = request.getParameter("edad");
        String sexo = request.getParameter("sexo");
        String esp = request.getParameter("especialidad");

        Personas per = new Personas(tipodoc, nombres, apellidos, edad, sexo, numDoc);

        boolean successComplete = false;
        boolean successPersona = pacientes.savePersona(per);
        if (successPersona) {
            Personas person = pacientes.findPersonaByNumDoc(numDoc);
            if (person != null) {
                Doctores doc = new Doctores(person.getIdPersona(), esp);
                boolean successMedic = medicos.saveMedic(doc);
                if (successMedic) {
                    successComplete = true;
                }
            }
        }
        if (successComplete) {
            obtainMedics(request, response);
        }

    }

    private void searchMedico(HttpServletRequest request, HttpServletResponse response) {

        String numdoc = request.getParameter("numDoc");
        String valid = "";
        if (numdoc != null) {
            try {

                Doctores doctores = medicos.findDocByNumDoc(numdoc);
                if (doctores != null) {
                    request.getSession().setAttribute("doctor", doctores);
                    valid = "SUCCESS";
                } else {
                    valid = "UNSUCCESS";
                }
                request.getSession().setAttribute("confirmsearch", valid);
                request.getSession().setAttribute("oper", "SEARCH");

                request.getRequestDispatcher("medicos.jsp").forward(request, response);
            } catch (ServletException ex) {
                Logger.getLogger(DoctoresServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DoctoresServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
