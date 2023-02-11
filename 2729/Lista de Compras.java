import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine().trim());
        ArrayList<String> frutas = new ArrayList<String>();
        while (casos-- > 0) {
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");
            
            for(int i = 0; i < partes.length; i++) {
                if(!frutas.contains(partes[i]))
                    frutas.add(partes[i]);
                
            }
            
            Collections.sort(frutas);
            
            for(int i = 0; i<frutas.size()-1; i++) {
                System.out.print(frutas.get(i)+" ");
            }
            System.out.println(frutas.get(frutas.size()-1));
            
            frutas.clear();
        }
        sc.close();
    }

}

