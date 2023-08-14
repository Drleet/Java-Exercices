/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testabstract;

import java.util.Objects;

/**
 *
 * @author HP
 */
public abstract class emission {
    private String titreem;
    private String dureeem;

    public emission(String titreem, String dureeem) {
        this.titreem = titreem;
        this.dureeem = dureeem;
    }

    public String getTitreem() {
        return titreem;
    }

    public String getDureeem() {
        return dureeem;
    }

    public void setTitreem(String titreem) {
        this.titreem = titreem;
    }

    public void setDureeem(String dureeem) {
        this.dureeem = dureeem;
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        emission em1 = (emission) obj;
        
        if(titreem.equals(em1.titreem)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "emission{" + "titreem=" + titreem + ", dureeem=" + dureeem + '}';
    }
    
    public abstract String getinfos();
    
    
    
    
    
}
