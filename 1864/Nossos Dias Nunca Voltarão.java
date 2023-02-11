import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String texto = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int numero = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<numero; i++) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
    }
}

