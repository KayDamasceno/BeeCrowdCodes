import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static int[][] matrix = new int[8][8];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String entrada = sc.nextLine().trim();
        String[] partes = entrada.split(" ");

        int x1 = Integer.parseInt(partes[0]);
        int y1 = Integer.parseInt(partes[1]);
        int x2 = Integer.parseInt(partes[2]);
        int y2 = Integer.parseInt(partes[3]);
        while (x1 != 0 && y1 != 0 && x2 != 0 && y2 != 0) {
        
            //Origem igual a Destino
            if(x1 == x2 && y1 == y2) {
                System.out.println(0);
            }else if(x1 == x2 || y1 == y2 || (Math.abs(x1-x2) == Math.abs(y1-y2))){
                System.out.println(1);
                
            }else {
                System.out.println(2);
            }
            entrada = sc.nextLine().trim();
            partes = entrada.split(" ");

            x1 = Integer.parseInt(partes[0]);
            y1 = Integer.parseInt(partes[1]);
            x2 = Integer.parseInt(partes[2]);
            y2 = Integer.parseInt(partes[3]);
        }
        sc.close();
        out.close();
    }

    

}

