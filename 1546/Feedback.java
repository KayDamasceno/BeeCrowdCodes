import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int casos = Integer.parseInt(br.readLine());
        
        while(casos -- > 0) {
            int K = Integer.parseInt(br.readLine());
            
            for(int i = 0; i < K; i++) {
                int temp = Integer.parseInt(br.readLine());
                if(temp == 1)
                    out.println("Rolien");
                else if(temp == 2)
                    out.println("Naej");
                else if(temp == 3)
                    out.println("Elehcim");
                else if(temp == 4)
                    out.println("Odranoel");
            }
            
            out.flush();
        }
        out.close();
    }

    
}

