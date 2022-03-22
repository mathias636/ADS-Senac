package ArquivosExercícios.src;

import java.io.File;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        String nomeArquivo;
        Scanner scanner = new Scanner(System.in);
        nomeArquivo = scanner.next();
        System.out.println(nomeArquivo);
        processarArquivo(nomeArquivo);
        scanner.close();
    }

    public static void processarArquivo(String nomeArquivo) throws Exception{
        Scanner scanner = new Scanner(new File(nomeArquivo));
        String linha;

        while(scanner.hasNextLine()){
            linha = scanner.nextLine();
            System.out.println(linha);
        }
        System.out.println("fim");
        scanner.close();
    }


}
