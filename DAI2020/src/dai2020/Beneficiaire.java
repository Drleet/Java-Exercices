/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dai2020;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author REDHOOD
 */
public class Beneficiaire {

    private String CodeB;
    private String Nom;
    private String Prenom;
    private String Ville;
    private Date DateNais;
    private ArrayList<Formation> lf;

    public Beneficiaire(String CodeB, String Nom, String Prenom, String Ville, Date DateNais) {
        this.CodeB = CodeB;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Ville = Ville;
        this.DateNais = DateNais;
        this.lf = new ArrayList<Formation>();
    }

    public boolean addFormation(Formation F) {
        return lf.add(F);
    }

    public Formation delFormation(int i) {
        return lf.remove(i);
    }

    public boolean delFormation(Formation F) {
        for (int I = 0; I < lf.size(); I++) {
            if (F.getCode().equals(CodeB)) {
                lf.remove(F);
                return true;
            }
        }
        return false;
    }
    
    public Formation setFormation(int i, Formation f){
        return lf.set(i, f);
    }

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        
        
        String s= "code ben: "+CodeB+",Nom complet: "+Nom +" "+ Prenom+"ayant beneficie des formations :";
        for(int i=1;i<lf.size();i++){   
            s = s+i+"- code :"+lf.get(i).getCode()+", libelle :"+lf.get(i).getLibelle()+" effectue entre :"+f.format(lf.get(i).getDateDebut()) +"et"+f.format(lf.get(i).getDateFin())+"\n";
        }
        return s;
    }
    
    public void Trier(){
        Collections.sort(lf);
    }
    
    public void savedFormation(String file){
        //ArrayList<FormationTheorique> file = new ArrayList<FormationTheorique>();
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            for(Formation f: this.lf){
                if(f instanceof FormationTheorique){
                    
                    out.writeObject(f);
                    out.flush();
                }
            
            }out.close();
        }catch(Exception ex){}
        
        
        
    
    
    }
    
    
}
