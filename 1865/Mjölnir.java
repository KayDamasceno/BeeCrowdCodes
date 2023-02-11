import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int casos = Integer.parseInt(br.readLine());
        
        while(casos-->0) {
            String texto = br.readLine();
            String[] partes = texto.split(" ");
            String nome = partes[0];
            int valor = Integer.parseInt(partes[1]);
            
            if(nome.equals("Thor")){
                out.println("Y");
            }else {
                out.println("N");
            }
        }
        
        out.close();
    }
}

