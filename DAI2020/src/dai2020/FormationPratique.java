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
public class FormationPratique extends Formation {
    private String Atelier;

    public FormationPratique() {
        
    }

    public FormationPratique(String Atelier, String Code, String Libelle, Date DateDebut, Date DateFin) {
        super(Code, Libelle, DateDebut, DateFin);
        this.Atelier = Atelier;
    }

    @Override
    public String toString() {
        return super.toString()+"\nAtelier : "+this.Atelier;
    }
    
    
}
