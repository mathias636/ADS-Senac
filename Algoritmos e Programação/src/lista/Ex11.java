package lista;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        double n;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        n = input.nextDouble();
        if(n < 0) {
            System.out.print("Esse número negativo");
        }else{
            System.out.print("Esse número não é negativo");
        }
        input.close();
    }
}
