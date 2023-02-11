import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int value = 0;
        int temp = 0;
        String entrada;

        while(temp >= 0) {
            entrada = sc.nextLine();
            if(entrada.contains("x")) {
                //System.out.println(entrada.substring(2, entrada.length()));
                value = Integer.parseInt(entrada.substring(2, entrada.length()),16);
                System.out.println(value);
            }else {
                temp = Integer.parseInt(entrada);
                if(temp < 0)
                    break;
                System.out.println("0x"+Integer.toHexString(temp).toUpperCase());
            }
            
        }
        
    }
}

