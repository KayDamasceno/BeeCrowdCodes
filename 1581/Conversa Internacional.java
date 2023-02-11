import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.nextLine());
        Set<String> set = new HashSet<String>();
        while(N-->0) {
            int T = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < T; i++) {
                String buff = sc.nextLine();
                set.add(buff);
            }
            
            if(set.size() == 1) {
                String text = set.toString().replaceAll("\\[|\\]", "");
                System.out.println(text);
            }
            else
                System.out.println("ingles");
            
            set.clear();
        }
    
        sc.close();
        out.close();
    }

    

}

