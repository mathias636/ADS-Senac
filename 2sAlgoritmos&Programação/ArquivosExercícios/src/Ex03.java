package ArquivosExercícios.src;

import java.io.File;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CARACTER:");
        char c = scanner.next().charAt(0);
        int qtd = 0;
        String linha;
        Scanner leitorArquivo = new Scanner(new File("index.txt"));
        while(leitorArquivo.nextLine() != null){
            linha = leitorArquivo.nextLine();
            qtd += contaCaracter(linha.toLowerCase(), c);
        }


        scanner.close();
    }

    public static int contaCaracter(String s, char caracter) throws Exception{
        int cont = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == caracter){
                cont++;
            }
        }

        return cont;
    }


}
