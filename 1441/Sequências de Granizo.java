import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        String buff;
        
        while(!(buff = br.readLine()).equals("0")) {
            int N = Integer.parseInt(buff);
            array.add(N);
            while(N!=1) {
                if(N%2 == 0) {
                    N = N/2;
                }else {
                    N = 3*N + 1;
                }
                
                array.add(N);
            }
            
            Collections.sort(array, Collections.reverseOrder());
            System.out.println(array.get(0));
            array.clear();
        }
        
    }
}

