package com.company;
import java.util.Scanner;
import java.util.*;

/**
 * Cette classe permet d'afficher le menu principal du jeu.
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    // Création du plateau de jeu avec grille un tableau en 2 dimensions de taille 11x10.
    static String[][] grille = new String[10][11];

    static int corX;
    static int corY;

    static String[] tableauScores = new String[10];

    /**
     * Cette méthode permet d'afficher le menu principal du Destruct Chess ainsi que d'intéragir avec celui-ci.
     * Il ne prend pas de paramètre et ne retourne rien.
     */
    public static void menuJeu(){

        System.out.println("             DestroyChesss      ");
        System.out.println();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~ ");

        System.out.println("1. Démarrer une partie ");
        System.out.println("2. Voir les scores");
        System.out.println("3. Les règles");
        System.out.println("4. Quitter le jeu");
        System.out.println();
        System.out.println("Choisir une entrée");
        int entree = 0;
        while (entree <= 0 || entree >4) {
            Scanner reader = new Scanner(System.in);
            entree = reader.nextInt();
            switch (entree) {
                case 1:
                    Joueur.main();
                    break;
                case 2:
                    Score.main();
                    break;
                case 3:
                    RegleDuJeu.main();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("L'entree est incorrect");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        boolean retourMenu = false;

        do {
            menuJeu();
        }while (retourMenu != true);








    }


}
