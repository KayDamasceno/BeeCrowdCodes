import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        
        String[] buff = br.readLine().split(" ");
        int a = Integer.parseInt(buff[0]);
        int b = Integer.parseInt(buff[1]);
        
        if(b>a) {
            if(b>=3 && b<=96)
                System.out.println("crescente");
            if(b>=0 && b<=2)
                System.out.println("nova");
            if(b>=97 && b<=100)
                System.out.println("cheia");
        } else if (a>=b) {
            if(b>=3 && b<=96)
                System.out.println("minguante");
            if(b>=0 && b<=2)
                System.out.println("nova");
            if(b>=97 && b<=100)
                System.out.println("cheia");    
        }
        
        
    }
}

