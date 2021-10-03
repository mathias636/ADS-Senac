package lista;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        double a, b, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira dois números");
        System.out.print("A: ");
        a = input.nextDouble();
        System.out.print("B: ");
        b = input.nextDouble();
        System.out.println("Dividindo o maior pelo menor: ");
        if (a > b) {
            result = a/b;
            System.out.print("A divisão de: "+a+" dividido por "+b+" é: "+result); 
        }else{
            result = b/a;
            System.out.print("A divisão de: "+b+" por "+a+" é: "+result); }
        input.close();
    }
}
