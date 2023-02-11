import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int numero = Integer.parseInt(br.readLine());

        while (numero-- > 0) {
            String palavra = br.readLine();
            String[] numeros = palavra.split(" ");

            if (Integer.parseInt(numeros[2]) == 1) {
            
                if (Integer.parseInt(numeros[0]) < 10)
                    numeros[0] = "0"+numeros[0];
                if (Integer.parseInt(numeros[1]) < 10)
                    numeros[1] = "0"+numeros[1];
                
                out.println(numeros[0] + ":" + numeros[1] + " - A porta abriu!");
                
            } else {
                if (Integer.parseInt(numeros[0]) < 10)
                    numeros[0] = "0"+numeros[0];
                if (Integer.parseInt(numeros[1]) < 10)
                    numeros[1] = "0"+numeros[1];
                
                out.println(numeros[0] + ":" + numeros[1] + " - A porta fechou!");
            }
        }

        out.close();
    }

}

