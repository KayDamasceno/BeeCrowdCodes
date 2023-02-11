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
        String input;
        Map<String, String> map = new HashMap<String, String>();
        map.put(".", "a");
        map.put("..","b");
        map.put("...", "c");
        map.put(". .", "d");
        map.put(".. ..", "e");
        map.put("... ...", "f");
        map.put(". . .", "g");
        map.put(".. .. ..", "h");
        map.put("... ... ...", "i");
        map.put(". . . .", "j");
        map.put(".. .. .. ..", "k");
        map.put("... ... ... ...", "l");
        map.put(". . . . .", "m");
        map.put(".. .. .. .. ..", "n");
        map.put("... ... ... ... ...", "o");
        map.put(". . . . . .", "p");
        map.put(".. .. .. .. .. ..", "q");
        map.put("... ... ... ... ... ...", "r");
        map.put(". . . . . . .", "s");
        map.put(".. .. .. .. .. .. ..", "t");
        map.put("... ... ... ... ... ... ...", "u");
        map.put(". . . . . . . .", "v");
        map.put(".. .. .. .. .. .. .. ..", "w");
        map.put("... ... ... ... ... ... ... ...", "x");
        map.put(". . . . . . . . .", "y");
        map.put(".. .. .. .. .. .. .. .. ..", "z");
        
        while((input = br.readLine())!=null) {
            int N = Integer.parseInt(input);
            for(int i = 0; i < N; i++) {
                String input2 = br.readLine();
                out.println(map.get(input2));
            }
            
            out.flush();
        }
        out.close();
        
        
        
    }
}

