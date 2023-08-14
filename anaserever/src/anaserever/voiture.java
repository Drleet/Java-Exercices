/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anaserever;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class voiture implements Serializable{
    private String marque ;
    private float prix;
    private String matricule ;

    public voiture(String marque, float prix, String matricule) {
        this.marque = marque;
        this.prix = prix;
        this.matricule = matricule;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    

    

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public String getMatricule() {
        return matricule;
    }
    @Override
    public String toString() {
        return "voiture{" + "marque=" + marque + ", prix=" + prix + ", matricule=" + matricule + '}';
    }
    
    
    
}
