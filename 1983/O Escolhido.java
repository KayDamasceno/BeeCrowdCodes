import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int alunos = Integer.parseInt(br.readLine());
        String nomes[] = new String[alunos];
        Double notas[] = new Double[alunos];
        int aux = 0;
        int aux2 = alunos;
        
        while(aux2-->0) {
            String notastexto = br.readLine();
            String[] partes = notastexto.split(" ");
            notas[aux] = Double.parseDouble(partes[1]);
            nomes[aux] = partes[0];
            aux++;
            
        }
        
        double maior = notas[0];
        int j = 0;
        for(int i = 1; i<alunos; i++) {
            if(notas[i]>maior) {
                maior = notas[i];
                j = i;
            }
                
        }
        
        if(maior>=8) {
            System.out.println(nomes[j]);
        }else
            System.out.println("Minimum note not reached");
    }

}

