
package ado5;
import java.util.*;
public class ado5_ex01 {
    public static void main(String args[]) {
        int choice = 0;
        int stage = 0;
        Scanner input = new Scanner(System.in);
        do
        {
            choice = 1;
            stage = 0;
            System.out.println("VOCÊ ESTÁ NO: MENU\n");
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar! ");
            System.out.println("3 - Créditos ");
            System.out.println("4 - SAIR ");
            System.out.print("DIGITE SUA OPÇÃO --> ");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    stage = 1;
                    System.out.println("\nVOCÊ ESCOLHEU:\nINSTRUÇÕES");
                    System.out.println("0 - MENU");
                    System.out.println("1 - COMO JOGAR");
                    System.out.print("Digite sua opção --> ");
                    choice = input.nextInt();
                    do
                    {
                        switch (choice)
                        {
                            case 0:
                                break;
                            case 1:
                                stage = 2;
                                System.out.println("JOGANDO ;)");
                                System.out.println("0 - INSTRUÇÕES");
                                System.out.print("Digite sua opção --> ");
                                choice = input.nextInt();
                                if (choice == 0)
                                {
                                    choice = 0;
                                    stage = 0;
                                    choice = 1;
                                }
                                else
                                {
                                    System.out.println("Opção inválida ou inexistente");
                                }
                                break;
                            default:
                                System.out.println("Opção inválida ou inexistente");
                                break;
                        }

                    } while (stage == 1 && choice > 0);
                    break;
                case 2:
                    stage = 1;
                    System.out.println("\nVOCÊ ESCOLHEU:\nJOGAR");
                    break;
                case 3:
                    stage = 1;
                    System.out.println("\nVOCÊ ESCOLHEU:\nCRÉDITOS");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nOpção inválida ou inexistente\n");
                    break;
            }
            if (stage == 1)
            {
                do
                {
                    if (choice == 0 && stage == 1)
                    {
                        stage = 0;
                        choice = 0;
                    }
                } while (stage == 1);
            }
        } while (choice < 1 || choice > 4 && stage == 0);
        input.close();
    }
}
