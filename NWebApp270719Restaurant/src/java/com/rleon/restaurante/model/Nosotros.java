package com.rleon.restaurante.model;

/**
 * @author Leon Matias R.
 * @date 31-jul-2019
 * @time 22:39:33
 */
public class Nosotros {
    
    private String tittle;
    private String text;
    private String path;
    private String mision;
    private String vision;

    public Nosotros() {
    }

    public Nosotros(String tittle, String text, String path, String mision, String vision) {
        this.tittle = tittle;
        this.text = text;
        this.path = path;
        this.mision = mision;
        this.vision = vision;
    }

  

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }
    
    

}
