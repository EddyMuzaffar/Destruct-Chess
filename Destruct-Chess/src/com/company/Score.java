package com.company;
import com.company.Main;

import java.util.Scanner;
/**
 * Cette classe permet d'afficher le tableau des scores.
 */
public class Score {
    public static void main() {

        boolean retourMenu = false;

        int j = 0;
        System.out.println("----------Tableau des scores----------");
        for(int i = 0; i < Main.tableauScores.length; i++){
            j = i;
            System.out.println((j + 1) + " - " + Main.tableauScores[i]);
        }

        while (retourMenu != true) {

            System.out.println("Pour revenir au menu, tapez 1");
            Scanner a = new Scanner(System.in);
            if (a.nextInt() == 1) {
                retourMenu = true;
            } else {
                System.out.println("Entrée incorrecte");
            }
        }
    }
}
