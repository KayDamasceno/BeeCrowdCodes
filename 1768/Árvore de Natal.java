import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        while (sc.hasNext()) {
            int N = Integer.parseInt(sc.nextLine());
            int temp = N/2;
            for (int i = 1; i <= N / 2 + 1; i++) {
                
                for (int j = 1; j < temp + 1; j++) {
                    System.out.printf(" ");
                }
                temp--;
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            }

            for (int i = 1; i <= N/2+1; i++) {
                if (i == N / 2 + 1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            for (int i = 1; i <= N/2 +2; i++) {
                if (i >= N / 2  && i <= (N / 2) + 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
            System.out.println();
            System.out.println();

        }

    }

}

