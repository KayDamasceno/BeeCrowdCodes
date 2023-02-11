import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int casos = Integer.parseInt(br.readLine());
        int soma = 0;
        
        while(casos-->0) {
            String texto = br.readLine();
            String[] partes = texto.split(" ");
            String numeros = br.readLine();
            String[] numeropartes = numeros.split(" ");
            
            soma = Integer.parseInt(numeropartes[0])+Integer.parseInt(numeropartes[1]);
            
            if(soma%2 == 0) {
                if(partes[1].equals("PAR"))
                    out.println(partes[0]);
                else if(partes[3].equals("PAR"))
                    out.println(partes[2]);
            }else if(soma%2 != 0) {
                if(partes[1].equals("IMPAR"))
                    out.println(partes[0]);
                else if(partes[3].equals("IMPAR"))
                    out.println(partes[2]);
            }
            
            
            soma = 0;
        }
        
        out.close();
    }
}

