import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.nextLine());
        while(N-->0) {
            int M = Integer.parseInt(sc.nextLine());
            String[] input = sc.nextLine().split(" ");
            int[] vetor = new int[M];
            
            for(int i = 0; i < M; i++) {
                vetor[i] = Integer.parseInt(input[i]);
            }
            
            int[] aux = vetor.clone();
            
            Arrays.sort(aux);
            int contador = 0;
            for(int i = 0; i < M; i++) {
            //  System.out.println(vetor[i]+ " " + aux[M-i-1]);
                if(vetor[i] == aux [M-i-1])
                    contador++;
            }
            
            System.out.println(contador);
        }
    }
}

