import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String numeros = sc.nextLine().trim();
            String[] dividir = numeros.split(" ");
            int C = Integer.parseInt(dividir[0]);
            int N = Integer.parseInt(dividir[1]);
            String cifra = sc.nextLine().trim();
            String palavra = sc.nextLine().trim();
            String resultado = "";

            Map<Character, Character> trocas = new HashMap<>();

            for (int i = 0; i < C; i++) {
                cifra = cifra.toLowerCase();
                palavra = palavra.toLowerCase();
                trocas.put(palavra.charAt(i), cifra.charAt(i));
                trocas.put(cifra.charAt(i), palavra.charAt(i));
                
                if(Character.isLetter(palavra.charAt(i))&&Character.isLetter(cifra.charAt(i))) {
                    cifra = cifra.toUpperCase();
                    palavra = palavra.toUpperCase();
                    trocas.put(palavra.charAt(i), cifra.charAt(i));
                    trocas.put(cifra.charAt(i), palavra.charAt(i));
                }

            }

            
            /*  for (Character name: trocas.keySet()){
              
              String key =name.toString(); String value = trocas.get(name).toString();
              System.out.println(key + " " + value);
             
             
             }*/
             
            while (N-- > 0) {
                String texto = sc.nextLine().trim();
                for (int i = 0; i < texto.length(); i++) {
                    if (trocas.containsKey(texto.charAt(i))) {
                        resultado = resultado + trocas.get(texto.charAt(i));
                    } else {
                        resultado = resultado + texto.charAt(i);
                    }
                }

                System.out.println(resultado);
                resultado = "";
            }
            
            System.out.println();

        }
        sc.close();

    }

}

