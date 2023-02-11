import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<String> num = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int C = sc.nextInt();

        if (L % 2 != 0 && C % 2 != 0) {
            System.out.println(1);
        } else if (L % 2 == 0 && C % 2 != 0) {
            System.out.println(0);
        } else if (L % 2 != 0 && C % 2 == 0) {
            System.out.println(0);
        } else if (L % 2 == 0 && C % 2 == 0) {
            System.out.println(1);

            sc.close();

        }
    }
}

