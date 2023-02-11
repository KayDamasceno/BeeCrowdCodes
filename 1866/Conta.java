import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int casos = Integer.parseInt(br.readLine());
        int soma = 0;
        
        while(casos-->0) {
            int numero = Integer.parseInt(br.readLine());
            
            for (int i = 0; i<numero; i++) {
                soma = (int)(soma + Math.pow(-1, i));
            }
            
            out.println(soma);
            soma = 0;
        }
        
        out.close();
    }
}

