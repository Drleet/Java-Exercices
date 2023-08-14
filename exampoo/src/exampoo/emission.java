/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampoo;
 
/**
 *
 * @author HP
 */
 class emission {
    static private String codeem ;
    private String titreem;
    private double dureem ;
    private String categorie ;

    public emission( String titreem, double dureeem, String categorie) {
        codeem = titreem.substring(0, 3) ;
        this.titreem = titreem;
        this.dureem = dureeem;
        this.categorie = categorie;
    }
    
    
    

    public String getTitreem() {
        return titreem;
    }

    public double getDureeem() {
        return dureem;
    }

    public String getCategorie() {
        return categorie;
    }

    
   

    public void setTitreem(String titreem) {
        this.titreem = titreem;
    }

    public void setDureeem(double dureeem) {
        this.dureem = dureeem;
        
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "emission{" + "codeem=" + codeem + ", titreem=" + titreem + ", dureeem=" + dureem + ", categorie=" + categorie + '}';
    }
    
    
    
    double montant(double tar ){
        double mt=0;
        if(categorie.equals("documentaire")){
            mt = dureem*tar+1500;
        }else{
            mt = dureem*tar;
        }
        return mt;
    }
    
    
    
    
    
}
