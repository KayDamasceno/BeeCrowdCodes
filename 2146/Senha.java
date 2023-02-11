import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String numeros;
        
        while ((numeros = br.readLine()) != null && numeros.length() != 0) {
            int numero = Integer.parseInt(numeros);
            System.out.println(numero-1);
            
            
        }

        out.close();
    }

}

