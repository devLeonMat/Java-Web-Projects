/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.modelo.dao;

import com.restaurante.modelo.Plato;
import java.util.List;

/**
 *
 * @author EXTENSION
 */
public interface IDaoPlato {
    
    public List<Plato> listarPlatos();
    public String insPlato(Plato p);
    public String updPlato(Plato p);
    public String delPlato(int id);
    public Plato getPlato(int id);
       
}
