import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<String> num = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String pal = sc.nextLine().trim();
        String pal2 = sc.nextLine().trim();
        num.add(pal);
        num.add(pal2);
        
        Collections.sort(num);
        
        for(String s: num)
            System.out.println(s);
        
        sc.close();
    }

    
}

