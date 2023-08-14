/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dai2020;

import java.util.Date;

/**
 *
 * @author REDHOOD
 */
public class FormationTheorique extends Formation {
    private String NomFormateur;
    private String Salle;

    public FormationTheorique() {
        
    }

    public FormationTheorique(String NomFormateur, String Salle, String Code, String Libelle, Date DateDebut, Date DateFin) {
        super(Code, Libelle, DateDebut, DateFin);
        this.NomFormateur = NomFormateur;
        this.Salle = Salle;
    }

    @Override
    public String toString() {
        return super.toString()+"\nNom Formateur : "+this.NomFormateur+", Salle : "+this.Salle;
    }
    
    
}
