package com.clinica.modelo.dao.impl;

import com.clinica.modelo.Pacientes;
import com.clinica.modelo.Personas;
import com.clinica.modelo.dao.PacientesDao;
import com.clinica.sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Leon Matias R.
 * @date 12/09/2019
 * @time 12:42:50 AM
 */
public class PacientesDaoImpl implements PacientesDao {

    @Override
    public List<Pacientes> getPacientes() {
        List<Pacientes> listPacs = new ArrayList<>();
        Pacientes pac;
        Connection cn = null;
        Statement st = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        StringBuilder query = new StringBuilder();
        query.append("select p.idpaciente, p.diagnostico, p2.nombres, p2.apellidos, p2.numdocumento, p.estado ");
        query.append("from pacientes p inner join personas p2 on p.idpersona = p2.idpersona ");
        try {
            cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(query.toString());
            while (rs.next()) {
                pac = new Pacientes(rs.getInt(1), rs.getString(2).toUpperCase(), rs.getString(3).toUpperCase(), rs.getString(4).toUpperCase(),rs.getString(5), rs.getInt(6));
                listPacs.add(pac);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.cerrarConexion(rs);
            Conexion.cerrarConexion(cn);
        }
        return listPacs;
    }

    @Override
    public Pacientes findPacienteByNumDoc(String numDoc) {

        Pacientes pac = null;
        Connection cn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        StringBuilder query = new StringBuilder();
        query.append("select p.idpaciente, p.diagnostico, p2.nombres, p2.apellidos, p2.numdocumento, p.estado ");
        query.append("from pacientes p inner join personas p2 on p.idpersona = p2.idpersona ");
        query.append("where p2.numdocumento like ? ;");
        try {
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(query.toString());
            ps.setString(1, numDoc);
            rs = ps.executeQuery();

            if (rs.next()) {
                pac = new Pacientes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            pac = new Pacientes();
        } finally {
            Conexion.cerrarConexion(rs);
            Conexion.cerrarConexion(cn);
        }

        return pac;
    }

    @Override
    public boolean savePersona(Personas p) {
        boolean resultado = false;
        Connection con = null;

        try {
            con = Conexion.getConexion();
            String sql = "INSERT INTO personas(iddocumento, nombres, apellidos, edad, sexo, numdocumento)VALUES(?, ?, ?, ?,?,?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdDocumento());
            ps.setString(2, p.getNombres());
            ps.setString(3, p.getApellidos());
            ps.setString(4, p.getEdad());
            ps.setString(5, p.getSexo());
            ps.setString(6, p.getNumDocumento());
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

    @Override
    public boolean savePaciente(Pacientes p) {
        boolean resultado = false;
        Connection con = null;

        try {
            con = Conexion.getConexion();
            String sql = "INSERT INTO pacientes(idpersona, diagnostico) VALUES(?, ?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdPersona());
            ps.setString(2, p.getDiagnostico());
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

    @Override
    public Personas findPersonaByNumDoc(String numDoc) {
        Personas per = null;
        Connection cn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        StringBuilder query = new StringBuilder();
        query.append("SELECT idpersona, iddocumento, nombres, apellidos, edad, sexo, numdocumento ");
        query.append("FROM personas p where p.numdocumento = ? limit 1 ; ");
        try {
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(query.toString());
            ps.setString(1, numDoc);
            rs = ps.executeQuery();
            if (rs.next()) {
                per = new Personas(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            per = new Personas();
        } finally {
            Conexion.cerrarConexion(rs);
            Conexion.cerrarConexion(cn);
        }

        return per;
    }

}
