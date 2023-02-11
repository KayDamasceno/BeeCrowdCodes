import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int contador = 0;
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");
            int N = Integer.parseInt(partes[0]);
            int I = Integer.parseInt(partes[1]);
            while(N-->0) {
                entrada = sc.nextLine().trim();
                partes = entrada.split(" ");
                
                if(Integer.parseInt(partes[0])==I && Integer.parseInt(partes[1])==0)
                    contador++;
            }
            
            System.out.println(contador);
        }

        sc.close();
    }

}

