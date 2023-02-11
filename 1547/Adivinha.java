import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine().trim());

        while (casos-- > 0) {
            String[] entrada1 = sc.nextLine().trim().split(" ");
            String[] entrada2 = sc.nextLine().trim().split(" ");
            int[][] vetor = new int[2][entrada2.length];
            int QT = Integer.parseInt(entrada1[0]);
            int n = Integer.parseInt(entrada1[1]);

            for (int i = 0; i < entrada2.length; i++)
                vetor[0][i] = Integer.parseInt(entrada2[i]);

            for (int i = 0; i < entrada2.length; i++)
                vetor[1][i] = Math.abs(n - vetor[0][i]);

            int valor = 0;
            int contador = 0;
            int vencedor = 0;
            while (contador == 0) {
                for (int i = 0; i < entrada2.length; i++) {
                    
                    if (vetor[1][i] == valor) {
                        contador++;
                        vencedor = i;
                        break;
                    }
                }
                valor++;
            }
            
            System.out.println(vencedor+1);

        }
        sc.close();
    }

}

