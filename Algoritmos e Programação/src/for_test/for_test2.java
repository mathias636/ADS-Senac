/*
 Repetindo algo que só iré repetir depois de algo;
 Exemplo: contagem em binário.
 00
 01
 10
 11
 sendo: 'a' o digito mais a esquerda.
*/
package for_test;
public class for_test2 {
    // private static final String ANSI_RESET = "\u001B[0m";
    // private static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        int l = 0;
        do
        {
            ft_loop();
            l++;
        }while(l < 2);
    }
    private static void ft_loop()
    {
        int n = 0;
        int[] algarism = {};
        for (int a = 0; a <= 1; a++) 
        {
            algarism[0] = a;
            for(int b = 0; b <= 1; b++) 
            {
                algarism[1] = b;
                for(int c = 0; c <= 1; c++) 
                {
                    algarism[2] = c;
                    for(int d = 0; d <= 1; d++) 
                    {
                        algarism[3] = d;
                        for(int e = 0; e <= 1; e++) 
                        {
                            algarism[4] = e;
                            for(int f = 0; f <= 1; f++)
                            {
                                algarism[5] = f;
                                for(int g = 0; g <= 1; g++)
                                {
                                    algarism[6] = g;
                                    for(int i = 0; i < algarism.length; i++)
                                    {
                                        System.out.print("|"+algarism[i]+"|");
                                    }
                                    System.out.println("\n");
                                    System.out.println(" = "+n);
                                    n++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


