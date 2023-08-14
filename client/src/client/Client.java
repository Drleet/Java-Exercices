/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client;

import java.io.*;
import java.util.*;
import java.net.*;
/**
 *
 * @author HP
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            //Scanner s = new Scanner(System.in);
            //while (true) {
                ServerSocket s1 = new ServerSocket(3000);
                Socket s2 = s1.accept();
                System.out.println("client connecte");
                PrintWriter p = new PrintWriter(s2.getOutputStream());
                //p.print("donnez un nombre");
                BufferedReader b = new BufferedReader(new InputStreamReader(s2.getInputStream()));
                //int va = Integer.parseInt(b.readLine()) ;
                //int v = 1;
                //for (int i = 1; i <= va; i++) {
                //    v = v*i;
                //} 

                //p.println("le factoriel de le nombre "+va+" est : "+v
                // //System.out.println(b.readLine());
                //s.nextLine();
                // //String str = s.nextLine();
                // //p.println(str);
                
                OutputStream  os = s2.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                voiture v1 = new voiture("dacia",130000,"w723782");
                oos.writeObject(v1);
                s2.close();
                //p.flush();
            //}

            //s2.close();
            //s1.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            

        }
    }
    
}
