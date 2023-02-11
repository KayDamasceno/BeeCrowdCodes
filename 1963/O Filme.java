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
        
        double A = Double.parseDouble(partes[0]);
        double B = Double.parseDouble(partes[1]);
        
        System.out.printf("%.2f%%\n", ((B*100.00)/A)-100);
        out.close();
    }

}

