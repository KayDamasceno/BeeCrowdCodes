import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int casos = Integer.parseInt(br.readLine());

        while (casos-- > 0) {
            String texto = br.readLine();

            Pattern ptn = Pattern.compile("\\.\\.\\.\\.\\.\\.\\.");
            String[] palavras = ptn.split(texto);

            Pattern ptn1 = Pattern.compile("\\.\\.\\.");
            String[][] letras = new String[palavras.length][];
            for (int i = 0; i < palavras.length; i++) {
                letras[i] = ptn1.split(palavras[i]);
            }
            ;

            Map<String, String> morse = new LinkedHashMap<>();

            morse.put("=.===", "a");
            morse.put("===.=.=.=", "b");
            morse.put("===.=.===.=", "c");
            morse.put("===.=.=", "d");
            morse.put("=", "e");
            morse.put("=.=.===.=", "f");
            morse.put("===.===.=", "g");
            morse.put("=.=.=.=", "h");
            morse.put("=.=", "i");
            morse.put("=.===.===.===", "j");
            morse.put("===.=.===", "k");
            morse.put("=.===.=.=", "l");
            morse.put("===.===", "m");
            morse.put("===.=", "n");
            morse.put("===.===.===", "o");
            morse.put("=.===.===.=", "p");
            morse.put("===.===.=.===", "q");
            morse.put("=.===.=", "r");
            morse.put("=.=.=", "s");
            morse.put("===", "t");
            morse.put("=.=.===", "u");
            morse.put("=.=.=.===", "v");
            morse.put("=.===.===", "w");
            morse.put("===.=.=.===", "x");
            morse.put("===.=.===.===", "y");
            morse.put("===.===.=.=", "z");
            

            if (palavras.length != 0) {
                for (int i = 0; i < palavras.length - 1; i++) {
                    for (int j = 0; j < letras[i].length; j++)
                        System.out.print(morse.get(letras[i][j]));

                    System.out.print(" ");
                }
                for (int j = 0; j < letras[palavras.length - 1].length; j++) {
                    System.out.print(morse.get(letras[palavras.length - 1][j]));
                }
                System.out.println();

            }else {
                for (int i = 0; i <= palavras.length - 1; i++) {
                    for (int j = 0; j < letras[i].length; j++)
                        System.out.print(morse.get(letras[i][j]));

                    System.out.print(" ");
                }
                for (int j = 0; j < letras[palavras.length - 1].length; j++) {
                    System.out.print(morse.get(letras[palavras.length - 1][j]));
                }
                System.out.println();


            }
        }
        out.close();
    }

}

