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
        
        String[] vetor = sc.nextLine().split(" ");
        
        int A = Integer.parseInt(vetor[0]);
        int L = Integer.parseInt(vetor[1]);
        int P = Integer.parseInt(vetor[2]);
        
        if(T <= L && T <= L && T <=A)
            System.out.println("S");
        else
            System.out.println("N");
    }

}

