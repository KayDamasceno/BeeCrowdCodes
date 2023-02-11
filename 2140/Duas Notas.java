import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String texto = br.readLine();
        String[] partes = texto.split(" ");
        int N = Integer.parseInt(partes[0]);
        int M = Integer.parseInt(partes[1]);
        int troco = 0;
        int vetor[] = { 2, 5, 10, 20, 50, 100 };
        int aux = 0;
        while (N != 0 || M != 0) {
            troco = M - N;
            for (int i = 0; i < 5; i++) {
                
                if (troco - vetor[i] - 2 == 0)
                    aux++;
                else if (troco - vetor[i] - 5 == 0)
                    aux++;
                else if (troco - vetor[i] - 10 == 0)
                    aux++;
                else if (troco - vetor[i] - 20 == 0)
                    aux++;
                else if (troco - vetor[i] - 50 == 0)
                    aux++;
                else if (troco - vetor[i] - 100 == 0)
                    aux++;
                
            }
            if(aux>0)
                System.out.println("possible");
            else
                System.out.println("impossible");
            
            aux = 0;
            texto = br.readLine();
            partes = texto.split(" ");
            N = Integer.parseInt(partes[0]);
            M = Integer.parseInt(partes[1]);
            troco = 0;
        }

    }

}

