/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2s1;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class connexion {
    Connection cn;
    Statement stm;
    ResultSet rs;

    public connexion() {
        
        try{    
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/client?useSSL=false";
            String user = "root";
            String password = "";
            cn = DriverManager.getConnection(url, user, password);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    

    
    int create(client o){
        try{
            Statement stm = cn.createStatement();
            int q = stm.executeUpdate("insert into client values('"+ o.getId() +"','"+ o.getNom() +"','"+ o.getClass() +"')");
            return 1;
        }
        catch(Exception e){
           return 0;
        }
    }
    int delete(client o){
        try{
            stm = cn.createStatement();
            int q = stm.executeUpdate("delete from vaoiture where id = '"+ o.getId() +"'");
            return 1;
        }
        catch(Exception e){
            return 0;
        }
    }
    
    int update(client o){
        try{
            stm = cn.createStatement();
            int q = stm.executeUpdate("update client set id = '"+ o.getId() +"',nom ='"+ o.getNom() +"',prenom ='"+ o.getClass() +"' ");
            return 1;
        }
        catch(Exception e){
            return 0;
        }
    }
    
    client findbyid(int id){
        try{
            stm = cn.createStatement();
            rs = stm.executeQuery("select * from client where id = '"+ id +"'");
            if(rs.next()){
                client o= new client(rs.getInt(1),rs.getString(2),rs.getString(3));
                return o;
            }
            return null;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    
    }
    
    ArrayList<client> findall(){
        try{
            stm = cn.createStatement();
            rs = stm.executeQuery("select * from client ");
            ArrayList<client> ls = new ArrayList<client>();
            while(rs.next()){
                client o= new client(rs.getInt(1),rs.getString(2),rs.getString(3));
                ls.add(o);
            }
            return ls;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    
    
}
