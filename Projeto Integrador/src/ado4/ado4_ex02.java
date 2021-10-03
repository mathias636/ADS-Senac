package ado4;
import java.util.*;
public class ado4_ex02 {
    public static void main(String args[]) {
        String choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Converta: 739(Decimal) para ? (Binário)");
        System.out.print("\n");
        System.out.print("\na)1011100011");
        System.out.print("\nb)1000111");
        System.out.print("\nc)1011100010");
        System.out.print("\nd)1011111111");
        System.out.print("\ne)10000000");
        System.out.print("\n\nDIGITE A ALTERNATIVA: ");
        choice = input.next();
        switch(choice)
        {
            case "a":
                System.out.print("Parabéns! Resposta Correta");
                break;
            case "b":
                System.out.print("Resposta Incorreta");
                break;
            case "c":
                System.out.print("Resposta Incorreta");
                break;
            case "d":
                System.out.print("Resposta Incorreta");
                break;
            case "e":
                System.out.print("Resposta Incorreta");
                break;
            default:
                System.out.print("Opção Inválida");
        }
        input.close();
    }
}