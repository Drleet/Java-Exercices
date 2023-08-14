/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anaserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class Anaserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tserver t = new tserver();
        Thread t1 = new Thread(t);
        t1.start();
       
//        try {
//            
//            
//            
//            //Scanner s = new Scanner(System.in);
//            //while (true) {
//            ServerSocket s1 = new ServerSocket(3000);
//            Socket s2 = s1.accept();
//            System.out.println("client connecte");
//            //PrintWriter p = new PrintWriter(s2.getOutputStream());
//            //p.print("donnez un matricule");
//            BufferedReader b = new BufferedReader(new InputStreamReader(s2.getInputStream()));
//            //int va = Integer.parseInt(b.readLine()) ;
//            //int v = 1;
//            //for (int i = 1; i <= va; i++) {
//            //    v = v*i;
//            //} 
//
//            //p.println("le factoriel de le nombre "+va+" est : "+v
//            // //System.out.println(b.readLine());
//            //s.nextLine();
//            // //String str = s.nextLine();
//            // //p.println(str);
//            voiture v1 = new voiture("dacia", 130000, "w723782");
//            voiture v2 = new voiture("renault", 1200, "weyf3782");
//            voiture v3 = new voiture("renault", 1200, "aeilrwiy");
//            voiture v4 = new voiture("renault", 1200, "fio4h89");
//            ArrayList<voiture> l1 = new ArrayList<voiture>();
//            l1.add(v1);
//            l1.add(v2);
//            l1.add(v3);
//            l1.add(v4);
//            for (int i = 0; i < l1.size(); i++) {
//                if (l1.get(i).getMatricule().equals(b.readLine())) {
//                    OutputStream os = s2.getOutputStream();
//                    ObjectOutputStream oos = new ObjectOutputStream(os);
//                    oos.writeObject(v1);
//
//                }else{
//                }
//            }
//            s2.close();
//            //p.flush();
//            //}
//
//            //s2.close();
//            //s1.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//
//        }

    }

    

}
