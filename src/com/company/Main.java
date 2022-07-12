package com.company;

import java.util.Scanner;

public class Main {
    private static int[][] tbl = new int [19][7];
    public static void main(String[] args) {
        inscriptiontbl();
        meilleureAttaque();
        afficheTbl();


    }
    public static void inscriptiontbl(){
        Scanner sc = new Scanner(System.in);
        int pointsGagne = 0;
        int tmp = 0;
        int tmp2 = 0;
        for (int i=0; i <2; i++)
        {
            System.out.println(String.format("Equipe N°[%d] - Match gagné: ", i));
            int matchGagne = sc.nextInt();
            System.out.println("Match nul: ");
            int matchNul = sc.nextInt();
            System.out.println("Match perdu: ");
            int matchPerdu = sc.nextInt();
            System.out.println("But marqués: ");
            int butMarque = sc.nextInt();
            System.out.println("But encaissés: ");
            int butEncaisses = sc.nextInt();
            tbl[i][0] = matchGagne;
            tbl[i][1] = matchNul;
            tbl[i][2] = matchPerdu;
            tbl[i][3] = butMarque;
            tbl[i][4] = butEncaisses;

            if(matchGagne != 0)
            {
                pointsGagne = (matchGagne*3) + 0;
            }
            if(matchNul != 0)
            {
                pointsGagne = pointsGagne + (matchNul) + 0;
            }
            System.out.println("Debug points: "+ pointsGagne);
            tbl[i][5] = pointsGagne;
            if (tbl[i][5] > tmp)
            {
                tmp2 = i;
                tmp = tbl[i][5];
            }


        }
        System.out.println(String.format("Meilleur Equipe N°[%d] - avec le nombre de points: %d", tmp2, tmp));



    }

    public static void meilleureAttaque()
    {
        int localBut = 0;
        int localEquipe = 0;
        for (int i=0; i<2; i++)
        {
            if (tbl[i][3] > localBut)
            {
                localEquipe = i;
                localBut = tbl[i][3];
            }
        }
        System.out.println(String.format("Meilleure attaque Equipe N°[%d] - But: %d",localEquipe,localBut));
    }

    public static void afficheTbl()
    {
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(tbl[i][j] + " ");
            }
            System.out.println();
        }
    }

}
