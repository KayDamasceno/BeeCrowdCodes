import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        while (sc.hasNext()) {
            String primeira = sc.nextLine().trim();
            int n = Integer.parseInt(sc.nextLine().trim());
            String segunda = sc.nextLine().trim();
            String[] numeros = segunda.split(" ");
            
            for(int i = 0; i<n; i++)
                System.out.print(primeira.charAt(Integer.parseInt(numeros[i])-1));
            
            System.out.println();
        }
        out.close();
        sc.close();
    }

}

