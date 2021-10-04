package ado7;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args){
        String questao = "Simplificando a expressão (a3 · b-7 · a2) : (a2 · b-4)2, encontraremos:";
        String letter[] = {"a", "b", "c", "d", "e",};
        String alternativas[] = {"ab", "a/b", "b", "a²b", "ab²"};
        String answer = alternativas[0];
        String choice = "", correct_choice = "";
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> ballot_box = new ArrayList<String>();
        int i;
        for(i = 0; i < alternativas.length; i++) {
            ballot_box.add(alternativas[i]);
        }
        do
        {
            System.out.println("\n"+questao);
            if(choice != "NULL"){
                Collections.shuffle(ballot_box);}
            for(i = 0; i < alternativas.length; i++) {
                System.out.println(letter[i]+") "+ballot_box.get(i));
                if(ballot_box.get(i).equals(answer)) {
                    correct_choice = letter[i]; }
            }
            System.out.print("Digite a resposta: ");
            choice = scanner.nextLine();
            switch(choice)
            {
                case "a":
                case "A":
                case "b":
                case "B":
                case "c":
                case "C":
                case "d":
                case "D":
                case "e":
                case "E":
                    if(choice.equalsIgnoreCase(correct_choice)){
                        System.out.print("Resposta Correta");
                        choice = "ok";
                        break;
                    }else{
                        System.out.print("Resposta incorreta");}
                    scanner.nextLine();
                    break;
                default:
                    System.out.print("Opção inválida ou inexistente");
                    choice = "NULL";
                    scanner.nextLine();
            }
        }while(choice != "ok");
        scanner.close();
    }
}
