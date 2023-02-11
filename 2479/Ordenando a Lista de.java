import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] nomes = new String[N];
        int mais = 0, menos = 0;
        int i = 0;
        while(N-->0) {
            String[] texto = sc.nextLine().trim().split(" ");
            if(texto[0].equals("+"))
                mais++;
            else
                menos++;
            
            nomes[i] = texto[1];
            i++;
            
        }
        
        Arrays.sort(nomes);
        
        for(int j = 0; j < nomes.length; j++) {
            System.out.println(nomes[j]);
        }
        System.out.printf("Se comportaram: %d | Nao se comportaram: %d\n", mais, menos);
        sc.close();
    }
}

