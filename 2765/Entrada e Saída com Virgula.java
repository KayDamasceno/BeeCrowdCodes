import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        
        Scanner sc = new Scanner(System.in);
        
        String[] entrada = sc.nextLine().split(",");
        
        System.out.println(entrada[0]);
        System.out.println(entrada[1]);
        
        sc.close();
    }

}

