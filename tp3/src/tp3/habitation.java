/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author HP
 */
public class habitation {
    private String nom;
    private String address;
    private double surface;

    

    double impot(){
       double mt  = 2*surface;
       return mt;
    }

    
    
    void afficher(){
        System.out.print("habitation{" + "nom=" + nom + ", address=" + address + ", surface=" + surface + '}');
    }

    public String getNom() {
        return nom;
    }

    public String getAddress() {
        return address;
    }

    public double getSurface() {
        return surface;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public habitation(String nom, String address, double surface) {
        this.nom = nom;
        this.address = address;
        this.surface = surface;
    }
    
}
