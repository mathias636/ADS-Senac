public class Ex03 {
    public static void main(String[] args) {
        System.out.println(
            fun(35)
        );
    }

    //Implemente uma função recursiva que receba como parâmetro um número natural e apresente o seu correspondente binário.
    public static String fun(int n){
        if(n == 1)
            return "1";
        else {
            if(n % 2 == 0)
                return fun(n/2) + "0";
            else
                return fun(n/2) + "1";
        }
    }

}
