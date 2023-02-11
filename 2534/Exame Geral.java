import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        while (sc.hasNext()) {
            String primeira = sc.nextLine().trim();
            String[] numeros = primeira.split(" ");
            int N = Integer.parseInt(numeros[0]);
            int Q = Integer.parseInt(numeros[1]);
            int aju = N;
            int ajuda = Q;
            int vetorN[] = new int[N];
            int vetorQ[] = new int[Q];
            
            int aux = 0;
            while(aju-->0) {
                vetorN[aux]= Integer.parseInt(sc.nextLine().trim());
                aux++;
                //System.out.println(aux);
            }
            aux = 0;
            while(ajuda-->0) {
                vetorQ[aux]= Integer.parseInt(sc.nextLine().trim());
                aux++;
                //System.out.println(aux);
            }
            
            Arrays.sort(vetorN);
            
            int[] vetAux = new int[N];

            int contador = 0;
            for(int i=vetorN.length - 1;i >= 0;i--) {
                vetAux[contador]=vetorN[i]; 
                contador++;
            }
            
            for(int i = 0; i < Q ; i++) {
                System.out.println(vetAux[vetorQ[i]-1]);
            }
            
        }
        out.close();
        sc.close();
    }

}

