import java.io.IOException;
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
   
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        
        String D = sc.next();
        String N = sc.next();
        
        
        String result;
        while(!D.equals("0") || !N.equals("0")) {
            
            result = N.replaceAll(D, "");
            
            result = trimLeadingZeros(result);
            
            if(result.equals(""))
                result = "0";
            
            
            if(allCharactersSame(result)) {
                if(result.charAt(0) == '0')
                    result = "0";
            }
            
            result.replaceFirst ("^0*", "");
            
            out.println(result);
            
            D = sc.next();
            N = sc.next();
            
        }
        
        sc.close();
        out.close();
    }
    
    public static String trimLeadingZeros(String source) {
        for (int i = 0; i < source.length(); ++i) {
            char c = source.charAt(i);
            if (c != '0') {
                return source.substring(i);
            }
        }
        return ""; // or return "0";
    }
    
    static boolean allCharactersSame(String s)
    {
        int n = s.length();
        for (int i = 1; i < n; i++)
            if (s.charAt(i) != s.charAt(0))
                return false;
             
        return true;
    }
 
}


