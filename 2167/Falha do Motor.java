import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String entradas = br.readLine();
        int vetor[] = new int[N];
        String[] partes = entradas.split(" ");
        
        for (int i = 0; i<N; i++)
            vetor[i] = Integer.parseInt(partes[i]);
        int k = 0;
        for(int i =0; i<N-1; i++) {
            if(vetor[i+1]<vetor[i]) {
                System.out.println(i+2);
                k++;
                break;
            }
        }
        if(k==0) {
            System.out.println("0");
        }
    }
    
    

}

