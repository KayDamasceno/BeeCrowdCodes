import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String numero;
        int number;
        
        while((numero = br.readLine())!= null && numero.length()!=0) {
        
            number = Integer.parseInt(numero);
            
            if(number == 0) {
                System.out.println("vai ter copa!");
            }else {
                System.out.println("vai ter duas!");
            }
        
        
        }
    }
}

