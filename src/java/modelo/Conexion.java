/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Andre
 */
public class Conexion {
    public Connection conexionBD;
    public final String bd = "db_tarea-empresa";
    public final String urlConexion = String.format("jdbc:mysql://localhost:3306/%s",bd);
    public final String usuario = "usr_empresa";
    public final String contra = "Empresa@123";
    public final String jbdc = "com.mysql.cj.jdbc.Driver";
    
    public void abrir_conexion(){
        try{
            Class.forName(jbdc);
            conexionBD=DriverManager.getConnection(urlConexion,usuario,contra);
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Algo salio mal :( " + ex.getMessage());
        }
    }
    public void cerrar_conexion(){
    try{
        conexionBD.close();
        }
        catch (SQLException ex){
            System.out.println("Algo salio mal :( "+ ex.getMessage());
       
    }
    }
    
    
}
