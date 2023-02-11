import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String entrada = br.readLine();
        String[] partes = entrada.split(" ");
        String texto;
        int contador = 0;
        int vetor[] = new int[N];
        for (int i = 0; i < N; i++)
            vetor[i] = Integer.parseInt(partes[i]);

        if (N == 1) {
            System.out.println("1");
        } else {

            if (vetor[0] > vetor[1])
                texto = "pico";
            else
                texto = "vale";

            for (int i = 0; i < N - 1; i++) {
                if (texto.equals("pico")) {
                    if (vetor[i] > vetor[i + 1]) {
                        contador++;
                        texto = "vale";
                    }

                } else if (texto.equals("vale")) {
                    if (vetor[i] < vetor[i + 1]) {
                        contador++;
                        texto = "pico";

                    }
                }
            }
            
            if(contador==(N-1))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }

}

