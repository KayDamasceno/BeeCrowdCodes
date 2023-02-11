import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int casos = Integer.parseInt(br.readLine());
        while (casos-->0) {
            entrada = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String saida = "";
            char c;
            int value;
            for (int i = 0; i < entrada.length(); i++) {
                c = entrada.charAt(i);
                value = (int) c;

                if (value - N >= 65) {
                    value = c - N;
                    saida = saida + (char) value;
                } else {
                    int temp = value-64;
                    value = 90-N+temp;
                    saida = saida + (char) value;
                }

            }
            
            System.out.println(saida);
            
        }

    }

}

