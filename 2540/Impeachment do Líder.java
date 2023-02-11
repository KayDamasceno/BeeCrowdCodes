import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.nextLine().trim());
            String valores = sc.nextLine().trim();
            String[] numeros = valores.split(" ");
            double contador1 = 0;
            double contador0 = 0;
            
            for(int i = 0; i<n; i++) {
                if(numeros[i].equals("1"))
                    contador1++;
                else
                    contador0++;
            }
            
            
            if(contador1>=((n*2*1.0)/3))
                    System.out.println("impeachment");
            else
                System.out.println("acusacao arquivada");
                    
            
            
    
        }
        out.close();
        sc.close();
    }

}

