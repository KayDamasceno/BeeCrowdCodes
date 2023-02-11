import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> fibo = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        fibonacci(n);
        
        Collections.sort(fibo, Collections.reverseOrder());
        
        
        for(int i = 0; i < n-1; i++) 
            System.out.print(fibo.get(i)+" ");
        
        System.out.println(fibo.get(n-1));
        sc.close();
    }

    public static void fibonacci(int n) {
        int[] f = new int[n+2];
        int i = 0;
        
        f[0] = 0;
        f[1] = 1;
        fibo.add(1);
        fibo.add(1);
        
        for(i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
            fibo.add(f[i]);
        }
        
    }
}

