package lista;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        double L, R, a_circle, a_square;
        double pi = 3.14159265359;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira dois valores");
        System.out.print("L: ");
        L = input.nextDouble();
        System.out.print("R: ");
        R = input.nextDouble();
        a_square = Math.pow(L, 2);
        a_circle = pi*Math.pow(R, 2);
        System.out.print("Com os valores informados, a maior área é do: ");
        if (a_circle > a_square) {
            System.out.println("círculo");
        }else{
            System.out.println("quadrado");
        }
        input.close();
    }
}
