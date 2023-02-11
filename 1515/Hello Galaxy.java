import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        while (N != 0) {
            int menor = 3000;
            String planeta = "";
            for (int i = 0; i < N; i++) {
                String[] entrada = sc.nextLine().split(" ");

                if (Integer.parseInt(entrada[1]) - Integer.parseInt(entrada[2]) < menor) {
                    menor = Integer.parseInt(entrada[1]) - Integer.parseInt(entrada[2]);
                    planeta = entrada[0];
                }
            }
            System.out.println(planeta);
            
            N = Integer.parseInt(sc.nextLine());
        }
    }
}

