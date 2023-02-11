import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        
        int numero = Integer.parseInt(br.readLine());
        String segunda = br.readLine();
        String[] partes = segunda.split(" ");
        long vetor[][] = new long[2][numero];
        long soma = 0;
        
        for(int i = 0; i<numero; i++) {
            vetor[0][i] = Long.parseLong(partes[i]);
            soma = soma + vetor[0][i];
        }
        int estrelas = 0;
        int carneiros = 0;
        int j = 0;
        while((j>=0) && (j<numero)) {
            
            if(vetor[0][j]!=0) {
                if(vetor[0][j]%2 == 0) {
                    carneiros++;
                    vetor[0][j]--;
                    if(vetor[1][j] != 1) {
                        estrelas++;
                        vetor[1][j] = 1;
                    }
                    j = j-1;
                }
                else {
                    carneiros++;
                    vetor[0][j]--;
                    if(vetor[1][j] != 1) {
                        estrelas++;
                        vetor[1][j] = 1;
                    }
                    j = j+1;
                }
            }else {
                j=-1;
            }
            
        }
        
        
        long resultado = soma -carneiros;
        if (estrelas == 0)
            estrelas = 1;

        System.out.println(estrelas +" "+ resultado);
    }

}

