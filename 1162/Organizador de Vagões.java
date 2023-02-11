import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            int L = Integer.parseInt(sc.nextLine());
            String[] input = sc.nextLine().split(" ");
            int[] vet = new int[L];
            for (int i = 0; i < L; i++) {
                vet[i] = Integer.parseInt(input[i]);
            }
            int aux = 0;
            int contador = 0;
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < L-1; j++) {
                    if (vet[j] > vet[j + 1]) {
                        aux = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = aux;
                        contador++;
                    }
                }
            }
            System.out.printf("Optimal train swapping takes %d swaps.\n", contador);

        }
        sc.close();
    }
}

