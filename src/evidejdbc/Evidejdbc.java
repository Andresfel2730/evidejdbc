/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evidejdbc;

/**
 *
 * @author USUARIO
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Evidejdbc {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        String usuario = "root";
        String password ="";
        String url = "jdbc:mysql://localhost:3306/phpmyadmin";
        Connection conexion;
        Statement statement;
        ResultSet rs;
                
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            
            // TODO code application logic here
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Evidejdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion = DriverManager.getConnection(url,usuario,password);
            statement = conexion.createStatement();
            statement.executeUpdate("INSERT INTO CLIENTE(Nombre,cc,email) VALUES('matias','123456789','matias@gamil.com')");
            rs =  statement.executeQuery("SELECT * FROM CLIENTE");
            rs.next();
            do{
               System.out.println(rs.getInt("id")+":"+rs.getString("nombre"));
            }while(rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Evidejdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
