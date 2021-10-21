package com.company;

import java.util.Scanner;
/**
 * Cette classe permet d'afficher les règles du jeu.
 */
public class RegleDuJeu {

    public static void main() {

        boolean retourMenu = false;



            System.out.println("~~~~~~~~~~Règle Du Jeu~~~~~~~~~~~~~");

        System.out.println("Chaque tour un joueur doit se déplacer d'une case verticalement ou horizontalement");
        System.out.println();
        System.out.println("Il doit en suite détruire une case qui n'est pas occupé ou qui n'est pas déja détruite");
        System.out.println();
        System.out.println("Le premier jour à être bloqué est déclarer perdant");
        System.out.println();

        while (retourMenu != true) {

        System.out.println("Pour revenir au menu taper 1");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b == 1) {
            retourMenu = true;
        }
        else {
            System.out.println("entre incorrect");
        }
    }
    }

}
