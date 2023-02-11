import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int numero = Integer.parseInt(br.readLine());
        long parcial = numero-3;
        long  parcial2 = numero*parcial;
        long soma = parcial2/2;
        
        
        out.println(soma);
        out.close();
    }
}

