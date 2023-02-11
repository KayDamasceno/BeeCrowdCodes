import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String numero = br.readLine();
        Double A = Double.parseDouble(numero);
        String resultado = String.format("%.4e", A);
        String resultFinal="+";
    
        if(resultado.charAt(0)!='-') {
            resultFinal = resultFinal+resultado;
        }else {
            resultFinal = resultado;
            
        }
        
        resultFinal = resultFinal.replace('e', 'E');
        
        System.out.println(resultFinal);        
        
        out.close();
    }
}

