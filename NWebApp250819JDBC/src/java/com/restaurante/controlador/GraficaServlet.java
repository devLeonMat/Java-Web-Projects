/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.controlador;

import com.restaurante.modelo.Plato;
import com.restaurante.modelo.dao.IDaoPlato;
import com.restaurante.modelo.dao.impl.DaoPlato;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
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
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author EXTENSION
 */
@WebServlet(name = "GraficaServlet", urlPatterns = {"/Grafica"})
public class GraficaServlet extends HttpServlet {

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

        String accion = request.getParameter("accion");
        IDaoPlato daoPlato = new DaoPlato();
        List<Plato> lista = daoPlato.listarPlatos();
        System.out.println(" la lista tiene " + lista.size() + " platos ");

        if (accion == null) {
            accion = "";
            System.out.println(" estoy en la accion nula y por eso lo seteo con vacio ");
        } else if (accion.equals("PYEDA")) {

            System.out.println(" estoy en grafico de PYE ");
            gestionaGraficoPYE(request, response, lista, true);
        } else if (accion.equals("PYEDB")) {

            System.out.println(" estoy en grafico de PYE ");
            gestionaGraficoPYE(request, response, lista, false);
        } else if (accion.equals("BARRA")) {
            System.out.println(" estoy en grafico de Barra ");
            gestionaGraficoBarras(request, response, lista);
        }
        request.getSession().setAttribute("accion", accion);
        accion = "";
        request.getRequestDispatcher("gestionaGrafico.jsp").forward(request, response);

    }

    private void gestionaGraficoPYE(HttpServletRequest request, HttpServletResponse response, List<Plato> lista, boolean view) throws IOException {
        response.setContentType("image/jpeg");
        OutputStream out = response.getOutputStream();
        PieDataset pieDataset = generaDatos(lista, view);
        JFreeChart grafico = generaGrafico(pieDataset);
        ChartUtilities.writeChartAsJPEG(out, 1.0f, grafico, 400, 250);
//        ChartUtilities.writeChartAsJPEG(out, grafico, 800, 500);
        out.close();
    }

    private void gestionaGraficoBarras(HttpServletRequest request, HttpServletResponse response, List<Plato> lista) throws IOException {
        OutputStream out = null;
        try {
            out = response.getOutputStream();
            response.setContentType("image/jpeg");
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (Plato plato : lista) {
                dataset.addValue(plato.getPrecio(), "Precio", plato.getNombre());
            }
            JFreeChart chart = ChartFactory.createBarChart("Tabla de Precios", "Nombre", "Precio", dataset, PlotOrientation.VERTICAL, true, true, true);
            ChartUtilities.writeChartAsJPEG(out, chart, 600, 300);

            System.out.println(" genero el grafico de barras... ");
        } catch (Exception e) {
            e.printStackTrace();;
            System.out.println(" error --> " + e.getMessage());
        } finally {
            out.close();
        }
    }

    private JFreeChart generaGrafico(PieDataset pieDataset) {
        JFreeChart jfc = ChartFactory.createPieChart3D("PLATOS DISPONIBLES", pieDataset, true, true, false);
        PiePlot3D piePlot = (PiePlot3D) jfc.getPlot();
        piePlot.setBackgroundPaint(Color.ORANGE);
        piePlot.setForegroundAlpha(0.5F);
        piePlot.setOutlineVisible(true);
        return jfc;
    }

    private PieDataset generaDatos(List<Plato> lista, boolean view) {
        DefaultPieDataset datos = new DefaultPieDataset();
        for (Plato plato : lista) {
            if (view) {
                if (plato.getEstado() != 0) {
                    datos.setValue(plato.getNombre(), plato.getPrecio());
                }
            } else {
                if (plato.getEstado() == 0) {
                    datos.setValue(plato.getNombre(), plato.getPrecio());
                }
            }
        }
        return datos;
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

}
