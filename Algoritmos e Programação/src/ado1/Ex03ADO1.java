package ado1;
import java.util.*;
public class Ex03ADO1 {
    public static void main(String[] args) {
        double weight;
        double height;
        double index;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a altura (em metros): ");
        height = input.nextDouble();
        System.out.print("Insira o peso (em kilogramas(kg): ");
        weight = input.nextDouble();
        index = weight / (height * height);
        if (index < 26)
        {
            System.out.println("Grau de Obesidade: Normal");
        }
        else if (index >= 26 && index < 30)
        {
            System.out.println("Grau de Obesidade: Obeso");
        }
        else
        {
            System.out.println("Grau de Obesidade: Obeso Mórbido");
        }
        input.close();
    }
}
