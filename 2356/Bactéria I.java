import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        
        
        while(sc.hasNextLine()) {
            String entrada = sc.nextLine().trim();
            String linha2 = sc.nextLine().trim();
            
            if(entrada.contains(linha2))
                System.out.println("Resistente");
            else
                System.out.println("Nao resistente");
        }
        sc.close();
    }

}

