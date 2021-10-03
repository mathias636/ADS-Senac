package lista;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        double Salario_Fixo, total_de_vendas, Salario;
        String nome;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        nome = entrada.nextLine();
        System.out.print("Insira o salário fixo: ");
        Salario_Fixo = entrada.nextDouble();
        System.out.print("Insira o total de vendas (em dinheiro): ");
        total_de_vendas = entrada.nextDouble();
        Salario = Salario_Fixo + (total_de_vendas*0.15);
        System.out.println("Nome do vendedor: "+nome);
        System.out.println("O total do salário é: R$" + Salario);
       entrada.close(); 
    }
}
