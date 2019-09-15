package com.clinica.modelo;

/**
 * @author Leon Matias R.
 * @date 11/09/2019
 * @time 12:47:35 AM
 */
public class Personas extends Documentos {

    private int idPersona;
    private String nombres;
    private String apellidos;
    private String edad;
    private String sexo;
    private String numDocumento;

    public Personas(String nombres, String apellidos, String numdoc) {
        super(0, "", "");
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = null;
        this.sexo = null;
        this.numDocumento = numdoc;
    }
    public Personas(String nombres, String apellidos) {
        super(0, "", "");
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = null;
        this.sexo = null;
        this.numDocumento = null;
    }
    public Personas() {
        super(0, null, null);        
    }
    public Personas(int idPersona) {
        this.idPersona = idPersona;      
    }

    public Personas(int idPersona, int idDocumento, String nombres, String apellidos, String edad, String sexo,String numDoc) {
        super(idDocumento, null, null);
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.numDocumento = numDoc;
    }
    public Personas(int idDocumento, String nombres, String apellidos, String edad, String sexo,String numDoc) {
        super(idDocumento, null, null);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.numDocumento = numDoc;
    }

    public Personas(int idDocumento, String tipoDocumento, String descripcion, int idPersona, String nombres, String apellidos, String edad, String sexo, String numDoc) {
        super(idDocumento, tipoDocumento, descripcion);
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.numDocumento = numDoc;
        
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

}
