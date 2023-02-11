import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);

        String[] buff = br.readLine().split(" ");
        int N = Integer.parseInt(buff[0]);
        int M = Integer.parseInt(buff[1]);

        int contador = 0;
    
        for (int i = 0; i < N; i++) {
            int aux = 0;
            buff = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                int e = Integer.parseInt(buff[j]);
                if (e != 0)
                    aux++;
            }
            if(aux == M)
                contador++;
        }
        
        System.out.println(contador);
    }

}

