import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        while((entrada = br.readLine())!=null) {
            String saida = "";
            char c;
            int value;
            for(int i = 0; i<entrada.length(); i++) {
                c = entrada.charAt(i);
                value = (int)c;
                if(Character.isLowerCase(c)) {
                    if(value+13<=122) {
                        value = c+13; 
                        saida = saida+(char)value;
                    }else {
                        value = value-13;
                        saida = saida+(char)value;
                    }
                }else if(Character.isUpperCase(c)) {
                    if(value+13<=90) {
                        value = c+13; 
                        saida = saida+(char)value;
                    }else {
                        value = value-13;
                        saida = saida+(char)value;
                    }
                }else {
                    saida = saida + (char)value;
                }
            }
            
            System.out.println(saida);
        }
        
        
    }

}

