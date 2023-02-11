import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int LA = Integer.parseInt(input[0]);
        int LB = Integer.parseInt(input[1]);
        
        input = br.readLine().split(" ");
        int SA = Integer.parseInt(input[0]);
        int SB = Integer.parseInt(input[1]);
        
        if(N>=LA && N<=LB && N>=SA && N<=SB)
            System.out.println("possivel");
        else
            System.out.println("impossivel");
    }
}

