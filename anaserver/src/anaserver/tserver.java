/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anaserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class tserver implements Runnable{

    @Override
    public void run() {
        
        try {
             ServerSocket s1 = new ServerSocket(3000);
            while(true){
               
            Socket s2 = s1.accept();
            System.out.println("client connecte");
            BufferedReader b = new BufferedReader(new InputStreamReader(s2.getInputStream()));
            PrintWriter p = new PrintWriter(s2.getOutputStream());
            int va = Integer.parseInt(b.readLine()) ;
            int v = va*va;
            p.println("le carree de le nombre "+va+" est : "+v);
            p.flush();
            s2.close();
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }
        
    }
    
}
