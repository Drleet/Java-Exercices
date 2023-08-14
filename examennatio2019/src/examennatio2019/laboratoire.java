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
public class laboratoire {
    private int idlab;
    private String nom ;
    private ArrayList<procede> liste;

    public laboratoire(int idlab, String nom) {
        this.idlab = idlab;
        this.nom = nom;
    }

    @Override
    public String toString() {
        String info = "idlab"+idlab+",nom labo"+nom+"\n";
        info = info+"liste des procedes \n";
        for (int i = 0; i < liste.size(); i++) {
            info = info+liste.get(i).toString()+"\n";
            
        }
        return info;s
    }
    
    boolean addprocede(procede p1){
        for (int i = 0; i < liste.size()  ; i++) {
          if(p1.getReference().equals(liste.get(i).getReference())){
              liste.add(p1);
              return true;
          }   
        }
       return false;
    }   
    procede delprocede(int index){
      /*  procede p = new procede();
      for (int i = 0; i < liste.size()  ; i++) {
          if(index==i){
              p = liste.get(i);
              liste.remove(index);
              
          }   
        }*/
        
       return liste.remove(index); 
    
    }
    
    
    procede searchpr(String reference){
         for (int i = 0; i < liste.size()  ; i++) {
          if(reference.equals(liste.get(i).getReference())){
              return liste.get(i);
              
          }   
      
    }  return null;
    }
     
    
    
}
