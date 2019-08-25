package com.restaurante.modelo.dao.impl;

import com.restaurante.modelo.Plato;
import com.restaurante.modelo.dao.IDaoPlato;
import com.restaurante.modelo.sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author EXTENSION
 */
public class DaoPlato implements IDaoPlato{

    @Override
    public List<Plato> listarPlatos() {
       return null;
        
    }

    @Override
    public String insPlato(Plato p) {
    
        String resultado = "";
        Connection con = null;
        
        try {
            con = Conexion.getConexion();
            String sql = "INSERT INTO platos (nombre, precio) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            int contador = ps.executeUpdate();
            if(contador==0){
                resultado = "Cero filas Insertadas";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            resultado = e.getMessage();
            Conexion.cerrarConexion(con);
        }
        return resultado;       
    }

    @Override
    public String updPlato(Plato p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delPlato(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Plato getPlato(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
