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
        
        int  A = Integer.parseInt(partes[0]);
        int  B = Integer.parseInt(partes[1]);
        int  C = Integer.parseInt(partes[2]);
        int  D = Integer.parseInt(partes[3]);
        
        out.println(A-1+B-1+C-1+D);
        out.close();
    }
}

