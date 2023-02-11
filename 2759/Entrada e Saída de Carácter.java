import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        String b = sc.nextLine().trim();
        String c = sc.nextLine().trim();

        System.out.printf("A = %s, B = %s, C = %s\n", a, b, c);
        System.out.printf("A = %s, B = %s, C = %s\n", b, c, a);
        System.out.printf("A = %s, B = %s, C = %s\n", c, a, b);

    }

}

