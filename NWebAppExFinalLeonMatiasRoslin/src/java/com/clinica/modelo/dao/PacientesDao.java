package com.clinica.modelo.dao;

import com.clinica.modelo.Pacientes;
import java.util.List;

/**
 * @author Leon Matias R.
 * @date 12/09/2019
 * @time 12:04:15 AM
 */
public interface PacientesDao {
    
    public List<Pacientes> getPacientes();
    
    public Pacientes findPacienteByNumDoc(String numDoc);

}
