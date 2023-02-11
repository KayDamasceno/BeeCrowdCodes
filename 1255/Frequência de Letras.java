import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] entrada;
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        ArrayList<Character> max = new ArrayList<Character>();
        int casos = Integer.parseInt(br.readLine());
        while (casos-- > 0) {
            entrada = br.readLine().split(" ");
            for (int i = 0; i < entrada.length; i++) {
                for (int j = 0; j < entrada[i].length(); j++) {
                    if (Character.isAlphabetic(entrada[i].charAt(j))) {
                        if (map.containsKey(entrada[i].toLowerCase().charAt(j))) {
                            map.put(entrada[i].toLowerCase().charAt(j),
                                    map.get(entrada[i].toLowerCase().charAt(j)) + 1);
                        } else {
                            map.put(entrada[i].toLowerCase().charAt(j), 1);
                        }
                    }
                }
            }
            int maior = 0;
            for (Character key : map.keySet()) {
                int value = map.get(key);
                if(value >maior) {
                    max.clear();
                    max.add(key);
                    maior = value;
                }else if(value == maior) {
                    max.add(key);
                }
            }
            
            for(int i = 0; i < max.size(); i++) {
                System.out.print(max.get(i));
            }
            System.out.println();
            max.clear();
            map.clear();
        }

    }

}

