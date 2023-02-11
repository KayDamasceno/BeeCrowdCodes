import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            for(int i = 0; i < N; i++) {
                int e = sc.nextInt();
                array.add(e);
            }
            Collections.sort(array, Collections.reverseOrder());
            
            int sum = 0;
            
            for(int i = 0; i < M; i++) {
                sum = sum + array.get(i);
            }
            
            System.out.println(sum);
            
            array.clear();
            
        }
        
        sc.close();
    }

}
