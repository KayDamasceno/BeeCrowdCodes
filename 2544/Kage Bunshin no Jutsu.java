import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        while (sc.hasNext()) {
            long n = Long.parseLong(sc.nextLine().trim());
            
            for(int i =0; i<n; i++) {
                if(Math.pow(2,i)==(n*1.0))
                    System.out.println(i);
            }
            
            
        }
        out.close();
        sc.close();
    }

}

