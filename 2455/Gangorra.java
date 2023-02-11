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
        
        
        String[] vetor = sc.nextLine().split(" ");
        
        int P1 = Integer.parseInt(vetor[0]);
        int C1 = Integer.parseInt(vetor[1]);
        int P2 = Integer.parseInt(vetor[2]);
        int C2 = Integer.parseInt(vetor[3]);
        
        if(P1*C1 == P2*C2)
            System.out.println("0");
        else if(P1*C1 > P2*C2)
            System.out.println("-1");
        else
            System.out.println("1");
    }

}

