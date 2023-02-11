import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());

        while (T-- > 0) {
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");

            String um = partes[0];
            String dois = partes[1];

            int aux = 0, aux1 = 0;
            int contador = 0;
            for (int i = 0; i < um.length(); i++) {
                aux = (int) um.charAt(i);
                aux1 = (int) dois.charAt(i);

                while (aux != aux1) {
                    contador++;
                    aux = aux + 1;

                    if (aux > 122)
                        aux = 97;

                }
            }

            System.out.println(contador);

        }
        sc.close();
    }

}

