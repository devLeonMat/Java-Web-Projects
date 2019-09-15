/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.modelo.Pacientes;
import com.clinica.modelo.dao.PacientesDao;
import com.clinica.modelo.dao.impl.PacientesDaoImpl;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author EXTENSION
 */
@WebServlet(name = "EstadisticasServlet", urlPatterns = {"/Estadisticas"})
public class EstadisticasServlet extends HttpServlet {

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

        List<Pacientes> lista = pacientes.getPacientes();

        gestionaGraficoPYE(request, response, lista, true);

        request.getRequestDispatcher("estadisticas.jsp").forward(request, response);

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

    private void gestionaGraficoPYE(HttpServletRequest request, HttpServletResponse response, List<Pacientes> lista, boolean view) throws IOException {
        response.setContentType("image/jpeg");
        OutputStream out = response.getOutputStream();
        PieDataset pieDataset = generaDatos(lista, view);
        JFreeChart grafico = generaGrafico(pieDataset);
        ChartUtilities.writeChartAsJPEG(out, 1.0f, grafico, 400, 250);
//        ChartUtilities.writeChartAsJPEG(out, grafico, 800, 500);
        out.close();
    }

    private JFreeChart generaGrafico(PieDataset pieDataset) {
        JFreeChart jfc = ChartFactory.createPieChart3D("pacientes", pieDataset, true, true, false);
        PiePlot3D piePlot = (PiePlot3D) jfc.getPlot();
        piePlot.setBackgroundPaint(Color.ORANGE);
        piePlot.setForegroundAlpha(0.5F);
        piePlot.setOutlineVisible(true);
        return jfc;
    }

    private PieDataset generaDatos(List<Pacientes> lista, boolean view) {
        DefaultPieDataset datos = new DefaultPieDataset();
        int count1=0; 
        int count2=0; 
        for (Pacientes p : lista) {
            if(p.getEstado()==0){
                count2++;
            }else{
                count1++;               
            }
        }
            datos.setValue("De Alta",count1 );
            datos.setValue("Internados",count2 );
        return datos;
    }

}
