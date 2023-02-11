import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String entrada = br.readLine();
        String[] partes = entrada.split(" ");
        int H = Integer.parseInt(partes[0]);
        int P = Integer.parseInt(partes[1]);
        
        System.out.printf("%.2f\n", (H*1.0)/P);

    }

}

