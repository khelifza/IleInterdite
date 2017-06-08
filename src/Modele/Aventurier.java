/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author khelifza
 */
//classe mere des aventuriers, abstraite
public abstract class Aventurier {

    private Tuile positionAventurier;
    private Grille grille;
    private String nom;

    //private int nombreActions;

    public Aventurier(String nom, Grille grille){
        this.nom = nom;
        this.grille = grille;
    }
    
    
    
    
    //methode en vigueur pour les classes filles ingenieur et messager
    public HashMap<Integer,Tuile> listeTuilesPossibles (){
        
        HashMap<Integer,Tuile> listetuilesHBGD = new HashMap<>();//collection des tuiles adjacentes
        listetuilesHBGD = grille.listeTuilesVoisinesHBGD(positionAventurier);//stockage de cette collection dans une variable
        HashMap<Integer,Tuile> listerendue = new HashMap<>();//liste rendue par le methode
        
        //parcours des tuiles adjacentes
        for (Integer cle: listetuilesHBGD.keySet()) {
            //si elles ne sont pas coulees
            if(listetuilesHBGD.get(cle).getEtatTuiles() != EtatTuile.coulée){
                listerendue.put(cle, listetuilesHBGD.get(cle));//alors on les ajoute aux tuiles possibles
            }
        }
        
        return listerendue;
        
    }
    
    
    //methode de depacement de l'aventurier
    public void deplacerAventurier() {
        
        HashMap<Integer, Tuile> deplacement_potentiel = new HashMap<>();
        deplacement_potentiel = listeTuilesPossibles();
        Tuile choisie = new Tuile();
        choisie = choixDirection();
        choisie.ajouterAventurier(this);
        positionAventurier.retirerAventurier(this);
        setPositionAventurier(choisie);
        
        
    }

    //methode permettant de choisir la direction de deplacement
    public Tuile choixDirection() {
        //scanner qui permet de choisir les joueurs
        
        int choix =0;//represente le choix
        int numerochoixissuliste = 1;
        System.out.print("Les tuiles disponibles sont :");
        
        for (Integer cle : listeTuilesPossibles().keySet()) {
            System.out.print("choix numero :");
            System.out.print(String.valueOf(cle));
            System.out.println(listeTuilesPossibles().get(cle).getCoordonnees());
        }
        
        System.out.println("faites votre choix en tapant le numero");
        
        
        
        Tuile tuilerendue = null;
        boolean choixvalide = false;//conditionne la sortie de boucle

        //tant que le choix n'est pas validé loop
        while (choixvalide != true) {
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();
            
            if(listeTuilesPossibles().containsKey(choix)){
                choixvalide = true;
                System.out.print("deplacement accepté" );
            }
            else{
                System.out.println("deplacement invalide veuillez recommencer");
            }
        }
        return listeTuilesPossibles().get(choix);
    }

    //getters

    public String getNom() {
        return nom;
    }
    
    
    public Tuile getPositionAventurier() {
        return positionAventurier;
    }

    //setters

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    public void setPositionAventurier(Tuile position) {
        this.positionAventurier = position;
    }
}
