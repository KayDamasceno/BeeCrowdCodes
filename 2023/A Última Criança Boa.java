import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<String> original = new ArrayList<String>();
        String texto;
    
        
        while (sc.hasNext()) {
            texto  = sc.nextLine().trim();
            nomes.add(texto.toLowerCase());
            original.add(texto);
        
            Collections.sort(nomes);
            
            
            
            
        }
        
        for(int i = 0 ; i < nomes.size(); i++) {
            if(nomes.get(nomes.size()-1).equals(original.get(i).toLowerCase()))
                System.out.println(original.get(i));
        }

        sc.close();
    }

}

