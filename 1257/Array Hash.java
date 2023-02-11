import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int casos = Integer.parseInt(br.readLine());
        int k = 0;
        for(char i = 'A'; i <= 'Z'; i++) {
            map.put(i, k);
            k++;
        }
        while(casos -- > 0) {
            int K = Integer.parseInt(br.readLine());
            int soma = 0;
            for(int i = 0; i < K; i++) {
                String temp = br.readLine();
                for(int j = 0; j < temp.length(); j++) {
                    soma = soma + i + map.get(temp.charAt(j)) + j;
                }
            }
            
            System.out.println(soma);
        }
        out.close();
    }

    
}

