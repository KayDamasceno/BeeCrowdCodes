import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String numero = br.readLine();
        String[] partes = numero.split(" ");

        int A = Integer.parseInt(partes[0]);
        int B = 0, C = 0;
        if (A != 0) {
            B = Integer.parseInt(partes[1]);
            C = Integer.parseInt(partes[2]);
        }
        while (A != 0) {
            double porcentagem =  (100.00)/C;
            //System.out.println(porcentagem);
            
            int area = (int)(A * B * porcentagem);
            //System.out.println(area);
            int resultado = ((int) Math.sqrt(area));

            out.println(resultado);

            numero = br.readLine();
            partes = numero.split(" ");

            A = Integer.parseInt(partes[0]);
            if (A != 0) {
                B = Integer.parseInt(partes[1]);
                C = Integer.parseInt(partes[2]);
            }
        }
        out.close();

    }

}

