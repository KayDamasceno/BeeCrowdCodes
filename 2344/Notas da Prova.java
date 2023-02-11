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
        
        int T = Integer.parseInt(sc.nextLine());
        
        if(T == 0)
            System.out.println("E");
        else if (T>=1 && T<=35)
            System.out.println("D");
        else if(T>=36 && T<=60)
            System.out.println("C");
        else if(T>=61 && T<=85)
            System.out.println("B");
        else
            System.out.println("A");
        
    }

}

