package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int Li;
        int Cj;
        Scanner scanner = new Scanner(System.in);

        Li = scanner.nextInt();
        Cj = scanner.nextInt();

        imprimir(gerrarMatriz(Li, Cj));

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

    public static void imprimir(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.printf("%3d ", a[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
