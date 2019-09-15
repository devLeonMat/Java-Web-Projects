package com.clinica.modelo;

/**
 * @author Leon Matias R.
 * @date 11/09/2019
 * @time 12:48:05 AM
 */
public class Pacientes extends Personas {

    private int idPaciente;
    private String diagnostico;
    private int estado;

    public Pacientes(int idDocumento, String tipoDocumento, String descripcion, int idPersona, String nombres, String apellidos, String edad, String sexo, String numDoc) {
        super(idDocumento, tipoDocumento, descripcion, idPersona, nombres, apellidos, edad, sexo, numDoc);
    }
    public Pacientes() {
        super(0, null, null, 0, null, null, null, null, null);
    }

    public Pacientes(int idPaciente, String diagnostico, String nombres, String apellidos, String numDocumento, int estado) {
        super(nombres, apellidos, numDocumento);
        this.idPaciente = idPaciente;
        this.diagnostico = diagnostico;
        this.estado = estado;
    }
    public Pacientes(int idpersona, String diagnostico) {
        super(idpersona);
        this.diagnostico = diagnostico;
    }

    public Pacientes(int idPaciente, String diagnostico, int idPersona, int idDocumento, String nombres, String apellidos, String edad, String sexo,String numDoc) {
        super(idPersona, idDocumento, nombres, apellidos, edad, sexo, numDoc);
        this.idPaciente = idPaciente;
        this.diagnostico = diagnostico;
    }

    public Pacientes(int idPaciente, String diagnostico, int idDocumento, String tipoDocumento, String descripcion, int idPersona, String nombres, String apellidos, String edad, String sexo, String numDoc) {
        super(idDocumento, tipoDocumento, descripcion, idPersona, nombres, apellidos, edad, sexo, numDoc);
        this.idPaciente = idPaciente;
        this.diagnostico = diagnostico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
