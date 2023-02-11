import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String numeros;
        int casos = 1;
        int pos = 0;
        int resultado = 0;
        while ((numeros = br.readLine()) != null && numeros.length() != 0) {
            String numeros1 = br.readLine();

            

            for (int i = 0; i <= (numeros1.length() - numeros.length()); i++) {

                if (numeros1.substring(i, i + numeros.length()).equals(numeros)) {
                    pos = i;
                    resultado++;
                }
            }
            if (resultado == 0) {
                System.out.println("Caso #" + casos + ":");
                System.out.println("Nao existe subsequencia");
                System.out.println();
            } else {
                System.out.println("Caso #" + casos + ":");
                System.out.println("Qtd.Subsequencias: " + resultado);
                System.out.println("Pos: " + (pos + 1));
                System.out.println();
            }
            resultado = 0;
            pos = 0;
            casos++;
        }

        out.close();
    }

}

