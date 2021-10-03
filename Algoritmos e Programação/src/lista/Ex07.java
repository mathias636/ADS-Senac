package lista;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, resultado;
        System.out.println("Insisra os valores");
        System.out.print("A: ");
        a = entrada.nextDouble();
        System.out.print("B: ");
        b = entrada.nextDouble();
        resultado = (a*a)+(b*b);
        resultado = Math.sqrt(resultado);
        System.out.print("A hipotenusa é " + resultado);
        entrada.close();
    }
}
