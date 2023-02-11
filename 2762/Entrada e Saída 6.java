import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        
        Scanner sc = new Scanner(System.in);
        
        String[] entrada = sc.nextLine().split("\\.");
        int a = Integer.valueOf(entrada[0]);
        int b = Integer.valueOf(entrada[1]);
        System.out.println(b+"."+a);
        
        sc.close();
    }

}

