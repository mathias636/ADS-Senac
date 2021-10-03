package lista;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args){
        double a, b, c, resultado;
        double pi = 3.14159;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Insira 3 valores");
        System.out.print("\na: ");
        a = entrada.nextDouble();
        System.out.print("\nb: ");
        b = entrada.nextDouble();
        System.out.print("\nc: ");
        c = entrada.nextDouble();
        resultado = (a*c)/2;
        System.out.println("A área do triângulo retângulo é " + resultado);
        resultado = pi*(c*c);
        System.out.println("A área do círculo (de raio C) é " + resultado);
        resultado = (a+b)*c/2;
        System.out.println("A área de um trapézio é " + resultado);
        resultado = b*b;
        System.out.println("A área de um quadrado de lado B é " + resultado);
        resultado = a*b;
        System.out.println("A área de um retângulo de lados A e B é " + resultado);
        resultado = (a+b)*2;
        System.out.println("O perimetro de um retângulo de lados A e B é " + resultado);
        entrada.close();
    }
}
