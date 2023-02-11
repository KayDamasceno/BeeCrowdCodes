import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        String texto = sc.nextLine().trim();
        int vogais = 0;
        int conso = 0;
        String pal = "";
        for(int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)=='a' || texto.charAt(i)=='e' || texto.charAt(i)=='i' || texto.charAt(i)=='o'
                    || texto.charAt(i)=='u') {
                pal = pal + texto.charAt(i);
            }else {
                conso++;
            }
        }
        
        StringBuffer sb = new StringBuffer(pal);
        sb.reverse();
        if(pal.equals(sb.toString()))
            System.out.println("S");
        else
            System.out.println("N");
        
        sc.close();
    }

}

