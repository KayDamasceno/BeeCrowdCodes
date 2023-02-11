import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        long C = Long.parseLong(input[0]);
        int N = Integer.parseInt(input[1]);
        
        System.out.println((C%N));
        
        
    }

}

