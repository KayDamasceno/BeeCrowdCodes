import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        while(sc.hasNext()) {
            String input = sc.nextLine();
            int P = Integer.parseInt(sc.nextLine());
            int contador = 0;
            int read = 0;
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i)=='R') {
                    read++;
                }else if(input.charAt(i)=='W') {
                    if(read!=0) {
                        contador++;
                        read = 0;
                    }
                    contador++;
                }
                //System.out.println(read);
                if(read == P) {
                    contador++;
                    read = 0;
                }
            }
            
            if(read!=0) {
                contador++;
            }
            System.out.println(contador);
        }
        
        
    }

    

}

