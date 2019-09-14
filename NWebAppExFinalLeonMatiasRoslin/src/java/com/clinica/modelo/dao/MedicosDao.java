package com.clinica.modelo.dao;

import com.clinica.modelo.Doctores;
import java.util.List;

/**
 * @author Leon Matias R.
 * @date 12/09/2019
 * @time 12:04:31 AM
 */
public interface MedicosDao {

    public List<Doctores> getMedicos();
    
    public Doctores findDocByNumDoc(String numdoc);
    
    public boolean saveMedic(Doctores d);
    
    
}
