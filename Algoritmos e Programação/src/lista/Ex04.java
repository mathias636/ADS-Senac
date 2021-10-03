package lista;
import java.util.*;
public class Ex04 {
    public static void main(String args[]) {
        int a = 0, b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Números consecutivos\n");
        System.out.print("\nDigite o primeiro número: ");
        a = input.nextInt();
        System.out.print("\nDigite o segundo número: ");
        b = input.nextInt();
        System.out.println("Os consecutivos são, respectivamente: "+(a+1)+" e "+(b+1));
        input.close();
    }
}
