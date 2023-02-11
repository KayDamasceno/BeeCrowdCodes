import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");

            long a = Long.parseLong(partes[0]);
            long b = Long.parseLong(partes[1]);

            String binario1 = Long.toBinaryString(a);
            String binario2 = Long.toBinaryString(b);

            String final1 = "";
            String final2 = "";

            for (int i = 0; i < (32 - binario1.length()); i++) {
                final1 = final1 + "0";
            }
            for (int i = 0; i < (32 - binario2.length()); i++) {
                final2 = final2 + "0";
            }
            final1 = final1 + binario1;
            final2 = final2 + binario2;
            String resultado = "";

            for (int i = 0; i < 32; i++) {
                int valor = Character.getNumericValue(final1.charAt(i)) ^ Character.getNumericValue(final2.charAt(i));
                resultado = resultado + Long.toString(valor);
            }

            System.out.println(Long.parseLong(resultado, 2));
        }
        
        sc.close();
    }
}
