import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String texto;

        while ((texto = br.readLine()) != null && texto.length() != 0) {
            String[] partes = texto.split(":");
            int hora = Integer.parseInt(partes[0]);
            if (Integer.parseInt(partes[1]) + 60 >= 60) {
                hora++;

            }

            if (hora == 8) {
                System.out.println("Atraso maximo: " + Integer.parseInt(partes[1]));
            } else if (hora == 9) {
                System.out.println("Atraso maximo: " + (Integer.parseInt(partes[1]) + 60));
            } else if (hora == 10) {
                System.out.println("Atraso maximo: " + (Integer.parseInt(partes[1]) + 120));
            } else {
                System.out.println("Atraso maximo: 0");
            }

        }
    }

}

