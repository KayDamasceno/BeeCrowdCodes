import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String entrada = br.readLine();
        String[] partes = entrada.split(" ");
        int resultado = 0;
        
        
            if(Integer.parseInt(partes[0])+Integer.parseInt(partes[1]) == 24) {
                resultado =  0;
            }else if(Integer.parseInt(partes[0])+Integer.parseInt(partes[1]) > 24) {
                resultado = Integer.parseInt(partes[0])+Integer.parseInt(partes[1])-24;
            }else {
                resultado = Integer.parseInt(partes[0])+Integer.parseInt(partes[1]);
            }
            
        
        if(resultado+Integer.parseInt(partes[2])<0) {
            resultado = 24 - ((-1)*Integer.parseInt(partes[2])) + resultado;
        }else {
            if(resultado+Integer.parseInt(partes[2]) == 24) {
                resultado =  0;
            }else if(resultado+Integer.parseInt(partes[2]) > 24) {
                resultado = resultado+Integer.parseInt(partes[2])-24;
            }else {
                resultado = resultado+Integer.parseInt(partes[2]);
            }
        }
        
        System.out.println(resultado);
        out.close();
    }

}

