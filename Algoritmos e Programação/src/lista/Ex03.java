package lista;
import java.util.*;;

public class Ex03 {
    public static void main(String args[]) {
        double a;
        double b;
        double square1;
        double square2;
        double SumSquares;
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite o primeiro número: ");
        a = input.nextDouble();
        System.out.print("\nDigite o segundo núemro: ");
        b = input.nextDouble();
        square1 = a*a;
        square2 = b*b;
        SumSquares = square1 + square2;
        System.out.println("A Soma dos Quadrados é: "+SumSquares);
        input.close();
    }
}
