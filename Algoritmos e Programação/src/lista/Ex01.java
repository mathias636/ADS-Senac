package lista;
import java.util.*;
public class Ex01 {
    public static void main(String[] args) {
        int n1, n2, p;
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite o primeiro valor: ");
        n1 = input.nextInt();
        System.out.print("\nDigite o segundo valor: ");
        n2 = input.nextInt();
        p = n1 * n2;
        System.out.print("O produto é: " + p);
        input.close();
    }
}
