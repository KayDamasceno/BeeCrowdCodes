import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Set<String> set = new HashSet<String>();
        int n = 0;
        
        while (sc.hasNext()) {
            String entrada = sc.nextLine().trim();
            
            set.add(entrada);
            
        
        }
        System.out.println(set.size());
        sc.close();
    }

}

