import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> food = new HashMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        while (casos-- > 0) {
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                int T = sc.nextInt();
                int P = sc.nextInt();

                if (!food.containsKey(T)) {
                    food.put(T, P);
                } else {
                    if (P >= 10 && P <= 100) {
                        if(food.get(T)>100 || food.get(T)<10)
                            food.put(T, P);
                        else if (food.get(T) <= P) {
                            food.put(T, P);
                        }
                    } else {
                        if (food.get(T) >= 10 && food.get(T) <= 100) {

                        } else {
                            if (food.get(T) <= P) {
                                food.put(T, P);
                            }
                        }
                    }
                }
                
                //System.out.println(food.toString());
            }
            int sum = 0;
            for(Integer key: food.keySet()) {
                sum = sum + food.get(key);
            }
            System.out.println(sum);
            food.clear();
        }

    }

}
