import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] fst = sc.nextLine().split(" ");
        
        while(!fst[0].equals("*")) {
            int contador = 0;
            for(int i = 1; i < fst.length; i++) {
                if(fst[i].charAt(0) == Character.toUpperCase(fst[0].charAt(0)) || fst[i].charAt(0) == Character.toLowerCase(fst[0].charAt(0)))
                    contador++;
            }
            
            if(contador == fst.length-1)
                System.out.println("Y");
            else
                System.out.println("N");
            fst = sc.nextLine().split(" ");
        }

        
        sc.close();
    }
}

