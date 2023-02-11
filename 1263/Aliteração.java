import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        
        while(sc.hasNext()) {
            String[] buffer = sc.nextLine().split(" ");
            char atual = buffer[0].toLowerCase().charAt(0);
            int contador = 0;
            int saida = 0;
            for(int i = 1; i < buffer.length; i++) {
                if(buffer[i].toLowerCase().charAt(0) == atual) {
                //  System.out.println(buffer[i].toLowerCase().charAt(0));
                    contador++;
                }
                else {
                    if(contador!=0)
                        saida++;
                    atual = buffer[i].toLowerCase().charAt(0);
                    contador = 0;
                }
                
                
            }
            if(contador!=0)
                saida++;
            System.out.println(saida);
        }
    
        sc.close();
        out.close();
    }

    

}

