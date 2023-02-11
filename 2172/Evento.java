import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String entrada = br.readLine();
        String[] numeros = entrada.split(" ");
        long X = Long.parseLong(numeros[0]);
        long M = Long.parseLong(numeros[1]);
        
        while(X!=0 || M!=0) {
            System.out.println(M*X);
            
            entrada = br.readLine();
            numeros = entrada.split(" ");
             X = Long.parseLong(numeros[0]);
             M = Long.parseLong(numeros[1]);
        }
        
    }
    
    

}

