import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new TreeMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < N; i++) {
                String[] input = sc.nextLine().split(" ");
                map.put(Integer.parseInt(input[1]), input[0]);
            }
            String text = map.values().toString();
            text = text.replaceAll("\\[", "");
            text = text.replaceAll("\\]", "");
            text = text.replaceAll("\\,", "");
            System.out.println(text);
            map.clear();
        }

    }
}

