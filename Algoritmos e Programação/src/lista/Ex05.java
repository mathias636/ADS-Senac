package lista;
import java.util.Scanner;
public class Ex05 {
    public static void main(String args[]) {
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o valor do L: ");
        area = input.nextDouble();
        area = Math.pow (area, 2);
        System.out.print("A área do quadrado é: " + area);
        input.close();
    }
}