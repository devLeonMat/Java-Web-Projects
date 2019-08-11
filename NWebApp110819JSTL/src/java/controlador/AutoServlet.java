package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Auto;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "AutoServlet", urlPatterns = {"/AutoServlet"})
public class AutoServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Auto auto = new Auto();
        List<Auto> autos = new ArrayList<>();
        
        auto.setPlaca("AXK-215");
        auto.setColor("Negro");
        auto.setMarca("BMW");
        auto.setPrecio("500000");
        auto.setModelo("Murcielago");
        
        autos.add(auto);
        auto = new Auto();
        auto.setPlaca("MAN-258");
        auto.setColor("Blanco");
        auto.setMarca("Audi");
        auto.setPrecio("350000");
        auto.setModelo("sport");
        autos.add(auto);
        
        
        auto = new Auto();
        auto.setPlaca("MAN-258");
        auto.setColor("Rojo");
        auto.setMarca("Porsche");
        auto.setPrecio("350000");
        auto.setModelo("sport");
        autos.add(auto);
        
        
        auto = new Auto();
        auto.setPlaca("MAN-258");
        auto.setColor("Azul");
        auto.setMarca("Bently");
        auto.setPrecio("350000");
        auto.setModelo("sport");
        autos.add(auto);
        
        auto = new Auto();
        auto.setPlaca("MAN-258");
        auto.setColor("Gris");
        auto.setMarca("Rolls Royce");
        auto.setPrecio("350000");
        auto.setModelo("sport");
        autos.add(auto);
        
        
        
        
        request.getSession().setAttribute("auto", auto);
        request.getSession().setAttribute("autos", autos);
        request.getRequestDispatcher("ejercicio3.jsp").forward(request, response);
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
