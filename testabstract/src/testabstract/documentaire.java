/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testabstract;

/**
 *
 * @author HP
 */
public class documentaire extends emission{
   private String theme;

    public documentaire(String theme, String titreem, String dureeem) {
        super(titreem, dureeem);
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "documentaire{" + "theme=" + theme + '}';
    }
   
    
   @Override
    public String getinfos(){
        return super.toString()+ "documentaire{" + "theme=" + theme + '}';
    };
}
