import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().trim().split(" ");

        int N = Integer.parseInt(entrada[0]);
        int M = Integer.parseInt(entrada[1]);
        
        String[] temp;
        while (N != 0 || M != 0) {
            String[][] original = new String[N][M];
            for (int i = 0; i < N; i++) {
                temp = sc.nextLine().split("");
                for (int j = 0; j < M; j++) {
                    original[i][j] = temp[j];
                }
            }
            String[] entrada2 = sc.nextLine().split(" ");
            int A = Integer.parseInt(entrada2[0]);
            int B = Integer.parseInt(entrada2[1]);
            // System.out.println(M / B);

            for (int i = 0; i < N; i++) {

                for (int k = 0; k < A / N; k++) {

                    for (int j = 0; j < M; j++) {

                        for (int t = 0; t < B / M; t++) {

                            System.out.print(original[i][j]);
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
            entrada = sc.nextLine().trim().split(" ");

            N = Integer.parseInt(entrada[0]);
            M = Integer.parseInt(entrada[1]);
        }

    }
}

