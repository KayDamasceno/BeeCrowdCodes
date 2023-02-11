import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String entrada = br.readLine();
        
        int valor = 0;
        for(int i =0 ; i<entrada.length(); i++) {
            if(entrada.charAt(i)=='1')
                valor = valor + 1;
        }
        
        if(valor%2 == 0) {
            System.out.println(entrada+"0");
        }else {
            System.out.println(entrada+"1");
        }
    }
    
    

}

