package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        int Li = scanner.nextInt();
        int Cj = Li;

        int[][] Matriz;

        Matriz = gerrarMatriz(Li, Cj);

        imprimir(Matriz);

        System.out.println("soma diagonal = "+SomaDiagonal(Matriz));

        scanner.close();
    }

    private static int SomaDiagonal(int[][] A) {
        int soma = 0;

        for(int i = 0; i < A.length; i++){
            soma += A[i][i];
        }
        return soma;
    }

    public static int[][] gerrarMatriz(int Li, int Cj){
        Random random = new Random();
        int[][] A = new int[Li][Cj];

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                A[i][j] = random.nextInt(101);
            }
        }
        return A;
    }

    public static void imprimir(int[][] A){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.printf("\n");
        }
    }
    
}
