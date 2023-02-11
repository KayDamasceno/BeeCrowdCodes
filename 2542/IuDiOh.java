import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = Integer.parseInt(sc.nextLine().trim()); // Numero de atributos das cartas
            String entrada1 = sc.nextLine().trim();
            String[] partes1 = entrada1.split(" ");
            int M = Integer.parseInt(partes1[0]); // Numero de cartas de Marcos
            int L = Integer.parseInt(partes1[1]); // Numero de cartas de Leonardo
            int[][] marcos = new int[M][N];
            int[][] leo = new int[L][N];
            // Lendo cartas de marcos
            for (int i = 0; i < M; i++) {
                entrada1 = sc.nextLine().trim();
                partes1 = entrada1.split(" ");
                for (int j = 0; j < N; j++)
                    marcos[i][j] = Integer.parseInt(partes1[j]);
            }
            // Lendo cartas de leo
            for (int i = 0; i < L; i++) {
                entrada1 = sc.nextLine().trim();
                partes1 = entrada1.split(" ");
                for (int j = 0; j < N; j++)
                    leo[i][j] = Integer.parseInt(partes1[j]);
            }
            
            entrada1 = sc.nextLine().trim();
            partes1 = entrada1.split(" ");
            int Cm = Integer.parseInt(partes1[0]); //Carta escolhida por marcos
            int Cl = Integer.parseInt(partes1[1]); //Carta escolhida por leo
            
            int A = Integer.parseInt(sc.nextLine().trim());
            
            if(marcos[Cm-1][A-1] > leo[Cl-1][A-1]) {
                System.out.println("Marcos");
            }else if(marcos[Cm-1][A-1] < leo[Cl-1][A-1]) {
                System.out.println("Leonardo");
            }else {
                System.out.println("Empate");
            }
        }

        sc.close();
    }

}

