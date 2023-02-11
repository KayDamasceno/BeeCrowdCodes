import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new TreeMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        int soma = 0;
        for(int i = 0; i < input.length; i++) {
            soma = soma + Integer.parseInt(input[i]);
        }
        map.put(1, "Dasher");
        map.put(2, "Dancer");
        map.put(3, "Prancer");
        map.put(4, "Vixen");
        map.put(5, "Comet");
        map.put(6, "Cupid");
        map.put(7, "Donner");
        map.put(8, "Blitzen");
        map.put(9, "Rudolph");
        int winner = 0;
        while(soma > 0) {
            winner++;
            if(winner > 9) {
                winner = 1;
            }
            
            soma--;
        }
        System.out.println(map.get(winner));

    }
}

