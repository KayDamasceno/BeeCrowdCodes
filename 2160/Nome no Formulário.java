import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String texto = br.readLine();
        
        if(texto.length()<=80)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }

}

