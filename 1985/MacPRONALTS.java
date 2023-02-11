import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int numero = Integer.parseInt(br.readLine());

        double soma = 0;
        int aux = numero;

        while (aux-- > 0) {
            String linha = br.readLine();
            String[] partes = linha.split(" ");
                
                    if(partes[0].equals("1001"))
                        soma = soma + Integer.parseInt(partes[1])*1.50;
                    else if(partes[0].equals("1002"))
                        soma = soma + Integer.parseInt(partes[1])*2.50;
                    else if(partes[0].equals("1003"))
                        soma = soma + Integer.parseInt(partes[1])*3.50;
                    else if(partes[0].equals("1004"))
                        soma = soma + Integer.parseInt(partes[1])*4.50;
                    else if(partes[0].equals("1005"))
                        soma = soma + Integer.parseInt(partes[1])*5.50;
                
                            
        }
        System.out.printf("%.2f\n", soma);
    }

}

