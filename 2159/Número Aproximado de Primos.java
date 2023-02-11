import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int numero = Integer.parseInt(br.readLine());

        double valor1 = (numero/Math.log(numero));
        double valor2 = 1.25506*(numero/Math.log(numero));
        
        System.out.printf("%.1f %.1f\n", valor1, valor2);
    }

}

