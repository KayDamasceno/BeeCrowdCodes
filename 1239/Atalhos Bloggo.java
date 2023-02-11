import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        while((entrada = br.readLine())!=null ) {
            String saida = "";
            int contadori = 0;
            int contadorb = 0;
            for(int i = 0; i < entrada.length(); i++) {
                    if(entrada.charAt(i)=='_' && contadori == 0) {
                        saida = saida+"<i>";
                        contadori = 1;
                    }else if (entrada.charAt(i)=='_' && contadori == 1) {
                        saida = saida+"</i>";
                        contadori = 0;
                    }else if (entrada.charAt(i)=='*' && contadorb == 0) {
                        saida = saida+"<b>";
                        contadorb = 1;
                    }
                    else if (entrada.charAt(i)=='*' && contadorb == 1) {
                        saida = saida+"</b>";
                        contadorb = 0;
                    }else {
                        saida = saida+entrada.charAt(i);
                    }
            }
            
            System.out.println(saida);
            
        }
            
                    
        
        sc.close();
    }

}

