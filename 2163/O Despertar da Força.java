import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String entrada = br.readLine();
        String[] numeros = entrada.split(" ");
        int matriz[][] = new int[Integer.parseInt(numeros[0])][Integer.parseInt(numeros[1])];

        for (int i = 0; i < Integer.parseInt(numeros[0]); i++) {
            String texto = br.readLine();
            String[] m = texto.split(" ");
            for (int j = 0; j < Integer.parseInt(numeros[1]); j++) {
                matriz[i][j] = Integer.parseInt(m[j]);
            }
        }

    

        int k = 0;
        int f = 0;
        int g = 0;
        for (int i = 1; i < Integer.parseInt(numeros[0])-1; i++) {
            for (int j = 1; j < Integer.parseInt(numeros[1])-1; j++) {
                if (matriz[i][j] == 42) {
                    
                    if (i - 1 >= 0 && i + 1 >= 0 && j - 1 >= 0 && j + 1 >= 0) {
                        
                        if (matriz[i - 1][j - 1] == 7 && matriz[i - 1][j] == 7 && matriz[i - 1][j + 1] == 7
                                && matriz[i][j - 1] == 7 && matriz[i][j + 1] == 7 && matriz[i + 1][j - 1] == 7
                                && matriz[i + 1][j] == 7 && matriz[i + 1][j + 1] == 7) {
                            f = i+1;
                            g = j+1;
                            k++;
                        }
                    }

                }
            }
        }

        if (k == 0) {
            System.out.println("0 0");
        } else
            System.out.println(f + " " + (g));

        
    }

}

