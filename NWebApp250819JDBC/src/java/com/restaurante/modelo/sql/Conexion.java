package com.restaurante.modelo.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author EXTENSION
 */
public class Conexion {

    private static final String url = "jdbc:mysql://localhost/cibertec";
    private static final String user = "root";
    private static final String pass = "mysql";
    
    public static synchronized Connection getConexion(){
      Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("<----conectado!!----->");
            
            
            
        } catch (Exception e) {
            
            con = null;
            e.printStackTrace();
        }finally{
            return con;
        }
    };
    
    public static synchronized void cerrarConexion(ResultSet rs){
        try {
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static synchronized void cerrarConexion(Connection con){
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

}
