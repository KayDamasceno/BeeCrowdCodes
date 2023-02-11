import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        
        long result =(long)(Math.pow(n, 4) - 6*Math.pow(n, 3) + 23*Math.pow(n, 2) - 18*n + 24)/24;
        System.out.println(result);
        sc.close();

        
    }
}

