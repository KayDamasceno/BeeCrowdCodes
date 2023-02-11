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
            int Amin = Integer.parseInt(partes[1]);
            int Amax = Integer.parseInt(partes[2]);
            
            while(N-->0) {
                int Ai = Integer.parseInt(sc.nextLine().trim());
                
                if(Ai>=Amin && Ai<=Amax)
                    contador++;
            }
            
            System.out.println(contador);
        }

        sc.close();
    }

}

