import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String[] numeros = br.readLine().split(" ");
        int N = Integer.parseInt(numeros[0]);
        int W = Integer.parseInt(numeros[1]);
        
        String[] entrada;
        while(N-->0) {
            entrada = br.readLine().split(" ");
            String nome = "";
            for(int i = 0; i < entrada.length - 2; i++)
                nome = nome + entrada[i] + " ";
            nome = nome + entrada[entrada.length-2];
            int H = Integer.parseInt(entrada[entrada.length-1]);
            //System.out.println(nome + " " + H);
            
            if ( H > W)
                out.println(nome);
        }
        
        out.close();
        
    }
}

