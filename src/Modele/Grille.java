/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.HashMap;



/**
 *
 * @author khelifza
 */
public class Grille {

    private Tuile [] [] tuiles;

    public Grille() {
        
        this.tuiles = new Tuile [6] [6]; //tableau double entree de tuiles et de colonnes
        
        for (int i = 0; i < 6; i++) {
           
            for (int j = 0; j < 6; j++) {
                if( i == 0 && j == 0
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
                   Tuile t = new Tuile(i,j);
                    tuiles [i] [j] = null; // les tuiles correspondant aux coins seront grisées et inutilisables
                }
                else {
                    Tuile t = new Tuile(i,j);
                    tuiles [i] [j] = t;         //construction de tuiles la ou c'est possible
                }
            }
        }
        
    }
    
    //methodes
    
    //rend la tuile au dessus
    public Tuile GetTuileHaut (Tuile t){
        
        int ligne = t.getLigne();
        int colonne = t.getColonne();
        
        if(getTuiles()[ligne - 1] [colonne] != null){
            return getTuiles()[ligne - 1][colonne];
        }
        else{
            return null;
        }
    }
    
    //rend la tuile au dessous
    public Tuile GetTuileBas (Tuile t){
        
        int ligne = t.getLigne();
        int colonne = t.getColonne();
        
        if(getTuiles()[ligne + 1] [colonne] != null){
            return getTuiles()[ligne + 1] [colonne];
        }
        else{
            return null;
        }
    }
    
    //rend la tuile a gauche
    public Tuile GetTuileGauche (Tuile t){
        
        int ligne = t.getLigne();
        int colonne = t.getColonne();
        
        if(getTuiles()[ligne] [colonne - 1] != null){
            return getTuiles()[ligne] [colonne - 1];
        }
        else{
            return null;
        }
    }
    
    //rend la tuile droite
    public Tuile GetTuileDroite (Tuile t){
        
        int ligne = t.getLigne();
        int colonne = t.getColonne();
        
        if(getTuiles()[ligne] [colonne+ 1] != null){
            return getTuiles()[ligne] [colonne+ 1];
        }
        else{
            return null;
        }
    }
    
    //rend la liste des tuiles voisines si elles existent
    public HashMap<Integer,Tuile> listeTuilesVoisinesHBGD(Tuile tuiles){
        
        /*
        liste clé : HAUT = 1, BAS = 2, GAUCHE = 3, DROITE = 4
        */ 
        int ligne = tuiles.getLigne();
        int colonne = tuiles.getColonne();
        HashMap<Integer,Tuile> listeTuilesHBGD = new HashMap<Integer, Tuile>();
        
        //en haut la clé sera 1
        if (getTuiles()[ligne - 1] [colonne] != null){
            listeTuilesHBGD.put(1, getTuiles()[ligne - 1][colonne]);
        }
        //aller en bas la cle sera 2
        if (getTuiles()[ligne + 1] [colonne] != null){
            listeTuilesHBGD.put(2, getTuiles()[ligne + 1][colonne]);
        }
        //aller a gauche la cle sera 3
        if (getTuiles()[ligne] [colonne - 1] != null){
            listeTuilesHBGD.put(3, getTuiles()[ligne][colonne - 1]);
        }
        //aller a droite la cle sera 4
        if (getTuiles()[ligne] [colonne+ 1] != null){
            listeTuilesHBGD.put(4, getTuiles()[ligne][colonne + 1]);
        }
        listeTuilesHBGD.put(9,getTuiles()[ligne][colonne]);
        return listeTuilesHBGD;
    }
    
    //rend la liste des tuiles en diagonale si elles existent
    public HashMap<Integer,Tuile> listeTuilesDiagonales(Tuile tuiles){
        
        /*
        liste clé : HAUT-GAUCHE = 5, HAUT-DROITE = 6, BAS-GAUCHE = 7, BAS-DROITE = 8
        */
        
        int ligne = tuiles.getLigne();
        int colonne = tuiles.getColonne();
        HashMap<Integer,Tuile> listeTuilesDiag = new HashMap<Integer, Tuile>();
        
        // haut gauche
        if (getTuiles()[ligne-1] [colonne-1] != null){
            listeTuilesDiag.put(5, getTuiles()[ligne-1][colonne-1]);
        }
        // haut droite
        if (getTuiles()[ligne -1] [colonne +1] != null){
            listeTuilesDiag.put(6, getTuiles()[ligne-1][colonne+1]);
        }
        // bas gauche
        if (getTuiles()[ligne+1] [colonne-1] != null){
            listeTuilesDiag.put(7, getTuiles()[ligne+1][colonne - 1]);
        }
        // bas droite
        if (getTuiles()[ligne+1] [colonne+1] != null){
            listeTuilesDiag.put(8, getTuiles()[ligne+1][colonne + 1]);
        }
        
        return listeTuilesDiag;
    }
    
    //rend la liste des tuiles adjacentes et en diagonales
    public HashMap<Integer, Tuile> listeTuilesHGBDandDiagonales(Tuile tuiles){
        /*
        liste clé : HAUT = 1, BAS = 2, GAUCHE = 3, DROITE = 4
        */ 
        int ligne = tuiles.getLigne();
        int colonne = tuiles.getColonne();
        HashMap<Integer,Tuile> listeTuilesHBGDandDiag = new HashMap<Integer, Tuile>();
        
        //en haut la clé sera 1
        if (getTuiles()[ligne - 1] [colonne] != null){
            listeTuilesHBGDandDiag.put(1, getTuiles()[ligne - 1][colonne]);
        }
        //aller en bas la cle sera 2
        if (getTuiles()[ligne + 1] [colonne] != null){
            listeTuilesHBGDandDiag.put(2, getTuiles()[ligne + 1][colonne]);
        }
        //aller a gauche la cle sera 3
        if (getTuiles()[ligne] [colonne - 1] != null){
            listeTuilesHBGDandDiag.put(3, getTuiles()[ligne][colonne - 1]);
        }
        //aller a droite la cle sera 4
        if (getTuiles()[ligne] [colonne+ 1] != null){
            listeTuilesHBGDandDiag.put(4, getTuiles()[ligne][colonne + 1]);
        }
        // haut gauche
        if (getTuiles()[ligne-1] [colonne-1] != null){
            listeTuilesHBGDandDiag.put(5, getTuiles()[ligne-1][colonne-1]);
        }
        // haut droite
        if (getTuiles()[ligne - 1] [colonne+1] != null){
            listeTuilesHBGDandDiag.put(6, getTuiles()[ligne-1][colonne+1]);
        }
        // bas gauche
        if (getTuiles()[ligne+1] [colonne - 1] != null){
            listeTuilesHBGDandDiag.put(7, getTuiles()[ligne+1][colonne - 1]);
        }
        // bas droite
        if (getTuiles()[ligne+1] [colonne+1] != null){
            listeTuilesHBGDandDiag.put(8, getTuiles()[ligne+1][colonne + 1]);
        }
        return listeTuilesHBGDandDiag;
    }
    //rend la liste des tuiles diagonales si elles existent
    public HashMap<Integer,Tuile> listeTuilesInnondeesDiagonales(Tuile tuiles){
        
        /*
        liste clé : 
        HAUT-GAUCHE = 5
        HAUT-DROITE = 6
        BAS-GAUCHE = 7
        BAS-DROITE = 8
        */
        
        int ligne = tuiles.getLigne();
        int colonne = tuiles.getColonne();
        
        HashMap<Integer,Tuile> listeTuilesInnDiag = new HashMap<Integer, Tuile>(); //liste rendue par la methode
        HashMap<Integer,Tuile> listeTuilesDiag = new HashMap<Integer, Tuile>(); // liste parcourue pour trouver tuiles diagonales
        
        listeTuilesDiag = listeTuilesDiagonales(tuiles);
        
        for (Integer cle : listeTuilesDiag.keySet()) {
            if(listeTuilesDiag.get(cle).getEtatTuiles() == EtatTuile.innondée){
                listeTuilesInnDiag.put(cle, listeTuilesDiag.get(cle));
            }
        }
        return listeTuilesInnDiag;
    }
    
    //rend la liste des tuiles innnondées voisines si elles existent
    public HashMap<Integer,Tuile> listeTuilesInnondeesVoisinesHBGD(Tuile tuiles){
        /*
        liste clé : 
        HAUT =  1
        BAS = 2
        GAUCHE = 3
        DROITE = 4
        */
        int ligne = tuiles.getLigne();
        int colonne = tuiles.getColonne();
        
        HashMap<Integer,Tuile> listeTuilesInn = new HashMap<Integer, Tuile>(); //liste rendue par la methode
        HashMap<Integer,Tuile> listeHBGD = new HashMap<>(); //liste parcourue pour trouver tuiles voisines
        
        listeHBGD = listeTuilesVoisinesHBGD(tuiles);
        
        for (Integer cle : listeHBGD.keySet()) {
            if(listeHBGD.get(cle).getEtatTuiles() == EtatTuile.innondée){
                listeTuilesInn.put(cle, listeHBGD.get(cle));
            } 
        }
        return listeTuilesInn;
    }
    
    //rend la liste des tuiles coulees voisines si elles existent
    public HashMap<Integer,Tuile> listeTuilesCouleesVoisinesHBGD(Tuile tuiles){
        /*
        liste clé : 
        HAUT =  1
        BAS = 2
        GAUCHE = 3
        DROITE = 4
        */
        int ligne = tuiles.getLigne();
        int colonne = tuiles.getColonne();
        HashMap<Integer,Tuile> listeTuilesCoul = new HashMap<Integer, Tuile>();
        HashMap<Integer,Tuile> listeHBGD = new HashMap<>();
        listeHBGD = listeTuilesVoisinesHBGD(tuiles);
        
        for (Integer cle : listeHBGD.keySet()) {
            if(listeHBGD.get(cle).getEtatTuiles() == EtatTuile.coulée){
                listeTuilesCoul.put(cle, listeHBGD.get(cle));
            } 
        }
        return listeTuilesCoul;
    }
    
    

    //getters
    
    public Tuile[][] getTuiles() {
        return tuiles;
    }
    
    public Tuile getTuile(int a, int b) {
        return this.tuiles[a][b];
    }
    //setters
    
    public void setTuiles(Tuile[][] tuiles) {
        this.tuiles = tuiles;
    }
    
    
}