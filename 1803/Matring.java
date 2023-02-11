import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[][] matrix;

        String[] input = sc.nextLine().split("");
        matrix = new int[4][input.length];
        
        for (int j = 0; j < input.length; j++) {
            matrix[0][j] = Integer.parseInt(input[j]);
        }
        
        for(int i = 1; i <= 3; i++) {
            input = sc.nextLine().split("");
            for (int j = 0; j < input.length; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        String L = "";
        String F = "";
        for(int i = 0; i < 4; i++) {
            L = L+matrix[i][input.length-1];
        }
        for(int i = 0; i < 4; i++) {
            F = F+matrix[i][0];
        }
        
        for(int i = 1; i < input.length-1; i++) {
            String M = "";
            for(int j = 0; j < 4; j++) {
                M = M + matrix[j][i];
                
            }
            
            long sum = Long.valueOf(F)*Long.valueOf(M)+Long.valueOf(L);
            System.out.print(Character.toString((char)(sum%257)));
        }
        System.out.println();
        
        
    }

}
