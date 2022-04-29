public class Exemplo {
    public static void main(String[] args) {
        System.out.println(
            fatorial(1)
        );
        System.out.println(
            fibonacci(1)
        );
        
    }

    // função que calcula o fatorial de um número
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
    // --função recursiva fibonacci
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
