import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int numero1 = Integer.parseInt(br.readLine());
        
        String numero2 = br.readLine();
        String[] partes = numero2.split(" ");
        int vet[] = new int[numero1];
        
        for(int i = 0; i < numero1; i++) {
            vet[i] = Integer.parseInt(partes[i]);
        }
        
        int menor = vet[0];
        int contador = 1;
        
        for(int i = 1; i<numero1; i++) {
            if(vet[i]<menor) {
                menor = vet[i];
                contador = i+1;
            }
        }
        
        System.out.println(contador);
    }
}

