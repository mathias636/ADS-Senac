package lista;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        double horas, valor_por_hora, salario;
        int cadastro;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o cadastro: ");
        cadastro = entrada.nextInt();
        System.out.print("Insira as horas trabalhadas: ");
        horas = entrada.nextDouble();
        System.out.print("Insira o valor por hora: ");
        valor_por_hora = entrada.nextDouble();
        salario = (horas*valor_por_hora);
        System.out.println("Cadastro: " + cadastro);
        System.out.print("O salário mensal é: " + salario);
        entrada.close();
    }
}
