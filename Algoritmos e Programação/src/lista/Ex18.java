package lista;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        double a, b, c, aux;
        boolean check = false;
        Scanner input = new Scanner(System.in);
        System.out.print("digite a: ");
        a = input.nextDouble();
        System.out.print("digite b: ");
        b = input.nextDouble();
        System.out.print("digite c: ");
        c = input.nextDouble();
        do
        {
            if (b < c){
                aux = c;
                c = b;
                b = aux;
            }else if (a < b){
                aux = b;
                b = a;
                a = aux;
            }else{
                check = true; }
        } while (check == false);
        if (a >= b + c) {
            System.out.println("A figura não forma um triângulo");
            check = false; }
        if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)) && (check != false)) {
            System.out.println("triângulo retângulo"); }
        if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2)) && (check != false)) {
            System.out.println("triângulo obtusângulo"); }
        if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2)) && (check != false)) {
            System.out.println("triângulo acutângulo"); }
        if (a == b && b == c) {
            System.out.println("triângulo equilátero"); }
        if ((a != b && b == c) || (b != c && c == a) || (c != a && a == b) && (check != false)) {
            System.out.println("triângulo isóceles"); }
        input.close();
    }
}
