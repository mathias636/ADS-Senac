/*
2) Repita o exercício anterior, agora deve ser retornado em uma String os elementos
que estão em A[] mas não estão em B[], ou seja, a DIFERENÇA de A – B.
Exemplos
A[] = {7, 2, 5, 8, 4} e B[] = {4, 2, 9, 5} então A - B = {7, 8}
A[] = {3, 9, 11} e B[] = {2, 6, 1} então A - B = {3, 9, 11}

*/

package ExerciciosSobreVetores;

public class Ex02 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {2, 4, 6, 7, 8, 10};
        String answer = "";

        answer = diferencia(a, b);

        System.out.println(answer);
    }

    private static String diferencia(int[] a, int[] b) {
        String answer = "";
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++){
                if(a[i] != b[j]) {
                    answer += a[i]+" "+b[j];
                }
            }
        }

        return answer;
    }
}
