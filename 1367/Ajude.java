import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Map<String, Integer> tests = new HashMap<String, Integer>();
        Map<String, Integer> incorrect = new HashMap<String, Integer>();
        int N = Integer.parseInt(sc.nextLine());
        while(N!=0) {
            for(int i = 0; i < N; i++) {
            String[] buff = sc.nextLine().split(" ");
                if(buff[2].equals("incorrect")) {
                    if(incorrect.containsKey(buff[0]))
                        incorrect.put(buff[0], incorrect.get(buff[0])+20);
                    else
                        incorrect.put(buff[0], 20);
                }else if(buff[2].equals("correct")) {
                    tests.put(buff[0],  Integer.parseInt(buff[1]));
                }
            }
            int soma = 0;
            for(String key: tests.keySet()) {
                soma = soma + tests.get(key);
                if(incorrect.containsKey(key))
                    soma = soma + incorrect.get(key);
            }
            System.out.println(tests.size()+" "+soma);
            tests.clear();
            incorrect.clear();
            N = Integer.parseInt(sc.nextLine());
        }
    }

    

}

