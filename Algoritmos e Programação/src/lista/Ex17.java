package lista;
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        double a, b, c, d;
        double sumCD, sumAB;
        Scanner input = new Scanner(System.in);
        System.out.println("\nInsira 4 valores");
        System.out.print("\nA: ");
        a = input.nextInt();
        System.out.print("\nB: ");
        b = input.nextInt();
        System.out.print("\nC: ");
        c = input.nextInt();
        System.out.print("\nD: ");
        d = input.nextInt();
        sumCD = c+d;
        sumAB = a+b;
        if ((b > c) && (d > a) && (sumCD > sumAB) && (c > 0) && (d > 0) && (a % 2 == 0)) {
            System.out.println("valores aceitos");
        }else{
            System.out.println("valores não aceitos");
        }
        input.close();
    }
}
