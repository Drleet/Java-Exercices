/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examennatio2019;
import java.util.*;

/**
 *
 * @author HP
 */
public class traitement {
    private Date datedebut ;
    private Date datefin ;
    private procede prd;
    private composant comp;

    public traitement(Date datedebut, Date datefin, procede prd, composant comp) {
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.prd = prd;
        this.comp = comp;
    }

    @Override
    public String toString() {
        return "deate de debut:"+datedebut+",date fin: "+datefin+",procede: "+prd+",ref composant: "+comp;
    }
    
    
    
    
    
    
}
