import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine().trim());
        while (casos-- > 0) {
            long n = sc.nextLong();
            if(isPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
                

        }
        sc.close();
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }

        if (n <= 3)
            return true;

        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i = i+1;
        }
        
        return true;
    }
}

