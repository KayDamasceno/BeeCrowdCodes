import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
    
        long N = sc.nextLong();
        long L = sc.nextLong();
        
        System.out.println(N*L);
        sc.close();
        
    }   
}

