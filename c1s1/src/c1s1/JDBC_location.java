/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1s1;
import java.sql.*;
/**
 *
 * @author HP
 */
public class JDBC_location {
    Connection connection;
    Statement stm;
    ResultSet resultat;

    public JDBC_location() {
    }
    
    boolean connecter(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/mydatabase?useSSL=false";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
            return true;
        }
            
        catch(Exception e){
            return false;
        } 
            
    }
    
    boolean exist(String mat){
        try{    
            stm = connection.createStatement();
            resultat = stm.executeQuery("select * from voiture where mat = '"+ mat +"'");
            if(resultat.next()){
                return true;
            }
        }
        catch(Exception e){
            return false;
        }
        
    }
    
    boolean add_car(voiture v){
        boolean test_exist = exist(v.getMatricule());
        try{
            if(!test_exist){
            stm = connection.createStatement();
            resultat = stm.executeUpdate("insert into voiture values('"+ v.getMatricule() +"','"+ v.getPrix() +"','"+ v.getCouleur() +"')");
            return true;
            }
            return false;
        }
        catch(Exception e){
            return false ;
        }
    }
    
    boolean delete_car(String mat){
        try{
            stm = connection.createStatement();
            resultat = stm.executeUpdate("delete from vaoiture where mat = '"+ mat +"'");
            return true;
        }
        catch(Exception e){
            return false ;
        }
    }
    
    ResultSet data(String req){
        try{
            stm = connection.createStatement();
            return stm.executeQuery(req);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
     
    
    
}
