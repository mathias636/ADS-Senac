package ado2;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);
        int n = 0;
        System.out.println("TABUADA");
        System.out.print("Insira um número: ");
        n = scanner.nextInt();
        System.out.print("A tabuada de"+n+" é: \n");
        for (int a = 0; a <= 10; a++) {
            System.out.println(n+" * "+a+" = "+n*a);
        }
        scanner.close();
    }
}
