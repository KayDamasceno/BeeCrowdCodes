import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int J = sc.nextInt();
        int R = sc.nextInt();
        int contador = 0;
        int m = 1;
        while(contador!=R) {
            for(int i = 0; i < J; i++) {
                int num = sc.nextInt();
                //System.out.println(num);
                if(!map.containsKey(m)) {
                    map.put(m, num);
                }else {
                    map.put(m, map.get(m)+num);
                }
                m++;
            }
            m = 1;
            contador++;
        }
        int maior = 0;
        int vencedor = 0;
        for(Integer key: map.keySet()) {
            if(map.get(key) >= maior) {
                maior = map.get(key);
                vencedor = key;
            }
        }
        System.out.println(vencedor);
    
        
        
    }

}

