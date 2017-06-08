/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author khelifza
 */
public class MainTest {

    
    
    public static void main(String[] args) {
        
        Grille grille = new Grille();
        
        Aventurier zak = new Aventurier("zak", grille);
        
        zak.setPositionAventurier(grille.getTuile(2, 3));
        
        
        zak.deplacerAventurier();
        
        System.out.println("new coo");
        System.out.println(zak.getPositionAventurier().getCoordonnees());
        
        zak.deplacerAventurier();
        System.out.println("yo");
        grille.getTuile(2, 3).yaQui();
        System.out.println("yo2");
        zak.getPositionAventurier().yaQui();
    }
    
}
