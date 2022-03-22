package SlidesExemplos.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConvertendoStringEmNUMERO {
    public static void main(String[] args) throws IOException {
        FileReader arquivo = new FileReader("./Arquivos/File/src/index.txt");
        BufferedReader leBufferizado = new BufferedReader(arquivo);
        String linha = leBufferizado.readLine();
        String[] subStrings = linha.split(" ");

        for(int i = 0; i < subStrings.length; i++){
            System.out.println(subStrings[i]);
        }

        int numero = Integer.parseInt(subStrings[1]);

        numero = numero / 2;
        System.out.println(numero);

        leBufferizado.close();
    }
}
