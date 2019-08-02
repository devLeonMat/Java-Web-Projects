package com.rleon.restaurante.model;

/**
 * @author Leon Matias R.
 * @date 01-ago-2019
 * @time 22:06:12
 */
public class Receta {
    
    private String nomPlato;
    private String ingredientes;
    private String receta;

    public Receta() {
    }

    public Receta(String nomPlato,String ingredientes, String receta) {
        this.nomPlato = nomPlato;
        this.ingredientes = ingredientes;
        this.receta = receta;
    }

    public String getNomPlato() {
        return nomPlato;
    }

    public void setNomPlato(String nomPlato) {
        this.nomPlato = nomPlato;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
    
    
    

}
