/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teststring;

import java.util.*;

/**
 *
 * @author HP
 */
public class personnne {

    private String matricule;
    static int numordre = 1;
    private String service;
    private String telephone;
    private String email;

    public personnne(String service, String telephone, String email) {
        if (telephone.length() == 10) {
            if (email.contains("@gmail.com")) {
                if (service.equals("informatique") || service.equals("finance") || service.equals("comptabilite")) {
                    this.matricule = numordre+service.substring(0,3);
                    numordre++;
                    this.service = service;
                    this.telephone = telephone;
                    this.email = email;
                }
            }

        }

    }

    @Override
    public String toString() {
        return "personnne{" + "matricule=" + matricule + ", service=" + service + ", telephone=" + telephone + ", email=" + email + '}';
    }
    
}
