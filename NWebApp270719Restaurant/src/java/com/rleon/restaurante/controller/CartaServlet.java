package com.rleon.restaurante.controller;

import com.google.gson.Gson;
import com.rleon.restaurante.model.Platos;
import com.rleon.restaurante.model.Plato;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leon Matias R.
 */
@WebServlet(name = "CartaServlet", urlPatterns = {"/carta"})
public class CartaServlet extends HttpServlet {

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

        String JsonReceta = "{\n"
                + "  \"Platos\": [\n"
                + "    {\n"
                + "      \"nomPlato\": \"Seco de Cabrito\",\n"
                + "      \"descrip\": \"El Seco de Cabrito con frejoles, es una comida emblemática del norte de Perú, con diferencias distintivas de algunas regiones. El ingrediente principal de esta preparación es la carne tierna del cabrito que se acompaña con unos ricos frejoles bien sazonados y con una buena porción de arroz blanco.\",\n"
                + "      \"img\": \"img/p1.jpg\",\n"
                + "      \"receta\": {\n"
                + "        \"nomPlato\": \"Seco de Cabrito\",\n"
                + "        \"ingredientes\": \"kilo de cabrito tazas de chicha de jora sin dulce cebolla roja grande picada en cuadritos  tomate picado en cuadritos  ají amarillo licuado  cucharadas de ajo molido cucharadas de zapallo loche cortado en cuadros  cucharadas de aceite de oliva  taza de hojas de culantro (cilantro) picado Sal y pimienta al gusto tazas de arroz cocido \",\n"
                + "        \"receta\": \" Trocea el cabrito en 8 partes, condiméntalos con sal, pimienta y una cucharadita de ajos molidos. Añádele la chicha de jora y déjalo reposar por 2 horas Pasado las dos horas, calienta una olla grande con aceite caliente y prepara un aderezo con la cebolla picada y el tomate picado hasta que la cebolla quede media transparente y el tomate se haya reducido Al aderezo anterior agrega los trozos de cabrito junto con sus jugos (líquidos) y también el culantro, el ají amarillo y el zapallo loche cortado en cuadritos. Deja cocinar todo a fuego medio durante o  minutos aproximadamente hasta que el cabrito quede tierno Mientras se cocina el cabrito prepara los frejoles. Coloca en una olla los frejoles con agua y cúbrelos con agua que sobrepase, agrega la costilla de chancho, el trozo de pellejo de chancho. Déjalo a cocinar hasta que los frejoles queden cremosos. El tiempo de cocción depende del tipo de frejoles. Cuando los frejoles estén casi listos, prepara un aderezo de cebolla, ajo molido, sal y pimienta y agrégalo a los frejoles y déjalos durante el tiempo que terminen de cocinarse los frejole El Seco de Cabrito se suele acompañar con arroz blanco y yuca.  \"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"nomPlato\": \"Lomo Saltado\",\n"
                + "      \"descrip\": \"El Seco de Cabrito con frejoles, es una comida emblemática del norte de Perú, con diferencias distintivas de algunas regiones. El ingrediente principal de esta preparación es la carne tierna del cabrito que se acompaña con unos ricos frejoles bien sazonados y con una buena porción de arroz blanco.\",\n"
                + "      \"img\": \"img/p2.jpg\",\n"
                + "      \"receta\": {\n"
                + "        \"nomPlato\": \"Lomo Saltado\",\n"
                + "        \"ingredientes\": \"kilo de cabrito tazas de chicha de jora sin dulce cebolla roja grande picada en cuadritos  tomate picado en cuadritos  ají amarillo licuado  cucharadas de ajo molido cucharadas de zapallo loche cortado en cuadros  cucharadas de aceite de oliva  taza de hojas de culantro (cilantro) picado Sal y pimienta al gusto tazas de arroz cocido \",\n"
                + "        \"receta\": \" Trocea el cabrito en 8 partes, condiméntalos con sal, pimienta y una cucharadita de ajos molidos. Añádele la chicha de jora y déjalo reposar por 2 horas Pasado las dos horas, calienta una olla grande con aceite caliente y prepara un aderezo con la cebolla picada y el tomate picado hasta que la cebolla quede media transparente y el tomate se haya reducido Al aderezo anterior agrega los trozos de cabrito junto con sus jugos (líquidos) y también el culantro, el ají amarillo y el zapallo loche cortado en cuadritos. Deja cocinar todo a fuego medio durante o  minutos aproximadamente hasta que el cabrito quede tierno Mientras se cocina el cabrito prepara los frejoles. Coloca en una olla los frejoles con agua y cúbrelos con agua que sobrepase, agrega la costilla de chancho, el trozo de pellejo de chancho. Déjalo a cocinar hasta que los frejoles queden cremosos. El tiempo de cocción depende del tipo de frejoles. Cuando los frejoles estén casi listos, prepara un aderezo de cebolla, ajo molido, sal y pimienta y agrégalo a los frejoles y déjalos durante el tiempo que terminen de cocinarse los frejole El Seco de Cabrito se suele acompañar con arroz blanco y yuca.  \"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"nomPlato\": \"Papa a la Huancaina\",\n"
                + "      \"descrip\": \"El Seco de Cabrito con frejoles, es una comida emblemática del norte de Perú, con diferencias distintivas de algunas regiones. El ingrediente principal de esta preparación es la carne tierna del cabrito que se acompaña con unos ricos frejoles bien sazonados y con una buena porción de arroz blanco.\",\n"
                + "      \"img\": \"img/p3.jpg\",\n"
                + "      \"receta\": {\n"
                + "        \"nomPlato\": \"Papa a la Huancaina\",\n"
                + "        \"ingredientes\": \"kilo de cabrito tazas de chicha de jora sin dulce cebolla roja grande picada en cuadritos  tomate picado en cuadritos  ají amarillo licuado  cucharadas de ajo molido cucharadas de zapallo loche cortado en cuadros  cucharadas de aceite de oliva  taza de hojas de culantro (cilantro) picado Sal y pimienta al gusto tazas de arroz cocido \",\n"
                + "        \"receta\": \" Trocea el cabrito en 8 partes, condiméntalos con sal, pimienta y una cucharadita de ajos molidos. Añádele la chicha de jora y déjalo reposar por 2 horas Pasado las dos horas, calienta una olla grande con aceite caliente y prepara un aderezo con la cebolla picada y el tomate picado hasta que la cebolla quede media transparente y el tomate se haya reducido Al aderezo anterior agrega los trozos de cabrito junto con sus jugos (líquidos) y también el culantro, el ají amarillo y el zapallo loche cortado en cuadritos. Deja cocinar todo a fuego medio durante o  minutos aproximadamente hasta que el cabrito quede tierno Mientras se cocina el cabrito prepara los frejoles. Coloca en una olla los frejoles con agua y cúbrelos con agua que sobrepase, agrega la costilla de chancho, el trozo de pellejo de chancho. Déjalo a cocinar hasta que los frejoles queden cremosos. El tiempo de cocción depende del tipo de frejoles. Cuando los frejoles estén casi listos, prepara un aderezo de cebolla, ajo molido, sal y pimienta y agrégalo a los frejoles y déjalos durante el tiempo que terminen de cocinarse los frejole El Seco de Cabrito se suele acompañar con arroz blanco y yuca.  \"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"nomPlato\": \"Arroz con Pollo\",\n"
                + "      \"descrip\": \"El Seco de Cabrito con frejoles, es una comida emblemática del norte de Perú, con diferencias distintivas de algunas regiones. El ingrediente principal de esta preparación es la carne tierna del cabrito que se acompaña con unos ricos frejoles bien sazonados y con una buena porción de arroz blanco.\",\n"
                + "      \"img\": \"img/p4.jpg\",\n"
                + "      \"receta\": {\n"
                + "        \"nomPlato\": \"Arroz con Pollo\",\n"
                + "        \"ingredientes\": \"kilo de cabrito tazas de chicha de jora sin dulce cebolla roja grande picada en cuadritos  tomate picado en cuadritos  ají amarillo licuado  cucharadas de ajo molido cucharadas de zapallo loche cortado en cuadros  cucharadas de aceite de oliva  taza de hojas de culantro (cilantro) picado Sal y pimienta al gusto tazas de arroz cocido \",\n"
                + "        \"receta\": \" Trocea el cabrito en 8 partes, condiméntalos con sal, pimienta y una cucharadita de ajos molidos. Añádele la chicha de jora y déjalo reposar por 2 horas Pasado las dos horas, calienta una olla grande con aceite caliente y prepara un aderezo con la cebolla picada y el tomate picado hasta que la cebolla quede media transparente y el tomate se haya reducido Al aderezo anterior agrega los trozos de cabrito junto con sus jugos (líquidos) y también el culantro, el ají amarillo y el zapallo loche cortado en cuadritos. Deja cocinar todo a fuego medio durante o  minutos aproximadamente hasta que el cabrito quede tierno Mientras se cocina el cabrito prepara los frejoles. Coloca en una olla los frejoles con agua y cúbrelos con agua que sobrepase, agrega la costilla de chancho, el trozo de pellejo de chancho. Déjalo a cocinar hasta que los frejoles queden cremosos. El tiempo de cocción depende del tipo de frejoles. Cuando los frejoles estén casi listos, prepara un aderezo de cebolla, ajo molido, sal y pimienta y agrégalo a los frejoles y déjalos durante el tiempo que terminen de cocinarse los frejole El Seco de Cabrito se suele acompañar con arroz blanco y yuca.  \"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"nomPlato\": \"Causa Rellena\",\n"
                + "      \"descrip\": \"El Seco de Cabrito con frejoles, es una comida emblemática del norte de Perú, con diferencias distintivas de algunas regiones. El ingrediente principal de esta preparación es la carne tierna del cabrito que se acompaña con unos ricos frejoles bien sazonados y con una buena porción de arroz blanco.\",\n"
                + "      \"img\": \"img/p5.jpg\",\n"
                + "      \"receta\": {\n"
                + "        \"nomPlato\": \"Causa Rellena\",\n"
                + "        \"ingredientes\": \"kilo de cabrito tazas de chicha de jora sin dulce cebolla roja grande picada en cuadritos  tomate picado en cuadritos  ají amarillo licuado  cucharadas de ajo molido cucharadas de zapallo loche cortado en cuadros  cucharadas de aceite de oliva  taza de hojas de culantro (cilantro) picado Sal y pimienta al gusto tazas de arroz cocido \",\n"
                + "        \"receta\": \" Trocea el cabrito en 8 partes, condiméntalos con sal, pimienta y una cucharadita de ajos molidos. Añádele la chicha de jora y déjalo reposar por 2 horas Pasado las dos horas, calienta una olla grande con aceite caliente y prepara un aderezo con la cebolla picada y el tomate picado hasta que la cebolla quede media transparente y el tomate se haya reducido Al aderezo anterior agrega los trozos de cabrito junto con sus jugos (líquidos) y también el culantro, el ají amarillo y el zapallo loche cortado en cuadritos. Deja cocinar todo a fuego medio durante o  minutos aproximadamente hasta que el cabrito quede tierno Mientras se cocina el cabrito prepara los frejoles. Coloca en una olla los frejoles con agua y cúbrelos con agua que sobrepase, agrega la costilla de chancho, el trozo de pellejo de chancho. Déjalo a cocinar hasta que los frejoles queden cremosos. El tiempo de cocción depende del tipo de frejoles. Cuando los frejoles estén casi listos, prepara un aderezo de cebolla, ajo molido, sal y pimienta y agrégalo a los frejoles y déjalos durante el tiempo que terminen de cocinarse los frejole El Seco de Cabrito se suele acompañar con arroz blanco y yuca.  \"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"nomPlato\": \"Rocoto Relleno\",\n"
                + "      \"descrip\": \"El Seco de Cabrito con frejoles, es una comida emblemática del norte de Perú, con diferencias distintivas de algunas regiones. El ingrediente principal de esta preparación es la carne tierna del cabrito que se acompaña con unos ricos frejoles bien sazonados y con una buena porción de arroz blanco.\",\n"
                + "      \"img\": \"img/p6.jpg\",\n"
                + "      \"receta\": {\n"
                + "        \"nomPlato\": \"Rocoto Relleno\",\n"
                + "        \"ingredientes\": \"kilo de cabrito tazas de chicha de jora sin dulce cebolla roja grande picada en cuadritos  tomate picado en cuadritos  ají amarillo licuado  cucharadas de ajo molido cucharadas de zapallo loche cortado en cuadros  cucharadas de aceite de oliva  taza de hojas de culantro (cilantro) picado Sal y pimienta al gusto tazas de arroz cocido \",\n"
                + "        \"receta\": \" Trocea el cabrito en 8 partes, condiméntalos con sal, pimienta y una cucharadita de ajos molidos. Añádele la chicha de jora y déjalo reposar por 2 horas Pasado las dos horas, calienta una olla grande con aceite caliente y prepara un aderezo con la cebolla picada y el tomate picado hasta que la cebolla quede media transparente y el tomate se haya reducido Al aderezo anterior agrega los trozos de cabrito junto con sus jugos (líquidos) y también el culantro, el ají amarillo y el zapallo loche cortado en cuadritos. Deja cocinar todo a fuego medio durante o  minutos aproximadamente hasta que el cabrito quede tierno Mientras se cocina el cabrito prepara los frejoles. Coloca en una olla los frejoles con agua y cúbrelos con agua que sobrepase, agrega la costilla de chancho, el trozo de pellejo de chancho. Déjalo a cocinar hasta que los frejoles queden cremosos. El tiempo de cocción depende del tipo de frejoles. Cuando los frejoles estén casi listos, prepara un aderezo de cebolla, ajo molido, sal y pimienta y agrégalo a los frejoles y déjalos durante el tiempo que terminen de cocinarse los frejole El Seco de Cabrito se suele acompañar con arroz blanco y yuca.  \"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"nomPlato\": \"Tallarin Saltado\",\n"
                + "      \"descrip\": \"El Seco de Cabrito con frejoles, es una comida emblemática del norte de Perú, con diferencias distintivas de algunas regiones. El ingrediente principal de esta preparación es la carne tierna del cabrito que se acompaña con unos ricos frejoles bien sazonados y con una buena porción de arroz blanco.\",\n"
                + "      \"img\": \"img/p7.jpg\",\n"
                + "      \"receta\": {\n"
                + "        \"nomPlato\": \"Tallarin Saltado\",\n"
                + "        \"ingredientes\": \"kilo de cabrito tazas de chicha de jora sin dulce cebolla roja grande picada en cuadritos  tomate picado en cuadritos  ají amarillo licuado  cucharadas de ajo molido cucharadas de zapallo loche cortado en cuadros  cucharadas de aceite de oliva  taza de hojas de culantro (cilantro) picado Sal y pimienta al gusto tazas de arroz cocido \",\n"
                + "        \"receta\": \" Trocea el cabrito en 8 partes, condiméntalos con sal, pimienta y una cucharadita de ajos molidos. Añádele la chicha de jora y déjalo reposar por 2 horas Pasado las dos horas, calienta una olla grande con aceite caliente y prepara un aderezo con la cebolla picada y el tomate picado hasta que la cebolla quede media transparente y el tomate se haya reducido Al aderezo anterior agrega los trozos de cabrito junto con sus jugos (líquidos) y también el culantro, el ají amarillo y el zapallo loche cortado en cuadritos. Deja cocinar todo a fuego medio durante o  minutos aproximadamente hasta que el cabrito quede tierno Mientras se cocina el cabrito prepara los frejoles. Coloca en una olla los frejoles con agua y cúbrelos con agua que sobrepase, agrega la costilla de chancho, el trozo de pellejo de chancho. Déjalo a cocinar hasta que los frejoles queden cremosos. El tiempo de cocción depende del tipo de frejoles. Cuando los frejoles estén casi listos, prepara un aderezo de cebolla, ajo molido, sal y pimienta y agrégalo a los frejoles y déjalos durante el tiempo que terminen de cocinarse los frejole El Seco de Cabrito se suele acompañar con arroz blanco y yuca.  \"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"nomPlato\": \"Papa Rellena\",\n"
                + "      \"descrip\": \"El Seco de Cabrito con frejoles, es una comida emblemática del norte de Perú, con diferencias distintivas de algunas regiones. El ingrediente principal de esta preparación es la carne tierna del cabrito que se acompaña con unos ricos frejoles bien sazonados y con una buena porción de arroz blanco.\",\n"
                + "      \"img\": \"img/p8.jpg\",\n"
                + "      \"receta\": {\n"
                + "        \"nomPlato\": \"Papa Rellena\",\n"
                + "        \"ingredientes\": \"kilo de cabrito tazas de chicha de jora sin dulce cebolla roja grande picada en cuadritos  tomate picado en cuadritos  ají amarillo licuado  cucharadas de ajo molido cucharadas de zapallo loche cortado en cuadros  cucharadas de aceite de oliva  taza de hojas de culantro (cilantro) picado Sal y pimienta al gusto tazas de arroz cocido \",\n"
                + "        \"receta\": \" Trocea el cabrito en 8 partes, condiméntalos con sal, pimienta y una cucharadita de ajos molidos. Añádele la chicha de jora y déjalo reposar por 2 horas Pasado las dos horas, calienta una olla grande con aceite caliente y prepara un aderezo con la cebolla picada y el tomate picado hasta que la cebolla quede media transparente y el tomate se haya reducido Al aderezo anterior agrega los trozos de cabrito junto con sus jugos (líquidos) y también el culantro, el ají amarillo y el zapallo loche cortado en cuadritos. Deja cocinar todo a fuego medio durante o  minutos aproximadamente hasta que el cabrito quede tierno Mientras se cocina el cabrito prepara los frejoles. Coloca en una olla los frejoles con agua y cúbrelos con agua que sobrepase, agrega la costilla de chancho, el trozo de pellejo de chancho. Déjalo a cocinar hasta que los frejoles queden cremosos. El tiempo de cocción depende del tipo de frejoles. Cuando los frejoles estén casi listos, prepara un aderezo de cebolla, ajo molido, sal y pimienta y agrégalo a los frejoles y déjalos durante el tiempo que terminen de cocinarse los frejole El Seco de Cabrito se suele acompañar con arroz blanco y yuca.  \"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"nomPlato\": \"Pan Con Chicharron\",\n"
                + "      \"descrip\": \"El Seco de Cabrito con frejoles, es una comida emblemática del norte de Perú, con diferencias distintivas de algunas regiones. El ingrediente principal de esta preparación es la carne tierna del cabrito que se acompaña con unos ricos frejoles bien sazonados y con una buena porción de arroz blanco.\",\n"
                + "      \"img\": \"img/p9.jpg\",\n"
                + "      \"receta\": {\n"
                + "        \"nomPlato\": \"Pan Con Chicharron\",\n"
                + "        \"ingredientes\": \"kilo de cabrito tazas de chicha de jora sin dulce cebolla roja grande picada en cuadritos  tomate picado en cuadritos  ají amarillo licuado  cucharadas de ajo molido cucharadas de zapallo loche cortado en cuadros  cucharadas de aceite de oliva  taza de hojas de culantro (cilantro) picado Sal y pimienta al gusto tazas de arroz cocido \",\n"
                + "        \"receta\": \" Trocea el cabrito en 8 partes, condiméntalos con sal, pimienta y una cucharadita de ajos molidos. Añádele la chicha de jora y déjalo reposar por 2 horas Pasado las dos horas, calienta una olla grande con aceite caliente y prepara un aderezo con la cebolla picada y el tomate picado hasta que la cebolla quede media transparente y el tomate se haya reducido Al aderezo anterior agrega los trozos de cabrito junto con sus jugos (líquidos) y también el culantro, el ají amarillo y el zapallo loche cortado en cuadritos. Deja cocinar todo a fuego medio durante o  minutos aproximadamente hasta que el cabrito quede tierno Mientras se cocina el cabrito prepara los frejoles. Coloca en una olla los frejoles con agua y cúbrelos con agua que sobrepase, agrega la costilla de chancho, el trozo de pellejo de chancho. Déjalo a cocinar hasta que los frejoles queden cremosos. El tiempo de cocción depende del tipo de frejoles. Cuando los frejoles estén casi listos, prepara un aderezo de cebolla, ajo molido, sal y pimienta y agrégalo a los frejoles y déjalos durante el tiempo que terminen de cocinarse los frejole El Seco de Cabrito se suele acompañar con arroz blanco y yuca.  \"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"nomPlato\": \"Escabeche de Pescado\",\n"
                + "      \"descrip\": \"El Seco de Cabrito con frejoles, es una comida emblemática del norte de Perú, con diferencias distintivas de algunas regiones. El ingrediente principal de esta preparación es la carne tierna del cabrito que se acompaña con unos ricos frejoles bien sazonados y con una buena porción de arroz blanco.\",\n"
                + "      \"img\": \"img/p10.jpg\",\n"
                + "      \"receta\": {\n"
                + "        \"nomPlato\": \"Escabeche de Pescado\",\n"
                + "        \"ingredientes\": \"kilo de cabrito tazas de chicha de jora sin dulce cebolla roja grande picada en cuadritos  tomate picado en cuadritos  ají amarillo licuado  cucharadas de ajo molido cucharadas de zapallo loche cortado en cuadros  cucharadas de aceite de oliva  taza de hojas de culantro (cilantro) picado Sal y pimienta al gusto tazas de arroz cocido \",\n"
                + "        \"receta\": \" Trocea el cabrito en 8 partes, condiméntalos con sal, pimienta y una cucharadita de ajos molidos. Añádele la chicha de jora y déjalo reposar por 2 horas Pasado las dos horas, calienta una olla grande con aceite caliente y prepara un aderezo con la cebolla picada y el tomate picado hasta que la cebolla quede media transparente y el tomate se haya reducido Al aderezo anterior agrega los trozos de cabrito junto con sus jugos (líquidos) y también el culantro, el ají amarillo y el zapallo loche cortado en cuadritos. Deja cocinar todo a fuego medio durante o  minutos aproximadamente hasta que el cabrito quede tierno Mientras se cocina el cabrito prepara los frejoles. Coloca en una olla los frejoles con agua y cúbrelos con agua que sobrepase, agrega la costilla de chancho, el trozo de pellejo de chancho. Déjalo a cocinar hasta que los frejoles queden cremosos. El tiempo de cocción depende del tipo de frejoles. Cuando los frejoles estén casi listos, prepara un aderezo de cebolla, ajo molido, sal y pimienta y agrégalo a los frejoles y déjalos durante el tiempo que terminen de cocinarse los frejole El Seco de Cabrito se suele acompañar con arroz blanco y yuca.  \"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        Platos platos = convertFromJsonStringToObject(JsonReceta, Platos.class);
        
        List<Plato> listP = new ArrayList<>();
        listP = platos.getListPlatos();
        request.getSession().setAttribute("listPlatos", listP);       

        request.getRequestDispatcher("/pages/carta.jsp").forward(request, response);

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

    
    
    public static <T> T convertFromJsonStringToObject(String jsonString, Class<T> valueTypeRef) throws IOException {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, valueTypeRef);
    }

}
