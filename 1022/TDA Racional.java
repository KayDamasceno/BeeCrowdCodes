import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int casos = Integer.parseInt(sc.nextLine());

        while (casos-- > 0) {
            String[] input = sc.nextLine().split(" ");
            int den = 0, num = 0, a = 0, b = 0, a1 = 0, b1 = 0;
            if (input[3].equals("+")) {
                den = Integer.parseInt(input[2]) * Integer.parseInt(input[6]);
                num = (den / Integer.parseInt(input[2]) * Integer.parseInt(input[0]))
                        + (den / Integer.parseInt(input[6]) * Integer.parseInt(input[4]));
                a = num;
                b = den;
                a1 = num;
                b1 = den;

            } else if (input[3].equals("-")) {
                den = Integer.parseInt(input[2]) * Integer.parseInt(input[6]);
                num = (den / Integer.parseInt(input[2]) * Integer.parseInt(input[0]))
                        - (den / Integer.parseInt(input[6]) * Integer.parseInt(input[4]));
                a = num;
                b = den;
                a1 = num;
                b1 = den;
            } else if(input[3].equals("*")) {
                den = Integer.parseInt(input[2]) * Integer.parseInt(input[6]);
                num = Integer.parseInt(input[0]) * Integer.parseInt(input[4]);
                a = num;
                b = den;
                a1 = num;
                b1 = den;
            } else if(input[3].equals("/")) {
                den = Integer.parseInt(input[2]) * Integer.parseInt(input[4]);
                num = Integer.parseInt(input[0]) * Integer.parseInt(input[6]);
                a = num;
                b = den;
                a1 = num;
                b1 = den;
            }
            
            if(num < 0)
                num = num * -1;
            if(den < 0)
                den = den * -1;
            int c = num % den;

            while (c > 0) {
                num = den;
                den = c;
                c = num % den;
            }

            int gcd = den;

            a /= gcd;
            b /= gcd;
            System.out.printf("%d/%d = %d/%d\n", a1, b1, a, b);
        }
    }
}

