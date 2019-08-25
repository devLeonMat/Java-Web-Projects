/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.modelo.sql;

import com.restaurante.modelo.Plato;
import com.restaurante.modelo.dao.IDaoPlato;
import com.restaurante.modelo.dao.impl.DaoPlato;

/**
 *
 * @author EXTENSION
 */
public class Prueba {
    public static void main(String[] args) {
//        System.out.println("Estoy probando la conexion");
//        Connection con = Conexion.getConexion();
        IDaoPlato daoPlato = new DaoPlato();
        Plato p = new Plato("Lomo Saltado", 35.00);
        daoPlato.insPlato(p);
        
    
        System.out.println("Estoy probando la conexion");
    }
}
