package lista;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        int start, end;
        int time_length;
        Scanner input = new Scanner(System.in);
        System.out.println("\nCalcular duração no formato 24 horas");
        System.out.print("Insira o horário inicial: ");
        start = input.nextInt();
        System.out.print("Insira o horário final: ");
        end = input.nextInt();
        if (start < end) {
            time_length = end - start;}
        else if (start > end) {
            time_length = (24 - start) + end;
        }else{
            time_length = 24;
        }
        System.out.print("A duração foi de "+time_length+"h");
        input.close();
    }
}
