package lista;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        double a, b, c, d, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira quatro valores");
        System.out.print("\na: ");
        a = entrada.nextDouble();
        System.out.print("\nb: ");
        b = entrada.nextDouble();
        System.out.print("\nc: ");
        c = entrada.nextDouble();
        System.out.print("\nd: ");
        d = entrada.nextDouble();
        resultado = (a+b+c+d)/4;
        System.out.println("A média aritmética dos quatro números é " + resultado);
        entrada.close();
    }   
}
