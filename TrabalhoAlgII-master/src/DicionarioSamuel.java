/*
 * Entrega do Trabalho 1- Algoritmos e Programação II
 * Nós,
 * Matheus Galvão
 * Milena Hochheim
 * Vinicius Gomes
 * declaramos que
 * todas as respostas são fruto de nosso próprio trabalho,
 * não copiamos respostas de colegas externos à equipe,
 * não disponibilizamos nossas respostas para colegas externos ao grupo e
 * não realizamos quaisquer outras atividades desonestas para nos beneficiar ou
 * prejudicar outros.
 */

package src;

import java.util.Scanner;
import java.io.File;

public class DicionarioSamuel {
    public static void main(String[] args) throws Exception {
        String nomeArquivo = "dicionario.txt";
        ordenarDicionario(nomeArquivo);

    }

    public static void ordenarDicionario(String nomeArquivo) throws Exception {
        Scanner entrada = new Scanner(new File(nomeArquivo));
        String texto;
        while (entrada.hasNextLine()) {
            texto = entrada.nextLine();
            entrarOrdenado(texto);
        }
    }

    public static void entrarOrdenado (String string){
        String[] dicionario = new String[1000];
        for(int i = dicionario.length; i <= 0; i--){
            for(int j = 0; j < dicionario[i].length(); j++){
                if(string.charAt(j) > dicionario[i].charAt(j)){
                    String aux = dicionario[i];
                    dicionario[i-1] = 
                }
            }
        }

        
    }
}

