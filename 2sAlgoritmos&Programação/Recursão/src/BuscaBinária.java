public class BuscaBinária{
    public static void main(String[] args) {
        int x = 0;
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 0;
        int f = v.length-1;
        busca(x, v, i, f);
    }

    private static int busca(int x, int[] v, int i, int f) {
        int m = (i+f)/2;

        if(v[m] == x){
            return m;
        }
        if(x < v[m]){
            f=m-1;
            busca(x, v, i, f);
        }else{
            i=m+1;
            busca(x, v, i, f);
        }
        return-1;
    }
}