import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        int min = Integer.parseInt(sc.nextLine().trim());
        Integer[] vetor = new Integer[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = Integer.parseInt(sc.nextLine().trim());
        }
        Arrays.sort(vetor, Collections.reverseOrder());
        int contador = 0;
        for (int i = min; i < n; i++) {
            //System.out.println(vetor[i] + " " + vetor[min - 1]);

            if (vetor[i].equals(vetor[min-1])) {
                contador++;
            }
        }
        System.out.println(min + contador);

        sc.close();
    }

}

