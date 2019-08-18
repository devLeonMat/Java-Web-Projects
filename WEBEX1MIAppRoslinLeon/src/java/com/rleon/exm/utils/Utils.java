/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rleon.exm.utils;

import com.rleon.exm.model.Articulos;
import com.rleon.exm.model.Utiles;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RLEON
 */
public class Utils {
    
    
    
    public static String validSuma(int n1, int n2){
        String result = "";
        if(n1%2==0 && n2%2==0){
            int suma = n1+n2;
            result = String.valueOf(suma);
        }else{
            result = "No se realiza la Suma";
        }       
        return result;
    }
    
    public static List<Utiles> getUtiles(){
        
         List<Utiles> listUtiles = new ArrayList<>();
        Utiles ut = new Utiles();
        ut.setId(1);
        ut.setNombre("Cuadernos");
        ut.setPrecio(14.90);
        ut.setPromocion(20);
        listUtiles.add(ut);
        
        ut = new Utiles();
        ut.setId(2);
        ut.setNombre("Pinturas");
        ut.setPrecio(10.90);
        ut.setPromocion(1);
        listUtiles.add(ut);
        
        ut = new Utiles();
        ut.setId(3);
        ut.setNombre("Escuadras");
        ut.setPrecio(11.90);
        ut.setPromocion(10);
        listUtiles.add(ut);
        
        return listUtiles;
    }
    

    
}
