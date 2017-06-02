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
public class Tuile {
    
    private String nomTuile;
    private int ligne;
    private int colonne;

    public Tuile(int ligne, int colonne) {
        
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public int getColonne() {
        return colonne;
    }

    public int getLigne() {
        return ligne;
    }

    public String getNomTuile() {
        return nomTuile;
    }
    
    
    
}
