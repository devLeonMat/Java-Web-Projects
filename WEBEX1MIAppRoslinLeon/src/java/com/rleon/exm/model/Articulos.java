/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rleon.exm.model;

/**
 *
 * @author RLEON
 */
public class Articulos {
    
    private int id;
    private String descripcion;
    private String cant;
    private double Precio;
    private String promocion;

    public Articulos() {
    }

    public Articulos(int id, String descripcion, String cant, double Precio, String promocion) {
        this.id = id;
        this.descripcion = descripcion;
        this.cant = cant;
        this.Precio = Precio;
        this.promocion = promocion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    
    
    
}
