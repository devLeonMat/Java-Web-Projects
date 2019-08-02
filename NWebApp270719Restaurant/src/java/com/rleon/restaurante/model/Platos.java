package com.rleon.restaurante.model;

import java.util.List;

/**
 * @author Leon Matias R.
 * @date 01-ago-2019
 * @time 22:06:12
 */
public class Platos {
    
   private List<Plato> Platos;

    public Platos() {
    }

    public Platos(List<Plato> listPlatos) {
        this.Platos = listPlatos;
    }

    public List<Plato> getListPlatos() {
        return Platos;
    }

    public void setListPlatos(List<Plato> listPlatos) {
        this.Platos = listPlatos;
    }      
}
