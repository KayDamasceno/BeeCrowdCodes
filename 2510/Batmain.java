import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(sc.nextLine().trim());
        while(n-->0) {
            String nome = sc.nextLine().trim();
            out.println("Y");
        }
        out.close();
        sc.close();
    }

}

