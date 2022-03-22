package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int Li;
        int Cj;
        Scanner scanner = new Scanner(System.in);

        Li = scanner.nextInt();
        Cj = scanner.nextInt();

        int[][] a = new int[Li][Cj];
        
        a = gerrarMatriz(Li, Cj);
        System.err.println();
        imprimir(a);
        System.err.println("\n----\n");
        imprimir(TranspoeMatriz(a));

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

    private static int[][] TranspoeMatriz(int[][] a) {
        int[][] At = new int[a[0].length][a.length]; // inicializa invertendo linhas e colunas
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                At[j][i] = a[i][j];
            }
        }
        return At;
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
