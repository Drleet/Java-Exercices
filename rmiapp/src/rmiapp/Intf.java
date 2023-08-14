/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmiapp;
import java.rmi.*;


/**
 *
 * @author HP
 */
public interface Intf extends Remote {
    public int carre(int a) throws RemoteEcxception;
    
}
