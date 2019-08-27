package com.restaurante.controlador;

import com.restaurante.modelo.Plato;
import com.restaurante.modelo.dao.IDaoPlato;
import com.restaurante.modelo.dao.impl.DaoPlato;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EXTENSION
 */
@WebServlet(name = "PlatoServlet", urlPatterns = {"/PlatoAdmin"})
public class PlatoServlet extends HttpServlet {

    IDaoPlato daoPlato = new DaoPlato();

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
        String accion = request.getParameter("accion");
        Plato p = new Plato();
        String resultado;
        List<Plato> listPlatos = new ArrayList<>();
        if (accion == null) {
            listPlatos = daoPlato.listarPlatos();
            accion = new String();
        }

        if (accion.equalsIgnoreCase("nuevo")) {
            System.out.println("Abir formulario");
        }
        if (accion.equalsIgnoreCase("listar")) {
            listPlatos = daoPlato.listarPlatos();
        }
        if (accion.equalsIgnoreCase("obtener")) {
            listPlatos = daoPlato.listarPlatos();
        }
        if (accion.equalsIgnoreCase("REGISTRAR")) {
            System.out.println(" Registramos el plato ");
            p.setNombre(request.getParameter("nombre"));
            p.setPrecio(Double.valueOf(request.getParameter("precio")));
            resultado = daoPlato.insPlato(p);

            if (resultado == null) {
                System.out.println(" se inserto ");
                accion = "LISTAR";
            }
            listPlatos = daoPlato.listarPlatos();
            accion = "LISTAR";
        }
        if (accion.equalsIgnoreCase("OBTENER")) {
            p = daoPlato.getPlato(Integer.valueOf(request.getParameter("idPlato")));
        }

        request.getSession().setAttribute("accion", accion);
        request.getSession().setAttribute("plato", p);
        request.getSession().setAttribute("listPlatos", listPlatos);
        request.getRequestDispatcher("gestionaPlato.jsp").forward(request, response);

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
