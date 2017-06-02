/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;



/**
 *
 * @author khelifza
 */
public class Grille {

    private Tuile [] [] tuiles;

    public Grille() {
        
        this.tuiles = new Tuile [6] [6]; //tableau double entree de tuiles et de colonnes
        
        for (int i = 0; i < tuiles.length; i++) {
            int colonne [] = new int [6];
            for (int j = 0; j < colonne.length; j++) {
                if(    i == 0 && j == 0
                    || i == 0 && j == 1
                    || i == 1 && j == 0 // coin superieur gauche
                    || i == 0 && j == 4
                    || i == 0 && j == 5
                    || i == 1 && j == 5 // coin superieur droit
                    || i == 4 && j == 0
                    || i == 5 && j == 0
                    || i == 5 && j == 1 // coin inferieur gauche
                    || i == 4 && j == 5
                    || i == 5 && j == 4
                    || i == 5 && j == 5 //coin inferieur droit
                   )
                {
                    this.tuiles = null; // les tuiles correspondant aux coins seront grisées
                }
                else {
                    Tuile tuiles = new Tuile(i,j);
                }
            }
        }
        
        
    }
    
    
}
