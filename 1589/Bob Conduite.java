import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int casos = Integer.parseInt(br.readLine());
        String numeros;
        String[] partes;
        int R1, R2;
        
        while(casos-->0) {
            numeros = br.readLine();
            partes = numeros.split(" ");
            
            R1 = Integer.parseInt(partes[0]);
            R2 = Integer.parseInt(partes[1]);
            
            out.println(R1+R2);
        }
        
        
        out.close();
    }
}

