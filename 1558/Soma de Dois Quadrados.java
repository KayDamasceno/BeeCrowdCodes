import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
      public static boolean judgeSquareSum(int c) 
        { 
      
            // Iterating loop from 0 to c - a * a. 
            for (long a = 0; a * a <= c; a++) { 
                int b = c - (int)(a * a); 
      
                // If b is a square root of c - a * a 
                // then return true. 
                if (binary_search(0, b, b)) 
                    return true; 
            } 
            return false; 
        } 
      
        // Function for binary search. 
        public static boolean binary_search(long s, long e, int n) 
        { 
      
            // If lower limit exceeds upper limit. 
            if (s > e) 
                return false; 
      
            // Calculating mid. 
            long mid = s + (e - s) / 2; 
            if (mid * mid == n) 
                return true; 
            if (mid * mid > n) 
                return binary_search(s, mid - 1, n); 
            return binary_search(mid + 1, e, n); 
        } 
      

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = Integer.parseInt(sc.nextLine().trim());
            
                if (judgeSquareSum(N))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            
        }

    }
}

