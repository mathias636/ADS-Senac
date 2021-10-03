package ado6;
import java.util.Scanner;
public class ado6_ex01 {
    public static void main(String[] args) {
        int n = 0;
        char choice;
        choice = ' ';
        Scanner scanner;
        scanner = new Scanner(System.in);
        do
        {
            System.out.println("\nConverta: 739(Decimal) para Binário");
            System.out.println("a)1011100011");
            System.out.println("b)1000111");
            System.out.println("c)1011100010");
            System.out.println("d)1011111111");
            System.out.println("e)10000000");
            System.out.println("Tentativas Restantes: "+(3-n));
            System.out.print("DIGITE A ALTERNATIVA: ");
            choice = scanner.next().charAt(0);
            switch (choice)
            {
                case 'a':
                    System.out.println("\nPARABÉNS! RESPOSTA CORRETA NA TENTATIVA: "+n);
                    n = 3;
                    break;
                default:
                    if (choice == 'b' || choice == 'c' || choice == 'd' || choice == 'e' && n < 3) {
                        n++;
                        if (n == 3) {
                            System.out.println("Resposta Incorreta nas 3 tentativas :(");
                            break;
                        }
                        System.out.println("RESPOSTA INCORRETA NA TENTATIVA: "+n);
                        System.out.print("Aperte ENTER para continuar: ");
                        scanner.nextLine();scanner.nextLine();
                    }else{
                        System.out.println("Opção inválida ou inexistente.");
                        System.out.print("Aperte ENTER para mostrar novamente: ");
                        scanner.nextLine();scanner.nextLine();
                    }
                    break;
            }
        } while(n != 3);
        scanner.close();
    }
}
