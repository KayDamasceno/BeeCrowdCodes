import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int casos = Integer.parseInt(br.readLine());
        int j = 1;
        String texto, Sheldon, Raj;
        String[] partes;
        while(casos-->0) {
            texto = br.readLine();
            partes = texto.split(" ");
            Sheldon = partes[0];
            Raj = partes[1];
            
            if(Sheldon.equals("tesoura")) {
                if(Raj.equals("papel")||Raj.equals("lagarto"))
                    out.println("Caso #"+j+": Bazinga!");
                else if(Raj.equals("tesoura"))
                    out.println("Caso #"+j+": De novo!");
                else
                    out.println("Caso #"+j+": Raj trapaceou!");
                    
            }
            else if(Sheldon.equals("papel")) {
                if(Raj.equals("pedra")||Raj.equals("Spock"))
                    out.println("Caso #"+j+": Bazinga!");
                else if(Raj.equals("papel"))
                    out.println("Caso #"+j+": De novo!");
                else
                    out.println("Caso #"+j+": Raj trapaceou!");
            }
            else if(Sheldon.equals("pedra")) {
                if(Raj.equals("lagarto")||Raj.equals("tesoura"))
                    out.println("Caso #"+j+": Bazinga!");
                else if(Raj.equals("pedra"))
                    out.println("Caso #"+j+": De novo!");
                else
                    out.println("Caso #"+j+": Raj trapaceou!");
            }
            else if(Sheldon.equals("lagarto")) {
                if(Raj.equals("Spock")||Raj.equals("papel"))
                    out.println("Caso #"+j+": Bazinga!");
                else if(Raj.equals("lagarto"))
                    out.println("Caso #"+j+": De novo!");
                else
                    out.println("Caso #"+j+": Raj trapaceou!");
            }
            else if(Sheldon.equals("Spock")) {
                if(Raj.equals("tesoura")||Raj.equals("pedra"))
                    out.println("Caso #"+j+": Bazinga!");
                else if(Raj.equals("Spock"))
                    out.println("Caso #"+j+": De novo!");
                else
                    out.println("Caso #"+j+": Raj trapaceou!");
            }
            
            j++;
        }
        out.close();
    }

}

