import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int EPR = 0, EHD = 0, INTRUSOS = 0;
            int N = Integer.parseInt(sc.nextLine());
            String[] entrada;
            for (int i = 0; i < N; i++) {
                entrada = sc.nextLine().trim().split(" ");
                
                if(entrada[1].equals("EPR"))
                    EPR++;
                else if(entrada[1].equals("EHD"))
                    EHD++;
                else
                    INTRUSOS++;
            }
            
            System.out.println("EPR: "+EPR);
            System.out.println("EHD: "+EHD);
            System.out.println("INTRUSOS: "+INTRUSOS);
        }
    }
}

