/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author HP
 */
public class habitationindiv extends habitation {
    private int piece;
    private boolean  piscine ;

    public habitationindiv(int piece, boolean piscine, String nom, String address, double surface) {
        super(nom, address, surface);
        this.piece = piece;
        this.piscine = piscine;
    }

 
    
    @Override
    void afficher() {
        super.afficher(); 
        System.out.println("habitationindiv{" + "piece=" + piece + ", piscine=" + piscine + '}');
    }

    @Override
    double impot() {
        double mt = super.impot() +(100*this.piece); 
        if(this.piscine == true){
             mt += 500 ;
        }
        return mt;
    }
    
    
}
