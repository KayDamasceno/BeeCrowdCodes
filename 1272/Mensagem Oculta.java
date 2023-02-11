import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] entrada;
        int N = Integer.parseInt(sc.nextLine());
        while(N-->0) {
            entrada =sc.nextLine().split("\\s+");
        //  System.out.println(entrada[2]);
            for(int i = 0; i < entrada.length; i++) {
                if(entrada[i].length() > 0)
                    System.out.print(entrada[i].charAt(0));
            }
            System.out.println();
            
        }

        

    }
}

