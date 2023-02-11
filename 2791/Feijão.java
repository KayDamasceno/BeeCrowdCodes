import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<String> num = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().trim().split(" ");
        
        for(int i = 0; i<4; i++) {
            if(Integer.parseInt(entrada[i])==1)
                System.out.println(i+1);
        }
        sc.close();

        
    }
}

