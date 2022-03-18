package BuscaBinária;

import java.util.Random;

public class GerarMatriz {
    public static void main(String[] args) {
        
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
    
}
