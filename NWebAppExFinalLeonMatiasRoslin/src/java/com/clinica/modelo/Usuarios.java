package com.clinica.modelo;

/**
 * @author Leon Matias R.
 * @date 11/09/2019
 * @time 12:46:41 AM
 */

public class Usuarios{
    
    private int idUsuario;
    private int idPersona;
    private String usuario;
    private String password;
    private String perfil;

    public Usuarios(String usuario, String perfil) {        
        this.usuario = usuario;
        this.perfil = perfil;
    }
    
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }    
}
