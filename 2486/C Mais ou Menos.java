import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int aux = n;
        
        while(n!=0) {
            int soma = 0;
            aux = n;
            while(aux-->0) {
                String entrada = br.readLine();
                String[] partes = entrada.split(" ");
                //System.out.println(partes[0]);
                if(partes[1].equals("suco"))
                    soma = soma + Integer.parseInt(partes[0])*120;
                else if(partes[1].equals("morango"))
                    soma = soma + Integer.parseInt(partes[0])*85;
                else if(partes[1].equals("mamao"))
                    soma = soma + Integer.parseInt(partes[0])*85;
                else if(partes[1].equals("goiaba"))
                    soma = soma + Integer.parseInt(partes[0])*70;
                else if(partes[1].equals("manga"))
                    soma = soma + Integer.parseInt(partes[0])*56;
                else if(partes[1].equals("laranja"))
                    soma = soma + Integer.parseInt(partes[0])*50;
                else if(partes[1].equals("brocolis"))
                    soma = soma + Integer.parseInt(partes[0])*34;
            //  System.out.println(soma);
            
            }
            //System.out.println(soma);
            
            if(soma < 110)
                out.println("Mais "+ (110-soma)+" mg");
            else if(soma >130)
                out.println("Menos "+ (soma  - 130)+" mg");
            else
                out.println((soma)+" mg");
            
            n = Integer.parseInt(br.readLine());
        }
        out.close();
    }

}

