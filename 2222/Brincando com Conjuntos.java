import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int casos = Integer.parseInt(br.readLine());

        while (casos-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Set<String> vetor[] = new HashSet[N];
            int aux = N;
            int i = 0;
            while (aux-- > 0) {
                String valores = br.readLine();
                String[] partes = valores.split(" ");
                vetor[i] = new HashSet<String>();

                for (int j = 1; j < partes.length; j++)
                    vetor[i].add(partes[j]);

                i++;
            }

            int Q = Integer.parseInt(br.readLine());

            while (Q-- > 0) {
                String entrada = br.readLine();
                String[] partes1 = entrada.split(" ");

                int A = Integer.parseInt(partes1[0]);
                int B = Integer.parseInt(partes1[1]);
                int C = Integer.parseInt(partes1[2]);
                
                if(A==1) {
                    Set<String> intersection = new TreeSet<String>(vetor[B-1]);
                    intersection.retainAll(vetor[C-1]);
                    out.println(intersection.size());
                    //System.out.println(intersection.size());
                }else {
                    Set<String> union = new TreeSet<String>(vetor[B-1]);
                    union.addAll(vetor[C-1]);
                    out.println(union.size());
                    //System.out.println(union.size());
                }

            }

            

        }
        out.close();
    }

}

