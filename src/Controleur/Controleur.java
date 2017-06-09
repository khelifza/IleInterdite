/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Aventurier;
import Modele.Grille;
import Modele.Ingenieur;
import Modele.Tuile;
import java.util.Scanner;
//import Modele.

/**
 *
 * @author khelifza
 */
public class Controleur {
    
    

    public Controleur() {
        
    }
    
    //initialise le plateau, les joueurs etc...
    public void demarrerJeu(){
        
        
        System.out.println("creation de la grille et des joueurs...");
        //creation de la Grille
        Grille grille = new Grille();
        
        //ajout des Aventuriers
        Aventurier aventurier1 = new Ingenieur("zak", grille);
        
    }
    
    public void partie(){
        boolean tourfini = false;
        int nombreaction = 0;
        
        //tant que le tour n'est pas fini on execute des actions
        while(tourfini != true){
            
        }
    }
    
    public void choixAction(){
        
        
        System.out.println("choisissez une action");
        Scanner scanner = new Scanner(System.in);
        System.out.println("pour vous deplacer, tapez 1");
        System.out.println("pour assecher, tapez 2");
        int choix = scanner.nextInt();
        if (choix == 1){
            
        }
    }
}
