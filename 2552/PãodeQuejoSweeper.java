import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");
            int N = Integer.parseInt(partes[0]);
            int M = Integer.parseInt(partes[1]);
            int[][] matrix = new int[N][M];
            int[][] saida = new int[N][M];
            int contador = 0;
            
            for(int i = 0; i < N; i++) {
                entrada = sc.nextLine().trim();
                partes = entrada.split(" ");
                for(int j = 0; j < M; j++) {
                    matrix[i][j] = Integer.parseInt(partes[j]);
                }
            }
            
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(matrix[i][j] == 0) {
                        //System.out.println("Entrei");
                        if(i-1>=0) {
                            contador = contador + matrix[i-1][j];
                        }
                        if(i+1<N) {
                            contador = contador + matrix[i+1][j];
                        }
                        if(j-1>=0) {
                            contador = contador + matrix[i][j-1];
                        }
                        if(j+1<M) {
                            contador = contador + matrix[i][j+1];
                        }
                        
                        saida[i][j] = contador;
                        contador = 0;
                    }else if(matrix[i][j] == 1)
                        saida[i][j] = 9;
                    else
                        saida[i][j] = matrix[i][j];
                }
            }
            
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    System.out.print(saida[i][j]);
                }
                System.out.println();
            }
            

        }

        sc.close();
    }

}

