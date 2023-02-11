import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String numeros = br.readLine();
        String[] partes = numeros.split(" ");
        
        int  A = Integer.parseInt(partes[0]);
        int  B = Integer.parseInt(partes[1]);
        
        if(A!=B) {
            if(A>B) {
                out.println(A);
            }
            else {
                out.println(B);
            }
        }else {
            out.println(A);
        }
        
        
        out.close();
    }
}

