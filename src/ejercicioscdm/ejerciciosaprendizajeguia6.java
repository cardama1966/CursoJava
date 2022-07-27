/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscdm;

import java.util.Scanner;

public class ejerciciosaprendizajeguia6 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int matrizG[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizG[i][j] = (int) (Math.random() * 100);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("la matriz queda asi: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("      " + matrizG[i][j]);
            }
            System.out.println("");
        }
        System.out.println("realice el llenado de la matriz");
        int matriz[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("la matriz queda asi: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("   " + matriz[i][j]);
            }
            System.out.println("");
        }

        buscarv(matrizG, matriz);

    }

    public static void buscarv(int[][] matrizG, int[][] matriz) {
        int cont = 0;
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {

                if (matrizG[i][j] == matriz[0][0]) {
                    cont = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizG[i + k][j + l] == matriz[k][l]) {
                                cont++;
                                System.out.print("  [" + (i + k) + "][" + (j + l) + "]  ");
                                System.out.print(matrizG[i + k][j + l]);

                                    //System.out.println("La matriz se encuentra a partir de la fila " + i + "columna " + j);
                            }

                        }
                        System.out.println("");
                    }

                }
                if (cont == 9) {
                    break;
                }

            }
        }
       // System.out.println(cont);

    }
}
