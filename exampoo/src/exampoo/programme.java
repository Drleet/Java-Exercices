/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampoo;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class programme {
    private ArrayList<emission> liste  = new ArrayList<>();
    
    
    
    
    int searchem(){
        
        if(liste.isEmpty()){
            return 0;
        }else{
            for(int i=0;i<liste.size();i++){
                System.out.println(liste.get(i));
            }
        }
        return 1;
    }
    
    void addemission(emission em){
         liste.add(em);
     
    }
    
    void delemission(int in , emission e){
        for(int i=0;i<= liste.size();i++){
            if(i == in){
                liste.remove(in);
                break;
            }
            else{
                System.out.println("l'emission est introuvable");
            }
        }
        
    }
    
    void setemission(int in , emission e){
        for(int i=0;i< liste.size();i++){
            if(i == in){
                liste.set(in ,e);
                break;
            }
            else{
                System.out.println("l'emission est introuvable");
            }
        
        }
    }
    double montantot(){
        double mtt = 0;
        for(int i =0 ;i<liste.size();i++){
            mtt += liste.indexOf(emission.montant(90));
        }   
        return mtt;
    }
    
    void afficher(String cat){
        for(int i=0;i<liste.size();i++){
            
                System.out.println(liste.get(i));
                break;
            
        }
    }
    
    
    
    
}









