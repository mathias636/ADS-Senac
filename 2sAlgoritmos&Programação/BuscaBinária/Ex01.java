package BuscaBinária;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[100];
        
        vetor = gerarVetorCrescente(100);
        System.out.println("\nValor a ser procurado: ");
        int x = scanner.nextInt();

        BuscaBinária(vetor, x);
        scanner.close();
    }

    public static int[] gerarVetorCrescente(int Li){
        Random random = new Random();
        int[] n = new int[Li];

        for(int i = 0; i < n.length; i++){
            n[i] = random.nextInt(101);
        }
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        return n;
    }


    public static void BuscaBinária(int[] vetor, int x){
        int i = 0, f = vetor.length, meio = 0;
        while(i <= f){
            meio = (i+f)/2;
            if(vetor[meio]==x){
                System.out.println("\n valor encontrado vetor["+meio+"]");
                return;
            }else if(vetor[meio]<x){
                i = meio+1;
            }else{
                f = meio-1;
            }
        }
    }
}