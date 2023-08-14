/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

/**
 *
 * @author HP
 */
public class Tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        voiture v1= new voiture(12,"essance",29000);
        voiture v2= new voiture(12898,"diesel",200000);
        v1.augmenter();
        System.out.println(v1.getprix());
        v2.augmenter(5);
        System.out.println(v2.toString());
        
    }
    
}
