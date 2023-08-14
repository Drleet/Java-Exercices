/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int code  = scann.nextByte();
        scann.nextLine();
        scann.nextLine();
        String nom = scann.nextLine();
        etudiant e1 = new etudiant(10,"ali","ali");
        System.out.println(e1.toString());
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(0);
        l1.add(3111);
        l1.add(34);
        l1.add(32);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        
    }
    
}
