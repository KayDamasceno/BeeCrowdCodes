import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String numeros = br.readLine();
        String[] partes = numeros.split(" ");
        
        int N = Integer.parseInt(partes[0]);
        int M = Integer.parseInt(partes[1]);
        
        while(M-->0) {
            String texto = br.readLine();
            
            if(texto.equals("fechou"))
                N++;
            else
                N--;
        }
        System.out.println(N);
        out.close();
    }

}

