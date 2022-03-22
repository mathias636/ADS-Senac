package ado5;
import java.util.*;
public class ado5_ex01_copy {
    public static void main(String args[]) {
        int choice = 0;
        int stage = 0;
        Scanner input = new Scanner(System.in);
        do
        {
            menu(choice, stage, input);
        } while (choice < 1 || choice > 4 && stage == 0);
        input.close();
    }

    private static void menu(int choice, int stage, Scanner input) {
        choice = 1;
        stage = 0;
        System.out.print("VOCÊ ESTÁ NO: MENU\n1 - Instruções\n2 - Jogar!\n3 - Créditos \n4 - SAIR\n DIGITE SUA OPÇÃO --> ");
        choice = input.nextInt();
        if(choice == 1){
            System.out.println("\nVOCÊ ESCOLHEU:\nINSTRUÇÕES");
        }if(choice == 2){
            System.out.println("\nVOCÊ ESCOLHEU:\nJOGAR");
        }if(choice == 3){
            System.out.println("\nVOCÊ ESCOLHEU:\nCRÉDITOS");
        }if(choice == 4){
            System.exit(0);
        }else{
            System.out.println("\nOpção inválida ou inexistente\n");
        }
    }
}