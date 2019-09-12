package com.clinica.modelo;

/**
 * @author Leon Matias R.
 * @date 11/09/2019
 * @time 12:47:50 AM
 */
public class Documentos {
    
    private int idDocumento;
    private String tipoDocumento;
    private String descripcion;

    public Documentos(int idDocumento, String tipoDocumento, String descripcion) {
        this.idDocumento = idDocumento;
        this.tipoDocumento = tipoDocumento;
        this.descripcion = descripcion;
    }
    public Documentos() {        
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    
    
}
