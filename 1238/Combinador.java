import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());
        
        while(N-->0) {
            String[] entrada = sc.nextLine().trim().split(" ");
            String palavra1 = entrada[0];
            String palavra2 = entrada[1];
            int max = Math.max(palavra1.length(), palavra2.length());
            int i = 0;
            String saida = "";
            while(i<max) {
                if(i < palavra1.length()) {
                    saida = saida + palavra1.charAt(i);
                }
                
                if(i < palavra2.length()) {
                    saida = saida + palavra2.charAt(i);
                }
                
                i++;
            }
            
            System.out.println(saida);
        }
        
        sc.close();
    }

}

