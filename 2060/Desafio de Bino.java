import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int N = Integer.parseInt(br.readLine());
        String entrada = br.readLine();
        String[] partes = entrada.split(" ");
        int vetor[] = new int[N];
        int resultado[] = new int[N];
        int dois=0, tres=0, quatro=0, cinco=0;
        for(int i = 0; i<N; i++)
            vetor[i] = Integer.parseInt(partes[i]);
        
        for(int i = 0; i<N; i++) {
            
            if(vetor[i]%2==0)
                dois++;
            if(vetor[i]%3==0)
                tres++;
            if(vetor[i]%4==0)
                quatro++;
            if(vetor[i]%5==0)
                cinco++;
        }
        System.out.println(dois+" Multiplo(s) de 2");
        System.out.println(tres+" Multiplo(s) de 3");
        System.out.println(quatro+" Multiplo(s) de 4");
        System.out.println(cinco+" Multiplo(s) de 5");
        
        out.close();
    }

}

