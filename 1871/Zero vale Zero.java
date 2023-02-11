import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().trim().split(" ");
        while (!num[0].equals("0")||!num[1].equals("0")) {
            
            
            int resul = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
            
            String saida = Integer.toString(resul);
            saida = saida.replaceAll("0", "");
            
            System.out.println(saida);
            num = sc.nextLine().trim().split(" ");
        }

    }
}

