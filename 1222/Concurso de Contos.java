import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
     public static void main(String[] args) throws IOException {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
      
            String numeros;
            
            
            
            while((numeros = br.readLine())!=null && numeros.length()!=0){
            
            String[] parts = numeros.split(" ");
            int N, L, C;
                
            N = Integer.parseInt(parts[0]);
            L = Integer.parseInt(parts[1]);
            C = Integer.parseInt(parts[2]);
            int j = 0;
            int contador = C;
            int resultado = 1;
            
            
            String conto = br.readLine();
            String[] partConto = conto.split(" ");
            
            String montagem = partConto[0];
            
            for(int i = 1; i<N; i++) {
                
                if((montagem.length() + partConto[i].length())<C) {
                    montagem = montagem+" "+partConto[i];
                }else {
                    montagem = partConto[i];
                    resultado++;
                }
                
            }
            
            System.out.println((int)Math.ceil(((float)resultado)/L));
            
            }
            
     }

}

