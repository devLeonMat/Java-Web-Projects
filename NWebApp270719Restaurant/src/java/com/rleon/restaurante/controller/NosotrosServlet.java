package com.rleon.restaurante.controller;

import com.rleon.restaurante.model.Nosotros;
import com.rleon.restaurante.utils.SuperServlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leon Matias R.
 */
@WebServlet(name = "NosotrosServlet", urlPatterns = {"/Nosotros"})
public class NosotrosServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ingresa al Post");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Nosotros n = new Nosotros();

        String title = "¿Quienes Somos?";
        String story = "Unas líneas de nuestra Historia... Un sábado 05 de Julio de 1981 nos recuerda la fecha en que El restaurante campestre Palermo Peru abrió su primer local habiendo estado ubicado inicialmente en la Av. Nueva Toledo, Mzna. R, Lote 13, distrito de Cieneguilla, provincia de Lima, departamento de Lima. Comenzó como un restaurante especializado en la preparación de comida de campo, con servicios domésticos y contando con solo 6 mesas para la atención al público.";
        story += "Palermo Peru pertenece a la familia Zuñiga Marina, que por motivos de trabajo hasta el año 1965 estuvo vinculada a la gestión de uno de los mejores restaurantes de Lima, siendo la practica el mayor soporte para que Mamá, papá y 6 hermanos se lanzaran a la aventura de tener su restaurante pese a la falta de recursos económicos que dicho emprendimiento les requería en esos años. Durante los primeros cinco años trabajaron solo como un grupo familiar voluntarioso y es recién en el año 1986 donde deciden organizarse empresarialmente y constituir Inversiones Palermo S.A, empresa que actualmente posee los activos donde funciona el restaurante campestre Palermo bajo la razón social de Restaurant Palermo SAC.";
        String mision = "Elaborar la mejor comida peruana con una sazón especial, utilizando productos de muy buena calidad, ofrecida a través de un excelente servicio, logrado mediante una capacitación continua de nuestros colaboradores que se identifican plenamente con la esencia del negocio.";
        String vision = "Una sólida corporación especializada en gastronomía peruana con proyección nacional e internacional.";
        
        n.setTittle(title);
        n.setText(story);
        n.setPath( "img/chefs.jpg");
        n.setMision(mision);
        n.setVision(vision);
        
        
        req.getSession().setAttribute("story", n);        
            
        req.getRequestDispatcher("/pages/nosotros.jsp").forward(req, resp);
    }

}
