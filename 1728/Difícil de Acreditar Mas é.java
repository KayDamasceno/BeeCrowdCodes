import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] entrada = sc.nextLine().split("\\+");
            String[] parte2 = entrada[1].split("=");

            StringBuffer sbA = new StringBuffer(entrada[0]);
            StringBuffer sbB = new StringBuffer(parte2[0]);
            StringBuffer sbC = new StringBuffer(parte2[1]);

            sbA.reverse();
            sbB.reverse();
            sbC.reverse();

            int A = Integer.parseInt(sbA.toString());
            int B = Integer.parseInt(sbB.toString());
            int C = Integer.parseInt(sbC.toString());

            if (A + B == C)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

