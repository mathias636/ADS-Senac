package ExerciciosSlides;

public class Ex02 {
    public static void main(String[] args) {
        int v [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        print_vector(v);
        System.out.println("---- invertendo...");
        vector_invert(v);
    }

    
    static void vector_invert(int[] v){
        int aux = 0;

        for(int i = 0; i < v.length / 2; i++){
            aux = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = aux;
            System.out.println("["+i+"] = "+v[i]);

        }

        print_vector(v);
    }

    static void print_vector(int[] v) {
        for(int i = 0; i < v.length; i++){
            System.out.println("["+i+"] = "+v[i]);
        }
    }
}
