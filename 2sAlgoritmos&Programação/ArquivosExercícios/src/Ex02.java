package ArquivosExercícios.src;

import java.io.File;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        String nomeArquivo;
        Scanner scanner = new Scanner(System.in);
        nomeArquivo = scanner.next();
        processarArquivo(nomeArquivo);
        scanner.close();
    }

    public static void processarArquivo(String nomeArquivo) throws Exception{
        Scanner scanner = new Scanner(new File(nomeArquivo));
        String linha;

        while(scanner.hasNextLine()){
            linha = scanner.nextLine();
            if(!linha.startsWith("//")){
                System.out.println(linha);
            }
        }
        System.out.println("fim");
        scanner.close();
    }


}
