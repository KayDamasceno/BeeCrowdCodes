import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int numero = Integer.parseInt(br.readLine());
        String texto = br.readLine();
        String[] partes = texto.split(" ");
        int soma = 0;
        
        for (int i = 0; i<partes.length; i++) {
            if(Integer.parseInt(partes[i]) == numero) {
                soma++;
            }
        }
        
        System.out.println(soma);
    }

}

