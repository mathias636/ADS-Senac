package Matriz;

import java.util.Random;
import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Li = scanner.nextInt();
        int Cj = scanner.nextInt();

        int[][] Matriz;

        Matriz = gerrarMatriz(Li, Cj);

        imprimir(Matriz);

        System.out.println("maior item: "+maior(Matriz));

        scanner.close();
    }

    private static int maior(int[][] A) {
        int m = A[0][0];
        
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(A[i][j] > m){
                    m = A[i][j];
                }
            }
        }
        return m;
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

