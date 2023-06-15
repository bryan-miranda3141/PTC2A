
package archivos;

import java.sql.*;

public class ConexionSQL {
    
    
    public static Connection getConexion(){
        
     
        String conexionUrl  = "jdbc:sqlserver://localhost:21208;" +
     "databaseName=UsersDB;"
                + "user=sa;"
                + "password=itr23;" +
     "encrypt=true;trustServerCertificate=true";
        
        
        try{
            Connection conn = DriverManager.getConnection(conexionUrl) ;
            return conn;
        }catch(SQLException ex){
            System.out.println(ex.toString());
  
            return null;
        }
        
    }
    
}