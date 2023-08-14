/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dai2020;

import java.io.*;
import java.util.*;

/**
 *
 * @author REDHOOD
 */
public class Formation implements Serializable,Comparable {
    private String Code;
    private String Libelle;
    private Date DateDebut;
    private Date DateFin;

    public Formation() {
    }

    public Formation(String Code, String Libelle, Date DateDebut, Date DateFin) {
        this.Code = Code;
        this.Libelle = Libelle;
        this.DateDebut = DateDebut;
        this.DateFin = DateFin;
    }

    public String getCode() {
        return Code;
    }

    public String getLibelle() {
        return Libelle;
    }

    public Date getDateDebut() {
        return DateDebut;
    }

    public Date getDateFin() {
        return DateFin;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public void setDateDebut(Date DateDebut) {
        this.DateDebut = DateDebut;
    }

    public void setDateFin(Date DateFin) {
        this.DateFin = DateFin;
    }
    

    @Override
    public boolean equals(Object obj) {
        Formation a = (Formation)obj;
        if (a.getCode().equals(this.Code)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Code : " + Code + ", Libelle : " + Libelle + " effectuée entre " + DateDebut + " et " + DateFin;
    }

    @Override
    public int compareTo(Object o) {
        Formation a = (Formation) o;
        return Code.compareTo(a.Code);
    }
    
    
    
    
}
