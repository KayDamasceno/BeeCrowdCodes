import java.io.IOException;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int casos = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> array = new ArrayList<Integer>();
        int aux = 1;
        while (casos != 0) {
            double total = 0;
            int div = 0;
            int qt = 0;
            for (int i = 0; i < casos; i++) {
                String[] input = sc.nextLine().split(" ");
                div = Integer.parseInt(input[1]) / Integer.parseInt(input[0]);
                map.put(div, Integer.parseInt(input[0]));
                total = total + Integer.parseInt(input[1]);
                qt = qt + Integer.parseInt(input[0]);
            }
            String text = "";
            for(Integer name: map.keySet()) {
                String key = name.toString();
                String value = map.get(name).toString();
                text = text + value+"-"+key+" ";
            }
            text = text.substring(0,text.length()-1);
            System.out.println("Cidade# "+aux+":");
            System.out.println(text);
            double f =  (total*1.0/qt);
            DecimalFormat df = new DecimalFormat("#0.00");
            df.setRoundingMode(RoundingMode.FLOOR);
        
            System.out.printf("Consumo medio: %s m3.\n", df.format(f));
            aux++;
            map.clear();
            casos = Integer.parseInt(sc.nextLine());
            System.out.println();
        }

    }
}

