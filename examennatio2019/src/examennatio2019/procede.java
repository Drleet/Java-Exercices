/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examennatio2019;

/**
 *
 * @author HP
 */
public class procede {
    private double prix;
    private String reference;

    public procede(double prix, String reference) throws errorprix{
        
        if(prix > 0){
            this.prix = prix;
        }else{
            throw new errorprix("erreur prix"+prix);
        }
        this.reference = reference;
    }
    
    
    
    public double getPrix() {
        return prix;
    }

    public String getReference() {
        return reference;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "references: "+reference+",prix:"+prix;
    }
    
    
    
    
    public procede(String ref, double prix){
        
    
    }
    
    
}
