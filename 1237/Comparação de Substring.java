import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static int getLongestCommonSubstring(String a, String b){
        int m = a.length();
        int n = b.length();
     
        int max = 0;
     
        int[][] dp = new int[m][n];
     
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(a.charAt(i) == b.charAt(j)){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j] = dp[i-1][j-1]+1;
                    }
     
                    if(max < dp[i][j])
                        max = dp[i][j];
                }
     
            }
        }
     
        return max;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
    
        while(sc.hasNext()) {
            String input1 = sc.nextLine();
            String input2 = sc.nextLine();
            
            System.out.println(getLongestCommonSubstring(input1, input2));
        }
    
        sc.close();
        out.close();
    }

    

}

