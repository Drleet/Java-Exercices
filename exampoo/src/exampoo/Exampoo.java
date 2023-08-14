/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exampoo;

/**
 *
 * @author HP
 */
public class Exampoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        emission em1 = new emission("la foret",20,"documentaire");
        emission em2 = new emission("1899",90,"sci-fi");
        emission em3 = new emission("dark",120,"sci-fi");
        programme l = new programme();
        System.out.println(em1.toString());
        l.addemission(em1);
        l.addemission(em2);
        l.addemission(em3);
        
        l.delemission(0, em3);
        l.afficher("sci-fi");
        l.montantot();
    
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
