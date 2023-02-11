import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String codigo= "000";
        int contador = 0;
        int soma = 0;
        while(contador<3) {
        String leitura = br.readLine();
        
        
        
        if(!leitura.equals("caw caw")) {
            codigo = "";
            for(int i = 0; i<leitura.length(); i++) {
                if(leitura.charAt(i)=='-') {
                    codigo = codigo+"0";
                }else {
                    codigo = codigo+"1";
                }
            }
        }else {
            out.println(soma);
            codigo = "000";
            contador++;
            soma = 0;
            
            
        }
        
        soma = soma + binarioToInteiro(codigo);
    
        
        }
        
        out.close();
    }

    public static int binarioToInteiro(String s) {
        int numero = Integer.parseInt(s, 2);
    
        return numero;
    }
}

