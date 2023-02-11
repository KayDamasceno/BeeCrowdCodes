import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vetor[];
        String number;
        int numero;

        while ((number = br.readLine()) != null && number.length() != 0) {

            numero = Integer.parseInt(number);
            vetor = new int[numero];

            String velocidades = br.readLine();
            
            String[] partesVelocidades = velocidades.split(" ");

            for (int i = 0; i < numero; i++) {
                vetor[i] = Integer.parseInt(partesVelocidades[i]);
            }

            Arrays.sort(vetor);

            if (vetor[numero - 1] < 10)
                System.out.println("1");
            else if (vetor[numero - 1] >= 20)
                System.out.println("3");
            else
                System.out.println("2");
        }
    }

}

