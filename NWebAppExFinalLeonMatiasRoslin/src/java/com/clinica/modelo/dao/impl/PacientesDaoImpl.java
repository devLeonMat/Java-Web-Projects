package com.clinica.modelo.dao.impl;

import com.clinica.modelo.Pacientes;
import com.clinica.modelo.dao.PacientesDao;
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
 * @time 12:42:50 AM
 */
public class PacientesDaoImpl implements PacientesDao{

    @Override
    public List<Pacientes> getPacientes() {
          List<Pacientes> listPacs = new ArrayList<>();
        Pacientes pac = null;
        Connection cn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        StringBuilder query = new StringBuilder();
        query.append("select p.idpaciente, p.diagnostico, p2.nombres, p2.apellidos ");
        query.append("from pacientes p inner join personas p2 on p.idpersona = p2.idpersona ");
        try {
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(query.toString());
            rs = ps.executeQuery();

            if (rs.next()) { 
                pac = new Pacientes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
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
        query.append("select p.idpaciente, p.diagnostico, p2.nombres, p2.apellidos ");
        query.append("from pacientes p inner join personas p2 on p.idpersona = p2.idpersona ");
        query.append("where p2.numdocumento = ? ;");
        try {
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(query.toString());
            ps.setString(1, numDoc);
            rs = ps.executeQuery();

            if (rs.next()) {
                pac = new Pacientes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
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

}
