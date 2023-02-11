import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        Set<Character> set = new HashSet<Character>();
        while(sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int contador = 0;
            for(int i = N; i <= M; i++) {
                String num = Integer.toString(i);
                for(int j = 0; j <num.length();j++) {
                    set.add(num.charAt(j));
                }
                if(set.size() == num.length())
                    contador++;
                
                set.clear();
            }
            
            System.out.println(contador);
        }
        
    }
}

