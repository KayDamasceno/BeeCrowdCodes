import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String entrada;
        while ((entrada = br.readLine()) != null && entrada.length() != 0) {

            int casos = Integer.parseInt(entrada);
            
            while(casos-->0) {
                int B = Integer.parseInt(br.readLine());
                String Dabriel = br.readLine();
                String[] partes = Dabriel.split(" ");
                int Ad = Integer.parseInt(partes[0]);
                int Dd = Integer.parseInt(partes[1]);
                int Ld = Integer.parseInt(partes[2]);
                
                String Guarte = br.readLine();
                String[] partes1 = Guarte.split(" ");
                int Ag = Integer.parseInt(partes1[0]);
                int Dg = Integer.parseInt(partes1[1]);
                int Lg = Integer.parseInt(partes1[2]);
                
                double VgD = 0;
                double VgG = 0;
                
                if(Ld%2 == 0)
                    VgD = (Ad+Dd)/2 + B;
                else
                    VgD = (Ad+Dd)/2;
                
                if(Lg%2 == 0)
                    VgG = (Ag+Dg)/2 + B;
                else
                    VgG = (Ag+Dg)/2;
                
                
                if(VgD>VgG) {
                    System.out.println("Dabriel");
                }else if(VgG>VgD) {
                    System.out.println("Guarte");
                }else
                    System.out.println("Empate");
            }

            
        }
    }

}

