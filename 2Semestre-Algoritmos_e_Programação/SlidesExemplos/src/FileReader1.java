package SlidesExemplos.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReader1{
    public static void main(String[] args) throws IOException {
        FileReader arquivo = new FileReader("./Arquivos/File/src/index.txt");
        BufferedReader leBufferizado = new BufferedReader(arquivo);
        String linha = leBufferizado.readLine();
        System.out.println(linha);
        leBufferizado.close();
        System.out.println("\nfim");
    }
}