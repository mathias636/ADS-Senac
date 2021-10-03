/*
Implemente uma questão que embaralhe as alternativas toda vez que errar;
*/
package ado7;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Ex01 {
    private static Scanner scanner;

    public static void main(String[] args) {
        ArrayList<Character> ballot_box = new ArrayList<Character>();
        Scanner scanner = new Scanner(System.in);
        char[] alt = {'a', 'b', 'c', 'd', 'e'};
        boolean resposta = false;
        String choice;
        int i;
        for(i = 0; i < alt.length; i++) {ballot_box.add(alt[i]);}
        do
        {
            System.out.println("Questão");
            Collections.shuffle(ballot_box);
            switch (ballot_box.get(i))
            {
                case 'a':
                    System.out.println(alt[0]+")~~~~~~~~~~~~~~~~");
                    resposta = true;
                    break;
                case 'b':
                    System.out.println(alt[1]+")~~~~~~~~~~~~~~~~");
                    resposta = true;
                    break;
                case 'c':
                    System.out.println(alt[2]+")~~~~~~~~~~~~~~~~");
                    resposta = true;
                    break;
                case 'd':
                    System.out.println(alt[3]+")~~~~~~~~~~~~~~~~");
                    resposta = true;
                    break;
                case 'e':
                    System.out.println(alt[4]+")~~~~~~~~~~~~~~~~");
                    resposta = true;
                    break;
                default:
                    System.out.println("Opção inválida ou inexistente");
            }
            i++;
            System.out.print("Digite sua opção -> ");
            choice = scanner.next();
        } while(resposta == false);
        scanner.close();
    }
}
