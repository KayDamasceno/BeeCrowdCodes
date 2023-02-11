import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String texto;

        while (sc.hasNextLine()) {
            texto = sc.nextLine().trim();
            String[] letras = texto.split("");
            String espaco = "";
            for (int j = 0; j < texto.length(); j++) {
                for (int i = 0; i < (texto.length() - j); i++) {
                    if (j == (texto.length() - 1)) {
                    
                        System.out.println(espaco+" "+letras[i]);
                    } else if (i == 0 && j > 0) {
                        espaco = espaco + " ";
                        System.out.print(espaco + letras[i] + " ");
                    } else if (i == (texto.length() - 1 - j)) {
                        System.out.println(letras[i]);

                    } else
                        System.out.print(letras[i] + " ");
                }

            }
            System.out.println();

        }

        sc.close();
    }

}

