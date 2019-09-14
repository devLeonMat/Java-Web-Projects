package com.clinica.modelo.dao.impl;

import com.clinica.modelo.Doctores;
import com.clinica.modelo.dao.MedicosDao;
import com.clinica.sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Leon Matias R.
 * @date 12/09/2019
 * @time 12:42:38 AM
 */
public class MedicosDaoImpl implements MedicosDao {

    @Override
    public List<Doctores> getMedicos() {
        List<Doctores> listDocs = new ArrayList<>();
        Doctores doc = null;
        Connection cn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        StringBuilder query = new StringBuilder();
        query.append("select d.iddoctor, d.especialidad, p.nombres, p.apellidos ");
        query.append("from doctores d inner join personas p on d.idpersona = p.idpersona ");
        try {
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(query.toString());
            rs = ps.executeQuery();

            while(rs.next()) {
                doc = new Doctores(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listDocs.add(doc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.cerrarConexion(rs);
            Conexion.cerrarConexion(cn);
        }

        return listDocs;
    }

    @Override
    public Doctores findDocByNumDoc(String numdoc) {
        Doctores doc = null;
        Connection cn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        StringBuilder query = new StringBuilder();
        query.append("select d.iddoctor, d.especialidad, p.idpersona,p.iddocumento, p.nombres, p.apellidos, p.edad, p.sexo, p.numdocumento ");
        query.append("from doctores d inner join personas p on d.idpersona = p.idpersona ");
        query.append("where p.numdocumento = ? ;");
        try {
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(query.toString());
            ps.setString(1, numdoc);
            rs = ps.executeQuery();

            while (rs.next()) {
                doc = new Doctores(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.cerrarConexion(rs);
            Conexion.cerrarConexion(cn);
        }

        return doc;
    }

    @Override
    public boolean saveMedic(Doctores d) {
        boolean resultado = false;
        Connection con = null;

        try {
            con = Conexion.getConexion();
            String sql = "INSERT INTO doctores(idpersona, especialidad) VALUES(?, ?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, d.getIdPersona());
            ps.setString(2, d.getEspecialidad());
            int contador = ps.executeUpdate();
            if (contador > 0) {
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            resultado = false;
            Conexion.cerrarConexion(con);
        }
        return resultado;
    }

}
