package com.rleon.restaurante.model;

/**
 * @author Leon Matias R.
 * @date 01-ago-2019
 * @time 22:38:27
 */
public class Plato {

     private String nomPlato;
    private String descrip;
    private String img;
    private Receta receta;

    public Plato() {
    }

    public Plato(String nomPlato, String descrip, String img, Receta receta) {
        this.nomPlato = nomPlato;
        this.descrip = descrip;
        this.img = img;
        this.receta = receta;
    }

    public String getNomPlato() {
        return nomPlato;
    }

    public void setNomPlato(String nomPlato) {
        this.nomPlato = nomPlato;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    
}
