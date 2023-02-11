import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int contador = 0;
    public static long fibo(int n) {
        contador++;
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        while (casos-- > 0) {
            contador = 0;
            int n = sc.nextInt();
            long f = fibo(n);
            System.out.println("fib("+n+") = "+(contador-1)+" calls = "+f);
        }

    }

}
