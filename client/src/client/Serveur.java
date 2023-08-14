/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import java.io.*;
import java.util.*;
import java.net.*;

/**
 *
 * @author HP
 */
public class Serveur {

    private ServerSocket serv;
    private Socket ss;
    ObjectOutputStream out;
    BufferedReader in;

    public Serveur() throws IOException {
        ServerSocket serv = new ServerSocket(4000);
    }

    public void start() {
        try {
            Socket ss = serv.accept();
            System.out.println("client connecte");
            BufferedReader in = new BufferedReader(new InputStreamReader(ss.getInputStream()));
            OutputStream os = ss.getOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(os);
            String cp = in.readLine();
            ArrayList<String> T = new ArrayList<String>();
            T.add("pays1");
            T.add("pays2");
            T.add("pays3");
            out.writeObject(T);
            ss.close();
            
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
