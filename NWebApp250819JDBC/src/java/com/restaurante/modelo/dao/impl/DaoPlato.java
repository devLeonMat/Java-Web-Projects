package com.restaurante.modelo.dao.impl;

import com.restaurante.modelo.Plato;
import com.restaurante.modelo.dao.IDaoPlato;
import com.restaurante.modelo.sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EXTENSION
 */
public class DaoPlato implements IDaoPlato {

    @Override
    public List<Plato> listarPlatos() {
        List<Plato> listPlatos = new ArrayList<>();
        Connection cn = null;
        Plato p;
        ResultSet rs = null;
        String sql = "SELECT idPlato, nombre, precio, estado FROM platos;";
        try {
            cn = Conexion.getConexion();
            Statement st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                p = new Plato();
                p.setIdPlato(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setEstado(rs.getInt(4));
                listPlatos.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(rs);
            Conexion.cerrarConexion(cn);
        }
        return listPlatos;
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
            if (contador == 0) {
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
        Connection con = null;
        PreparedStatement ps = null;
        String query = "UPDATE platos SET nombre=?, precio=? WHERE `idPlato`=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setInt(3, p.getIdPlato());
            ps.executeUpdate();
        } catch (Exception e) {

        } finally {

        }
        return null;
    }

    @Override
    public String delPlato(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Plato getPlato(int id) {
        Plato p = null;
        Connection cn = null;
        ResultSet rs = null;
        
        String sql = "SELECT `idPlato`, nombre, precio, estado FROM platos where idPlato = ?";
        try {
            cn = Conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                p = new Plato();
                p.setIdPlato(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setEstado(rs.getInt(4));            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.cerrarConexion(rs);
            Conexion.cerrarConexion(cn);
        }

        return p;
    }

}
