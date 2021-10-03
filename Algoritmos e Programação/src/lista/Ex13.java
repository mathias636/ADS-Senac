package lista;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira 3 números");
        System.out.print("A: ");
        a = input.nextDouble();
        System.out.print("B: ");
        b = input.nextDouble();
        System.out.print("C: ");
        c = input.nextDouble();
        if (a > b && a > c) {
            System.out.print("O maior é " +a); 
        }else if (b > a && b > c) {
            System.out.print("O maior é " +b); 
        }else if (c > a && c > b) {
            System.out.print("O maior é " +c); 
        }else {
            System.out.println("Não há um único número maior entre: "+a+", "+b+" e "+c); 
        }
        input.close();
    }
}
