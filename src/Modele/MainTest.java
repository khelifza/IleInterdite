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
        
        Aventurier zak = new Messager("zak", grille);
        
        zak.setPositionAventurier(grille.getTuile(2, 1));
        
        
        zak.deplacerAventurier();
        
        System.out.println("new coo");
        System.out.println(zak.getPositionAventurier().getCoordonnees());
        
        
        System.out.println("yo");
        grille.getTuile(2, 3).yaQui();
        System.out.println("yo2");
        zak.getPositionAventurier().yaQui();
        System.out.println(zak.getPositionAventurier().getCoordonnees());
        
        zak.assecherTuile();
        System.out.println("etat apres assechement");
        System.out.println(grille.getTuile(3, 1).getEtatTuiles().toString());
        System.out.println("exemple2");
        System.out.println(grille.getTuile(0, 3).getEtatTuiles().toString());
        
    }
    
}
