/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1s1;

/**
 *
 * @author HP
 */
public class voiture {
    private String matricule ;
    private double prix ;
    private String couleur ;
    private int id_marque ;

    public voiture(String matricule, double prix, String couleur, int id_marque) {
        this.matricule = matricule;
        this.prix = prix;
        this.couleur = couleur;
        this.id_marque = id_marque;
    }

    
    public String getMatricule() {
        return matricule;
    }

    public double getPrix() {
        return prix;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getId_marque() {
        return id_marque;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setId_marque(int id_marque) {
        this.id_marque = id_marque;
    }
    
}
