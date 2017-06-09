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

//se deplace aussi en diagonale
public class Explorateur extends Aventurier{

    public Explorateur(String nom, Grille grille) {
        super(nom, grille);
    }
    
    //redefinie pour pouvoir se deplacer en diagonale
    @Override
    public HashMap<Integer, Tuile> listeTuilesPossibles() {
        
        //collection des tuiles sur lesquelles il pourra se deplacer
        HashMap<Integer,Tuile> listetuilesHBGDDiag = new HashMap<>();
        listetuilesHBGDDiag = getGrille().listeTuilesHGBDandDiagonales(getPositionAventurier());
        HashMap<Integer, Tuile> listerendue = new HashMap<>();
        
        //parcours des tuiles adjacentes et diagonales
        for (Integer cle : listetuilesHBGDDiag.keySet()) {
            //si elles ne sont pas coulees
            if(listetuilesHBGDDiag.get(cle).getEtatTuiles() != EtatTuile.coulée){
                listerendue.put(cle, listetuilesHBGDDiag.get(cle));//alors on les ajoute aux tuiles possibles
            }
        }
        return listerendue;
    }

    //redefinie aussi
    @Override
    public void deplacerAventurier() {
        
        HashMap<Integer, Tuile> deplacement_potentiel = new HashMap<>();
        deplacement_potentiel = listeTuilesPossibles();
        Tuile choisie = new Tuile();
        choisie = choixDirection();
        choisie.ajouterAventurier(this);
        getPositionAventurier().retirerAventurier(this);
        setPositionAventurier(choisie);
    }

    //redifine pour assecher en diagonale
    @Override
    public HashMap<Integer, Tuile> listeTuilesPossiblesAssechement() {
        
    }
    
    
    
}
