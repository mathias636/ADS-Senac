package ado1;
import java.util.*;
public class Ex02ADO1 {
    public static void main(String[] args) {
        double a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        a = input.nextDouble();
        System.out.print("Insira o segundo valor: ");
        b = input.nextDouble();
        if(a % b == 0)
        {
            System.out.print("A divisão é exata");
        }
        else
        {
            System.out.print("A divisão de " + a + " por " + b + " não é exata.");
        }
        input.close();
    }
}
