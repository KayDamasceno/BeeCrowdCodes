import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String[] entrada = sc.nextLine().trim().split(" ");
            String numero = entrada[1];
            int soma = 0;
            for (int i = 0; i < numero.length(); i++) {
                soma = soma + Character.getNumericValue(numero.charAt(i));
            }

            if (soma % 3 == 0) {
                System.out.println(soma + " sim");
            } else {
                System.out.println(soma + " nao");
            }
        }
        sc.close();

    }

}

