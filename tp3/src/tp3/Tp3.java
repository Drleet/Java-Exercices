/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author HP
 */
public class Tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        habitationindiv h1  = new habitationindiv(76,true,"i9amat lmzgui","laayoune lwa7da 7amam doumes", 180);
        habitationpro h2  = new habitationpro(20,"i9amat el hihi","laayoune grand G", 400);
        
        h1.afficher();
        double l = h1.impot();
        System.out.println(l);
        
        h2.afficher();
        double l1 = h2.impot();
        System.out.println(l1);
        
        
        
    }
    
}
