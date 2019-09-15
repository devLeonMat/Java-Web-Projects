package com.clinica.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * @author Leon Matias R.
 * @date 11/09/2019
 * @time 12:43:28 AM
 */
public class Conexion {

    private static final String url = "jdbc:mysql://localhost/cibertec";
    private static final String user = "root";
    private static final String pass = "mysql";
//    private static final String pass = "" /**Conexion en casa **/;
    
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
