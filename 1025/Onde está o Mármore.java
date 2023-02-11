import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int Q = Integer.parseInt(input[1]);
        int casos = 1;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (N != 0 || Q != 0) {

            for (int i = 0; i < N; i++) {
                int e = Integer.parseInt(sc.nextLine());
                array.add(e);
            }
            Collections.sort(array);
            out.printf("CASE# %d:\n", casos);
            for (int i = 0; i < Q; i++) {
                int num = Integer.parseInt(sc.nextLine());
                    
                if (array.contains(num)) {
                    
                    out.printf("%d found at %d\n", num, (array.indexOf(num) + 1));
                } else {
                    
                    out.printf("%d not found\n", num);
                }
            }
            out.flush();
            array.clear();
            casos++;
            input = sc.nextLine().split(" ");
            N = Integer.parseInt(input[0]);
            Q = Integer.parseInt(input[1]);
        }
        
        out.close();
        sc.close();
    }
}

