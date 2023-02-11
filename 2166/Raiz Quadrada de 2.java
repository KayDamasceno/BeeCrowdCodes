import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        double temp = 2;
        double valor = 1;
        for(int i = 1; i<N;i++) {
            temp = 2 + 1.0/temp;
        }
        
        if(N == 0)
            System.out.printf("%.10f\n", valor);
        else
            System.out.printf("%.10f\n", 1 + (1/temp));

    }
    
    

}

