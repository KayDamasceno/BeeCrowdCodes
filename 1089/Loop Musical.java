import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static int[][] matrix = new int[8][8];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.nextLine().trim());

        while (N != 0) {
            String[] vetorStatus = new String[N];
            String status = "";
            int picos = 0;
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");

            if (Integer.parseInt(partes[0]) > Integer.parseInt(partes[1]))
                status = "descendo";
            else
                status = "subindo";

            vetorStatus[0] = status;
            int k = 0;
            for (int i = 1; i < N - 1; i++) {
                // System.out.println(status);

                if (status.equals("descendo")) {
                    if (Integer.parseInt(partes[i + 1]) < Integer.parseInt(partes[i])) {
                        vetorStatus[i] = "descendo";
                    } else {
                        vetorStatus[i] = "subindo";
                    }
                } else if (status.equals("subindo")) {
                    if (Integer.parseInt(partes[i + 1]) < Integer.parseInt(partes[i])) {
                        vetorStatus[i] = "descendo";
                    } else {
                        vetorStatus[i] = "subindo";
                    }
                }
            }

            if (status.equals("descendo")) {
                if (Integer.parseInt(partes[0]) < Integer.parseInt(partes[N - 1])) {
                    vetorStatus[N - 1] = "descendo";
                } else {
                    vetorStatus[N - 1] = "subindo";
                }
            } else if (status.equals("subindo")) {
                if (Integer.parseInt(partes[0]) < Integer.parseInt(partes[N - 1])) {
                    vetorStatus[N - 1] = "descendo";
                } else {
                    vetorStatus[N - 1] = "subindo";
                }
            }
            
            for(int i = 0; i<N-1; i++) {
                if(!vetorStatus[i].equals(vetorStatus[i+1]))
                    picos++;
            }
            
            if(!vetorStatus[N-1].equals(vetorStatus[0]))
                picos++;
            
            System.out.println(picos);
            N = Integer.parseInt(sc.nextLine().trim());

        }
        sc.close();
        out.close();
    }

}

