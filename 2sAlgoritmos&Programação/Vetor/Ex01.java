package Vetor;

public class Ex01 {
    public static void main(String[] args) {
        int[] a = {7, 2, 5, 8, 4};
        int[] b = {4, 2, 9, 5};
        String answer = "";

        answer = interseccao(a, b);

        System.out.println(answer);
    }

    private static String interseccao(int[] a, int[] b) {
        String answer = "";
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]) {
                    answer += a[i]+" ";
                }
            }
        }

        return answer;
    }
}