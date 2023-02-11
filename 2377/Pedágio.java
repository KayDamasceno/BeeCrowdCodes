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
        
        String[] buff = br.readLine().split(" ");
        int L = Integer.parseInt(buff[0]);
        int D = Integer.parseInt(buff[1]);
        buff = br.readLine().split(" ");
        int K = Integer.parseInt(buff[0]);
        int P = Integer.parseInt(buff[1]);
        
        System.out.println(((L/D)*P+K*L));
    }

}

