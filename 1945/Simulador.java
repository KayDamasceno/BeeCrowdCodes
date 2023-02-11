import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String entrada;
        String[] partes;
        Map <String, Integer> map = new LinkedHashMap<String, Integer>();
        String last = "";
        
        while((entrada = br.readLine())!=null) {
            
            partes = entrada.split(" ");
            
            if(partes.length == 3) {
                map.put(partes[0], Integer.parseInt(partes[2]));
            }else {
                int value = map.get(partes[2]) + map.get(partes[4]);
                map.put(partes[0], value);
            }
            
            last = partes[0];
        }
        System.out.println(map.get(last));
    }
}

