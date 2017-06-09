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
        
        //tuile (0,2)
        if(this.ligne == 0 && this.colonne == 2){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.Le_Pont_Des_Abimes.toString();
        }
        //tuile(0,3)
        if(this.ligne == 0 && this.colonne == 3){
            this.etatTuiles = EtatTuile.innondée;
            this.nomTuile = NomTuileEnum.La_Porte_De_Bronze.toString();
        }
        //tuile(1,1)
        if(this.ligne == 1 && this.colonne == 1){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.La_Caverne_Des_Ombres.toString();
        }
        //tuile(1,2)
        if(this.ligne == 1 && this.colonne == 2){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.La_Porte_De_Fer.toString();
        }
        //tuile(1,3)
        if(this.ligne == 1 && this.colonne == 3){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.La_Porte_d_Or.toString();
        }
        //tuile(1,4)
        if(this.ligne == 1 && this.colonne == 4){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.Les_Falaises_De_L_Oubli.toString();
        }
        //tuile(2,0)
        if(this.ligne == 2 && this.colonne == 0){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.Le_Palai_De_Corail.toString();
        }
        //tuile(2,1)
        if(this.ligne == 2 && this.colonne == 1){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.La_Porte_D_Argent.toString();
        }
        //tuile(2,2)
        if(this.ligne == 2 && this.colonne == 2){
            this.etatTuiles = EtatTuile.coulée;
            this.nomTuile = NomTuileEnum.Les_Dunes_De_L_Illusion.toString();
        }
        //tuile(2,3)
        if(this.ligne == 0 && this.colonne == 3){
            this.etatTuiles = EtatTuile.innondée;
            this.nomTuile = NomTuileEnum.Heliport.toString();
        }
        //tuile(2,4)
        if(this.ligne == 2 && this.colonne == 4){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.La_Porte_De_Cuivre.toString();
        }
        //tuile(2,5)
        if(this.ligne == 2 && this.colonne == 5){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.Le_Jardin_Des_Hurlements.toString();
        }
        //tuile(3,0)
        if(this.ligne == 3 && this.colonne == 0){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.La_Foret_Pourpre.toString();
        }
        //tuile(3,1)
        if(this.ligne == 3 && this.colonne == 1){
            this.etatTuiles = EtatTuile.innondée;
            this.nomTuile = NomTuileEnum.Le_Lagon_Perdu.toString();
        }
        //tuile(3,2)
        if(this.ligne == 3 && this.colonne == 2){
            this.etatTuiles = EtatTuile.coulée;
            this.nomTuile = NomTuileEnum.Le_Marais_Brumeux.toString();
        }
        //tuile(3,3)
        if(this.ligne == 3 && this.colonne == 3){
            this.etatTuiles = EtatTuile.innondée;
            this.nomTuile = NomTuileEnum.Observatoire.toString();
        }
        //tuile(3,4)
        if(this.ligne == 3 && this.colonne == 4){
            this.etatTuiles = EtatTuile.coulée;
            this.nomTuile = NomTuileEnum.Le_Rocher_Fantome.toString();
        }
        //tuile(3,5)
        if(this.ligne == 3 && this.colonne == 5){
            this.etatTuiles = EtatTuile.innondée;
            this.nomTuile = NomTuileEnum.La_Caverne_Du_Brasier.toString();
        }
        //tuile(4,1)
        if(this.ligne == 4 && this.colonne == 1){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.Le_Temple_Du_Soleil.toString();
        }
        //tuile(4,2)
        if(this.ligne == 4 && this.colonne == 2){
            this.etatTuiles = EtatTuile.coulée;
            this.nomTuile = NomTuileEnum.Le_Temple_De_La_Lune.toString();
        }
        //tuile(4,3)
        if(this.ligne == 4 && this.colonne == 3){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.Le_Palais_Des_Marees.toString();
        }
        //tuile(4,4)
        if(this.ligne == 4 && this.colonne == 4){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.Le_Val_Du_Crepuscule.toString();
        }
        //tuile(5,2)
        if(this.ligne == 5 && this.colonne == 2){
            this.etatTuiles = EtatTuile.seche;
            this.nomTuile = NomTuileEnum.La_Tour_Du_Guet.toString();
        }
        //tuile(5,3)
        if(this.ligne == 5 && this.colonne == 3){
            this.etatTuiles = EtatTuile.innondée;
            this.nomTuile = NomTuileEnum.Le_Jardin_Des_Murmures.toString();
        }
        
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
