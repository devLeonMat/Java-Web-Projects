package com.clinica.modelo.dao;

import com.clinica.modelo.Login;

/**
 * @author Leon Matias R.
 * @date 11/09/2019
 * @time 09:29:38 PM
 */
public interface UsuarioDao {
    
    public Login getUsuario(String usuario, String pass);
}
