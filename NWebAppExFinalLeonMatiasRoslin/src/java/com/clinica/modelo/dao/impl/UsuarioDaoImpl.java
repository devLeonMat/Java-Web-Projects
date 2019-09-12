package com.clinica.modelo.dao.impl;

import com.clinica.modelo.Login;
import com.clinica.modelo.Personas;
import com.clinica.modelo.Usuarios;
import com.clinica.modelo.dao.UsuarioDao;
import com.clinica.sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Leon Matias R.
 * @date 11/09/2019
 * @time 09:31:27 PM
 */
public class UsuarioDaoImpl implements UsuarioDao {

    @Override
    public Login getUsuario(String user, String pass) {
        Login login = null;
        Connection cn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        StringBuilder query = new StringBuilder();
        query.append("SELECT u.usuario, p.nombres, p.apellidos, u.perfil ");
        query.append("FROM cibertec.usuario u inner join personas p on ");
        query.append("p.idpersona = u.idpersona where u.usuario= ? and u.password = ? ");

        try {
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(query.toString());
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            if (rs.next()) {
                login = new Login();
                login.setPersonas(new Personas(rs.getString(2), rs.getString(3)));
                login.setUsuarios(new Usuarios(rs.getString(1), rs.getString(4)));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.cerrarConexion(rs);
            Conexion.cerrarConexion(cn);
        }

        return login;

    }

}
