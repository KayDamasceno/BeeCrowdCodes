import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        int T = Integer.parseInt(sc.nextLine());
        
        while(T-->0) {
            int N = Integer.parseInt(sc.nextLine());
            String[] entrada = sc.nextLine().split(" ");
            
            for(int i = 0; i < N; i++) {
                map.put(Integer.parseInt(entrada[i]), Integer.parseInt(entrada[i]));
            }
            
            System.out.println(map.size());
            map.clear();
        }
    }
}

