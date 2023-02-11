import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int casos = Integer.parseInt(br.readLine());
        double PS = 0, PB = 0, PA = 0, PS1 = 0, PB1 = 0, PA1 = 0;
        while (casos-- > 0) {
            String nome = br.readLine();
            String entrada = br.readLine();
            String[] partes = entrada.split(" ");
            int S = Integer.parseInt(partes[0]);
            int B = Integer.parseInt(partes[1]);
            int A = Integer.parseInt(partes[2]);
            entrada = br.readLine();
            partes = entrada.split(" ");
            int S1 = Integer.parseInt(partes[0]);
            int B1 = Integer.parseInt(partes[1]);
            int A1 = Integer.parseInt(partes[2]);
            
            PS = PS + S;
            PB = PB + B;
            PA = PA + A;
            PS1 = PS1 + S1;
            PB1 = PB1 + B1;
            PA1 = PA1 + A1;
            //System.out.printf("%d %d %d %d %d %d %.2f %.2f %.2f\n", S, B, A, S1, B1, A1, ((S1*1.00)/S)*100, ((B1*1.00)/B)*100, ((A1*1.00)/A)*100);
        }
        System.out.printf("Pontos de Saque: %.2f %%.\n", ((PS1*1.00)/PS)*100);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", ((PB1*1.00)/PB)*100);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", ((PA1*1.00)/PA)*100);

        

    }

}

