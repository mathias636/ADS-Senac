package Matriz;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] Matriz;
        int Li = scanner.nextInt();
        int Cj = scanner.nextInt();

        Matriz = popularMatrizManualmente(Li, Cj);
        imprimir(Matriz);
        System.out.println(validarMatriz(Matriz));

        scanner.close();
    }

    private static int[][] popularMatrizManualmente(int Li, int Cj) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[Li][Cj];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        scanner.close();
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

    private static boolean validarMatriz(int[][] A) {
        boolean validador = true;

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(A[i][j] != A[j][i]){
                    validador = false;
                    return validador;
                }
            }
        }
        return validador;
    }
}