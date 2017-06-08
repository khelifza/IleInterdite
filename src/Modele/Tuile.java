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
public class Tuile {
    
    private String nomTuile;
    private int ligne;
    private int colonne;
    private EtatTuile etatTuiles;
    private ArrayList<Aventurier> aventuriers;
    
    //sert au choix
    public Tuile() {
        ArrayList<Aventurier> a = new ArrayList<>();
        this.aventuriers = a;
    }
    
    //constructeur
    public Tuile(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
        ArrayList<Aventurier> a = new ArrayList<>();
        this.aventuriers = a;
        this.nomTuile = nomTuile.toString();
    }

    
    
    
    //méthodes
    
    
    public void yaQui(){
        for (int i = 0; i < aventuriers.size(); i++) {
            System.out.println(aventuriers.get(i).getNom());
        }
    }
    //permettra de placer un aventurier qui s'est déplacé sur la tuile donnée
    public void ajouterAventurier(Aventurier aventurier){
        aventuriers.add(aventurier);
    }
    
    //permet de retirer un aventurier de la tuile présente apres(ou avant) qu'il se soit déplacé
    public void retirerAventurier(Aventurier aventurier){
        aventuriers.remove(aventurier);
    }
    
    
    //getters
    public int getColonne() {
        return colonne;
    }

    public int getLigne() {
        return ligne;
    }

    public String getNomTuile() {
        return nomTuile;
    }

    public EtatTuile getEtatTuiles() {
        return etatTuiles;
    }

    public ArrayList<Aventurier> getAventuriers() {
        return aventuriers;
    }
    
    //rend les coordonnes sous la forme (ligne,colonne) en chaine de caratceres
    public String getCoordonnees(){
        return "(" + Integer.toString(this.getLigne()) + "," + Integer.toString(this.getColonne()) + ")";
    }
    
    
    //setters
    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public void setEtatTuiles(EtatTuile etatTuiles) {
        this.etatTuiles = etatTuiles;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public void setNomTuile(String nomTuile) {
        this.nomTuile = nomTuile;
    }

    public void setAventuriers(ArrayList<Aventurier> aventuriers) {
        this.aventuriers = aventuriers;
    }
    
}
