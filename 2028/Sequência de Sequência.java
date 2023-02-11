import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String numeroTexto;

        int contador = 1;
        int vetor[] = new int[20101];
        int valor;
        int j;
        while((numeroTexto = br.readLine())!=null&&(numeroTexto.length()!=0)) {
            valor = 1;
            System.out.print("Caso "+contador);
            int numero = Integer.parseInt(numeroTexto);
            
            for(int aux = 0; aux<=numero; aux++) {
                
                for(int i = 1; i<=aux; i++) {
                    
                    
                    vetor[valor] = aux;
                    valor++;
                    
                }
                
                
                
            }
            if(valor==1)
                System.out.println(": "+valor+" numero");
            else
                System.out.println(": "+valor+" numeros");
            
            contador++;
            for(int i =0; i<valor-1; i++)
                System.out.print(vetor[i]+" ");
            System.out.println(vetor[valor-1]);
            System.out.println();
            
        }
        
    }

}

