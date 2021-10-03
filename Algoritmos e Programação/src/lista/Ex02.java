package lista;
import java.util.*;
public class Ex02 {
    public static void main(String args[]) {
        double b, x, result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite a Base: ");
        b = scanner.nextDouble();
        System.out.print("\nDigite o Expoente: ");
        x = scanner.nextDouble();
        result = Math.pow(b, x);
        System.out.println(b+" elevado a(o) "+x +" é: "+result);
        scanner.close();
    }
}
