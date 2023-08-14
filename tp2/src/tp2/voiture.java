/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;


public class voiture {
   private  int matricule;
   private String carburant;
   private float prix;
   
   
   
   public voiture(int matricule, String carburant, float prix){
        this.matricule = matricule;
        this.carburant = carburant;
        this.prix = prix;
    }
    public voiture(){};

    public int getmatricule() {
        return matricule;
    }
    public String getcarburant() {
        return carburant;
    }
    public float getprix() {
        return prix;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "voiture{" + "matricule=" + matricule + ", carburant=" + carburant + ", prix=" + prix + '}';
    }
   public void augmenter(){
       if(carburant.equals("essance")){
           prix*= 1*6/100;
       }
       else if(carburant.equals("diesel")){
           prix*= 1*6/100;
       }
   }
   
   public void augmenter(float p){
       if(carburant.equals("diesel")){
           prix*= 1*p/100;
       }
   }
}

    
    