import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int casos = Integer.parseInt(br.readLine());
        int contador = 0;
        while(casos-->0) {
            int N = Integer.parseInt(br.readLine());
            if(N!=1)
                contador++;
        }
        out.println(contador);
        out.close();
        
        
    }
}

