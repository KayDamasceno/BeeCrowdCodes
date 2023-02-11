import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
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
        //Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(in.readLine()); 
        while(number>0) {
        
        
        int ascii;
        String text = in.readLine() ;
        String shiffted = new String();
        
        //System.out.println(text);
        
        for(int i = 0; i<text.length(); i++) {
            
            if(((int)text.charAt(i)>=65&&(int)text.charAt(i)<=90)||
                    ((int)text.charAt(i)>=97&&(int)text.charAt(i)<=122)) {
                
                ascii = (int)text.charAt(i)+3;
                shiffted = shiffted+(char)ascii;
            }else
                shiffted = shiffted+text.charAt(i);
            
        }
        
        String reverse = new StringBuilder(shiffted).reverse().toString();
        String result = reverse.substring(0, (reverse.length()/2));
        for(int i = (reverse.length()/2); i<reverse.length(); i++) {
            
            
            ascii = (int)reverse.charAt(i)-1;
            result = result + (char)ascii;
        }
        
        number--;
        out.println(result);
        
        
        }
        out.close();
        //sc.close();
    }
 
}
