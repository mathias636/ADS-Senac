// package SlidesExemplos.src;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.Scanner;

// public class ManipulaçãoScanner {
//     public static void main(String[] args) throws IOException {
//         FileReader arquivo = new FileReader("./Arquivos/File/src/index.txt");
//         BufferedReader leitor = new BufferedReader(arquivo);
//         Scanner scanner = new Scanner(arquivo);
//         String linha1 = leitor.readLine();
//         String linha2 = leitor.readLine();
//         leitor.close();

//         int  tam = Integer.parseInt(linha1);

//         int[] vetor = new int[tam];

//         String[] subStrings = linha2.split(" ");


//         for(int i = 0; i < subStrings.length; i++){
//             System.out.println(subStrings[i]);
//         }

//         int numero = Integer.parseInt(subStrings[1]);

//         numero = numero / 2;
//         System.out.println(numero);

//         leitor.close();
//     }
// }
