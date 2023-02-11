import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        String[] entrada = sc.nextLine().trim().split(" ");
        int a = Integer.parseInt(entrada[0]);
        int b = Integer.parseInt(entrada[1]);
        int c = Integer.parseInt(entrada[2]);
        
        while(a!=0 || b!=0 || c!=0) {
            long paral = a*b*c;
            
            long res = (long)Math.cbrt(paral);
            
            System.out.println(res);
            
            entrada = sc.nextLine().trim().split(" ");
             a = Integer.parseInt(entrada[0]);
             b = Integer.parseInt(entrada[1]);
             c = Integer.parseInt(entrada[2]);
        }
        
        sc.close();
    }

}

