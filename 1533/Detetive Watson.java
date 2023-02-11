import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        int N = Integer.parseInt(in.nextLine());
        while(N!=0) {
            String[] input = in.nextLine().split(" ");
            
            for(int i = 0; i < input.length; i++) {
                sorted.add(Integer.parseInt(input[i]));
            }
            Collections.sort(sorted, Collections.reverseOrder());
            int num = sorted.get(1);
            //System.out.println(num);
            for(int i = 0; i < input.length; i++) {
                if(input[i].equals(Integer.toString(num)))
                    System.out.println(i+1);
            }
            
            N = Integer.parseInt(in.nextLine());
            sorted.clear();
        }
    }
}

