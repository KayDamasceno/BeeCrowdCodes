import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new HashMap<String, Double>();
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.nextLine());
        while(N-->0) {
            int M = Integer.parseInt(sc.nextLine());
            for(int i = 0;  i < M; i++) {
                String[] input = sc.nextLine().split(" ");
                map.put(input[0], Double.parseDouble(input[1]));
            }
            int P = Integer.parseInt(sc.nextLine());
            double soma = 0 ;
            for(int i = 0; i < P; i++) {
                String[] input = sc.nextLine().split(" ");
                soma = soma + Integer.parseInt(input[1])*map.get(input[0]);
            }
            
            System.out.printf("R$ %.2f\n", soma);
            map.clear();
        }
    }
}

