import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        
        String[] entrada;
        ArrayList<String> acertou = new ArrayList<String>();
        ArrayList<String> errou = new ArrayList<String>(); 
        String[][] partes1;
        String[][] valores;
        String[] texto;
        String[][] partes;
    
        while (sc.hasNext()) {
            
            int n = Integer.parseInt(sc.nextLine().trim());
             entrada = new String[n];
             partes1 = new String[n][];
             valores = new String[n][];
             texto = new String[n];
             partes = new String[n][];
             
            for (int i = 0; i < n; i++) {
                entrada[i] = sc.nextLine().trim();
                partes1[i] = entrada[i].split("=");
                valores[i] = partes1[i][0].split(" ");
                //System.out.println(valores[i][0]+" "+valores[i][1]+" "+partes1[i][1]);
            }

            for (int i = 0; i < n; i++) {
                texto[i] = sc.nextLine().trim();
                partes[i] = texto[i].split(" ");
            }

            for (int i = 0; i < n; i++) {
                if (partes[i][2].equals("+")) {
                    int valor = Integer.parseInt(partes[i][1]) - 1;

                    int a = Integer.parseInt(valores[valor][0]);
                    int b = Integer.parseInt(valores[valor][1]);
                    int c = Integer.parseInt(partes1[valor][1]);
                    // System.out.println(a + " " + b+" " + c+" " + valor);
                    if (a + b == c)
                        acertou.add(partes[i][0]);
                    else
                        errou.add(partes[i][0]);
                } else if (partes[i][2].equals("*")) {
                    //System.out.println(parte + " " + b+" " + c+" " + valor);

                    int valor = Integer.parseInt(partes[i][1]) - 1;
                    int a = Integer.parseInt(valores[valor][0]);
                    int b = Integer.parseInt(valores[valor][1]);
                    int c = Integer.parseInt(partes1[valor][1]);
                                        if (a * b == c)
                        acertou.add(partes[i][0]);
                    else
                        errou.add(partes[i][0]);
                } else if (partes[i][2].equals("-")) {
                    int valor = Integer.parseInt(partes[i][1]) - 1;
                    int a = Integer.parseInt(valores[valor][0]);
                    int b = Integer.parseInt(valores[valor][1]);
                    int c = Integer.parseInt(partes1[valor][1]);
                    // System.out.println(a + " " + b+" " + c+" " + valor);
                    if (a - b == c)
                        acertou.add(partes[i][0]);
                    else
                        errou.add(partes[i][0]);
                } else if (partes[i][2].equals("I")) {
                    int valor = Integer.parseInt(partes[i][1]) - 1;
                    int a = Integer.parseInt(valores[valor][0]);
                    int b = Integer.parseInt(valores[valor][1]);
                    int c = Integer.parseInt(partes1[valor][1]);
                    // System.out.println(a + " " + b+" " + c+" " + valor);
                    if (a - b != c && a * b != c && a + b != c)
                        acertou.add(partes[i][0]);
                    else
                        errou.add(partes[i][0]);
                }
            }

            if (acertou.size() == n)
                System.out.println("You Shall All Pass!");
            else if (errou.size() == n) {
                System.out.println("None Shall Pass!");
            } else {
                Collections.sort(errou);
                for (int i = 0; i < errou.size() - 1; i++) {
                    System.out.print(errou.get(i) + " ");
                }
                System.out.println(errou.get(errou.size() - 1));
            }
                
            acertou.clear();
            errou.clear();
        }
        sc.close();
    }

}

