import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine().trim());
        while (casos-- > 0) {
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");
            
            if(partes[0].endsWith(partes[1]))
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");

                
            
        }
        sc.close();
    }

}

