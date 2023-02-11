import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> merg = new ArrayList<Integer>();
        ArrayList<Integer> last = new ArrayList<Integer>();
        while (sc.hasNext()) {
            String[] entrada = sc.nextLine().split(" ");
            int N = Integer.parseInt(entrada[0]);
            int R = Integer.parseInt(entrada[1]);
            entrada = sc.nextLine().split(" ");
            if (N == R) {
                System.out.println("*");
            } else {
                for (int i = 0; i < R; i++) {
                    merg.add(Integer.parseInt(entrada[i]));
                }

                for (int i = 1; i <= N; i++) {
                    if (!merg.contains(i)) {
                        last.add(i);
                    }
                }
                
                for(int i = 0; i < last.size(); i++) {
                    System.out.print(last.get(i)+" ");
                }
                System.out.println();
                merg.clear();
                last.clear();
            }
        }
    }
}

