import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int casos = Integer.parseInt(br.readLine());
        double PS = 0, PB = 0, PA = 0, PS1 = 0, PB1 = 0, PA1 = 0;
        while (casos-- > 0) {
            String nome = br.readLine();
            double GD = Double.parseDouble(br.readLine());
            String entrada = br.readLine();
            String[] partes = entrada.split(" ");
            double notas[] = new double[7];
            
            for(int i = 0; i<7; i++)
                notas[i] = Double.parseDouble(partes[i]);
            
            Arrays.sort(notas);
            notas[0] = 0;
            notas[6] = 0;
            
        
            double soma = 0;
            for(int i = 0; i<7; i++)
                soma = soma + notas[i];
            
        //  System.out.println(soma);
            double resultado = (soma)*GD;
            out.printf("%s %.2f\n", nome, resultado);
        }

        
        out.close();
    }

}

