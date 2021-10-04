package ado7;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args){
        String alternativas[] = {"alternativa1", "alternativa2", "alternativa3", "alternativa4", "alternativa5"};
        String answer = alternativas[0]; //alternativa1
        String letter[] = {"a", "b", "c", "d", "e",};
        String choice = "", correct_choice = "";
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> ballot_box = new ArrayList<String>();
        int i;
        for(i = 0; i < alternativas.length; i++) {
            ballot_box.add(alternativas[i]);
        }
        do
        {
            System.out.println("\nQUESTÃO");
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
