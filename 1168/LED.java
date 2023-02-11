import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int N = Integer.parseInt(in.readLine());
        String number = in.readLine();
        
        int resultado;
        
        while(--N>-1) {
        
            resultado = 0;
            
            for(int i = 0; i<number.length(); i++) {
                if(number.charAt(i) == '0')
                    resultado = resultado + 6;
                else if(number.charAt(i) == '1')
                    resultado = resultado + 2;
                else if(number.charAt(i) == '2')
                    resultado = resultado + 5;
                else if(number.charAt(i) == '3')
                    resultado = resultado + 5;
                else if(number.charAt(i) == '4')
                    resultado = resultado + 4;
                else if(number.charAt(i) == '5')
                    resultado = resultado + 5;
                else if(number.charAt(i) == '6')
                    resultado = resultado + 6;
                else if(number.charAt(i) == '7')
                    resultado = resultado + 3;
                else if(number.charAt(i) == '8')
                    resultado = resultado + 7;
                else if(number.charAt(i) == '9')
                    resultado = resultado + 6;
            }
            
            
        
            out.println(resultado + " " + "leds");
            number = in.readLine();
        
        }
        
        
        out.close();
        
    }
}
