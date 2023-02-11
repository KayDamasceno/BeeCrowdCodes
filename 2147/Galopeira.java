import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int numero = Integer.parseInt(br.readLine());
        
        while (numero-->0) {
            String palavra = br.readLine();
            
            out.printf("%.2f\n",(palavra.length()*1.0)/100);
        }

        out.close();
    }

}

