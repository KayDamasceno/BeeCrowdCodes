import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int casos = Integer.parseInt(br.readLine());
        int aux = casos;

        while (casos != 0) {
            aux = casos;
            while (aux-- > 0) {
                int pessoas = Integer.parseInt(br.readLine());

                if (pessoas % 2 == 0) {
                    out.println(2 * (pessoas - 2) + 2);
                } else
                    out.println(2 * (pessoas - 1) +1);
            }
            casos = Integer.parseInt(br.readLine());
        }
        
        out.close();

    }
    
    
}

