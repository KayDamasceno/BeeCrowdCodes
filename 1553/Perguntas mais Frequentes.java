import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        String temp;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (!(temp = br.readLine()).equals("0 0")) {
            String[] buff = temp.split(" ");
            int N = Integer.parseInt(buff[0]);
            int K = Integer.parseInt(buff[1]);
            buff = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                int e = Integer.parseInt(buff[i]);
                if (!map.containsKey(e)) {
                    map.put(e, 1);
                } else {
                    map.put(e, map.get(e) + 1);
                }

            }
            int contador = 0;
            for (int i = 1; i <= N; i++) {
                if (map.containsKey(i)) {
                    if (map.get(i) >= K) {
                        contador++;
                    }
                }
            }

            System.out.println(contador);
            map.clear();

        }
    }

}

