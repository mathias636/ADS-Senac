package ado1;
import java.util.*;
public class Ex04ADO1 {
    public static void main(String[] args)
    {
        double consumo = 0, minimum = 11.90;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o kWh consumido: ");
        consumo = input.nextDouble();
        input.close();
        if (consumo < 150)
        {
            consumo = (consumo * 0.20) + minimum;
        }
        else if (consumo >= 150 && consumo < 500)
        {
            consumo = (consumo * 0.25)  + minimum;
        }
        else
        {
            consumo = (consumo * 0.30)  + minimum;
        }
        System.out.print("O consumo foi de R$" + consumo);
    }
}