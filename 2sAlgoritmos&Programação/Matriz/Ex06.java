package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Li = scanner.nextInt();
        int Cj = scanner.nextInt();
        int[][] A;
        int[][] B;
        
        imprimir(A = gerrarMatriz(Li, Cj));
        System.out.println();
        imprimir(B = gerrarMatriz(Li, Cj));
        System.out.println();
        imprimir(somarMatrizes(A, B));
        scanner.close();
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

    public static int[][] somarMatrizes(int[][] A, int[][] B){
        int[][] C = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                C[i][j] += A[i][j] + B[i][j];
            }
        }
        return C;
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
