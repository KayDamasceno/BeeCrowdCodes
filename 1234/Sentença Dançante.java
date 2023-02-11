import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto;

        while(sc.hasNext()) {
            int j = 1;
            texto = sc.nextLine();
            //System.out.println(texto.length());
            String resultado = "";
            for(int i = 0; i < texto.length(); i++) {
                if(texto.charAt(i)!=' ') {
                    if(j%2!=0) {
                        resultado = resultado + Character.toUpperCase(texto.charAt(i));
                        j++;
                    }
                    else {
                        resultado = resultado + Character.toLowerCase(texto.charAt(i));
                        j++;
                    }
                
                }else {
                    //System.out.println(i);
                    resultado = resultado + " ";
                }
            }
            
            System.out.println(resultado);
        }
    
        sc.close();
    }

    

}

