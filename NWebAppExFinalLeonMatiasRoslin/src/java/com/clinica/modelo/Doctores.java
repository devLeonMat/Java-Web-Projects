package com.clinica.modelo;

/**
 * @author Leon Matias R.
 * @date 11/09/2019
 * @time 12:48:42 AM
 */
public class Doctores extends Personas{
    private int idDoctor;    
    private String especialidad;
    
    public Doctores() {
        super(0, 0, null, null, null, null, null);
    }
    public Doctores(int idPersona, String especialidad) {
        super(idPersona);
        this.especialidad = especialidad;
    }

    public Doctores(int idPersona, int idDocumento, String nombres, String apellidos, String edad, String sexo, String numDoc) {
        super(idPersona, idDocumento, nombres, apellidos, edad, sexo, numDoc);
    }

    public Doctores(int idDoctor, String especialidad, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.idDoctor = idDoctor;
        this.especialidad = especialidad;
    }

    public Doctores(int idDoctor, String especialidad, int idPersona, int idDocumento, String nombres, String apellidos, String edad, String sexo, String numDoc) {
        super(idPersona, idDocumento, nombres, apellidos, edad, sexo,numDoc);
        this.idDoctor = idDoctor;
        this.especialidad = especialidad;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    

    
    
    
}
