import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pokemons = new ArrayList<String>();
        int casos = Integer.parseInt(sc.nextLine().trim());
        //System.out.println(casos);
        int contador = 0;
        while (casos-->0) {
            String texto = sc.nextLine();
            //System.out.println("entrada: "+texto);
            if(!pokemons.contains(texto)) {
                contador++;
                pokemons.add(texto);
            }
            
        
        }
        System.out.println("Falta(m) "+(151-contador)+" pomekon(s).");

        sc.close();
    }

}

