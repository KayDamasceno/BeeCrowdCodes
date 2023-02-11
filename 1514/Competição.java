import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        while (n != 0 || m != 0) {
            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            //Everyone solved at least one problem
            //if contador == n, +1
            int contador = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(matrix[i][j] == 1) {
                        contador++;
                        break;
                    }
                }
            }
            
            //There is no problem solved by everyone
            // if contador1 == m, +1
            int contador1 = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(matrix[j][i] == 0) {
                        contador1++;
                        break;
                    }
                }
            }
            
            //Every problem was solved by at least one person 
            // if contador2 == m, +1
            int contador2 = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(matrix[j][i] == 1) {
                        contador2++;
                        break;
                    }
                }
            }
            
            //Nobody solved all the problems.
            // if contador3 != n, +1
            int contador3 = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(matrix[i][j] == 0) {
                        contador3++;
                        break;
                    }
                }
            }
            int soma = 0;
            //System.out.println(contador+" "+contador1 +" " + contador2+" "+contador3);
            if(contador == n)
                soma++;
            if(contador1 == m)
                soma++;
            if(contador2 == m)
                soma++;
            if(contador3 == n)
                soma++;
            
            System.out.println(soma);
             n = sc.nextInt();
             m = sc.nextInt();
            
            
            
        }

    }
}

