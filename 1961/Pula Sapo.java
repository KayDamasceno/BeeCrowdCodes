import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String linha = br.readLine();
        String linha2 = br.readLine();
        String[] partes = linha.split(" ");
        String[] partes2 = linha2.split(" ");

        int P = Integer.parseInt(partes[0]);
        int N = Integer.parseInt(partes[1]);

        int vetor[] = new int[N];

        for (int i = 0; i < N; i++) {
            vetor[i] = Integer.parseInt(partes2[i]);
        }

        int j = 0;

        for (int i = 0; i < N; i++) {
            if (i + 1 < N) {
                if(vetor[i+1]>vetor[i]) {
                    if(vetor[i+1]-vetor[i]>P)
                        j++;
                }else if(vetor[i+1]<vetor[i]) {
                    if(Math.abs(vetor[i+1]-vetor[i])>P)
                        j++;
                }
            }
        }
        if (j != 0)
            System.out.println("GAME OVER");
        else
            System.out.println("YOU WIN");

    }

}

