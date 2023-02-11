import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        
        Scanner sc = new Scanner(System.in);
        
        String[] entrada = new String[10];
        
        for(int i = 0; i < 10; i++)
            entrada[i] = sc.nextLine();
        
        System.out.println(entrada[2]);
        System.out.println(entrada[6]);
        System.out.println(entrada[8]);
        sc.close();
    }

}

