/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author HP
 */
public class habitationpro extends habitation{
    private int nbemploye ;

    @Override
    void afficher() {
        super.afficher(); 
        System.out.println(this.nbemploye);
    }



    public habitationpro(int nbemploye, String nom, String address, double surface) {
        super(nom, address, surface);
        this.nbemploye = nbemploye;
    }

    @Override
    double impot() {
         double mt=0;
        
          int n= this.nbemploye/10;
        mt+=1000*n;
        return super.impot()+mt; 
    }
    
    
    
    
    
    
}
