package SlidesExemplos.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SeparandoUmaLinhaLida {
    public static void main(String[] args) throws IOException {
        FileReader arquivo = new FileReader("./Arquivos/File/src/index.txt");
        BufferedReader leBufferizado = new BufferedReader(arquivo);
        String linha = leBufferizado.readLine();
        String[] subStrings = linha.split(" ");

        for(int i = 0; i < subStrings.length; i++){
            System.out.println(subStrings[i]);
        }

        leBufferizado.close();
    }
}
