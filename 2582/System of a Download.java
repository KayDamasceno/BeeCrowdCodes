import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.nextLine().trim());
        while (N-->0) {
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");
            int x = Integer.parseInt(partes[0]);
            int y = Integer.parseInt(partes[1]);
            
            if(x+y == 0)
                System.out.println("PROXYCITY");
            else if(x+y == 1)
                System.out.println("P.Y.N.G.");
            else if(x+y == 2)
                System.out.println("DNSUEY!");
            else if(x+y == 3)
                System.out.println("SERVERS");
            else if(x+y == 4)
                System.out.println("HOST!");
            else if(x+y == 5)
                System.out.println("CRIPTONIZE");
            else if(x+y == 6)
                System.out.println("OFFLINE DAY");
            else if(x+y == 7)
                System.out.println("SALT");
            else if(x+y == 8)
                System.out.println("ANSWER!");
            else if(x+y == 9)
                System.out.println("RAR?");
            else if(x+y == 10)
                System.out.println("WIFI ANTENNAS");
                        
        }
        

        sc.close();
    }

}

