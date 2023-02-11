import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String, Double> map = new HashMap<String, Double>();
        Scanner sc = new Scanner(System.in);

        map.put("W", 1.0);
        map.put("H", 1.0 / 2);
        map.put("Q", 1.0 / 4);
        map.put("E", 1.0 / 8);
        map.put("S", 1.0 / 16);
        map.put("T", 1.0 / 32);
        map.put("X", 1.0 / 64);
        
        String entrada = sc.nextLine();
        while (!entrada.equals("*")) {
            
            double soma = 0;
            int contador = 0;
            for (int i = 1; i < entrada.length(); i++) {
                if (entrada.charAt(i) == '/') {
                    if (soma == 1.0) {
                        contador++;
                    }
                    soma = 0;
                } else {
                    //System.out.println(entrada.charAt(i));
                    soma = soma + map.get(Character.toString(entrada.charAt(i)));
                }
            }

            System.out.println(contador);
            entrada = sc.nextLine();
        }
    }
}

