package lista;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        double a, b, c;
        double x1;
        double x2;
        double delta;
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nIsira a: ");
        a = input.nextDouble(); 
        System.out.print("Isira b: ");
        b = input.nextDouble();
        System.out.print("Isira c: ");
        c = input.nextDouble();
        delta = (b*b)-4*a*c;
        if (a == 0 || delta < 0){
            System.out.print("Impossível de calcular");
        }else{
            delta = Math.sqrt(delta);
            x1 = (-b + delta)/(2*a);
            x2 = (-b - delta)/(2*a);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
        input.close();
    }
}
