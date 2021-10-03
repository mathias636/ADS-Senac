package ado1;
import java.util.Scanner;
public class Ex01ADO1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double i;
        System.out.print("Insira um número: ");
        i = input.nextInt();
        if (i > 100)
        {
            i = i + 150;
            System.out.print(+ i);
        }
        else
        {
            System.out.print(+ i);
        }
        input.close();
    }
}
