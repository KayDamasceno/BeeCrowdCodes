import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            String entrada = sc.nextLine().trim();
            
            if(entrada.equals("esquerda"))
                System.out.println("ingles");
            else if(entrada.equals("direita"))
                System.out.println("frances");
            else if(entrada.equals("nenhuma"))
                System.out.println("portugues");
            else
                System.out.println("caiu");
        }
        
        sc.close();
    }

}

