package com.mycompany.multmatrices;


import java.util.Scanner;

/**
 *
 * @author JERONIMO CASTRO
 */
public class MultMatrices {

    public static void main(String[] args) {
        int rMult, rSuma = 0;
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        int matrizS[][] = new int[3][3];
        Scanner read = new Scanner(System.in);
        
        System.out.println("Este codigo, multiplicará dos matrices 3x3 que el usuario ingrese");
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("En la Matriz A, ingrese el numero para la fila "+(i+1)+" columna "+(j+1));
                matrizA[i][j] = read.nextInt();
                System.out.println("En la Matriz B, ingrese el numero para la fila "+(i+1)+" columna "+(j+1));
                matrizB[i][j] = read.nextInt();
            }
        }
        System.out.println("\nMatriz A");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrizA[i][j]+" ");
            }
            System.out.println();
    }
        System.out.println("\nMatriz B");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrizB[i][j]+" ");
            }
            System.out.println();
    }
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                rSuma = 0;
                for(int c = 0; c < 3; c++){
                    rMult = matrizA[a][c]*matrizB[c][b];
                    rSuma = rSuma + rMult;
                }
                matrizS[a][b] = rSuma;  
            }
        }
        System.out.println("\nMatriz Solucion");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrizS[i][j]+" ");
            }
            System.out.println();
        } 
}
}