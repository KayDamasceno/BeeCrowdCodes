import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while (sc.hasNext()) {
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");
            int N = Integer.parseInt(partes[0]);
            int D = Integer.parseInt(partes[1]);
            String[][] tabela = new String[D][N + 1];
            String resultado = "";
            int contador = 0;
            int k = 0;
            for (int i = 0; i < D; i++) {
                entrada = sc.nextLine().trim();
                partes = entrada.split(" ");
                for (int j = 0; j < N + 1; j++) {
                    tabela[i][j] = partes[j];
                    if(tabela[i][j].equals("1")) {
                        contador++;
                    }
        
                }   
                
                if(contador == N && k == 0) {
                    resultado = (tabela[i][0]);
                    k++;
                    
                }
                contador = 0;
                
            }
            if(k == 0)
                System.out.println("Pizza antes de FdI");
            else
                System.out.println(resultado);
            
            resultado = "";
            k = 0;
            
                        
        }
        

        sc.close();
    }

}

