import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C = Integer.parseInt(sc.nextLine().trim());

        while (C-- > 0) {
            String numeros = sc.nextLine().trim();
            String[] part = numeros.split(" ");

            String saida = "";

            for (int i = Integer.parseInt(part[0]); i <= Integer.parseInt(part[1]); i++) {
                saida = saida + i;
            }
            
            StringBuffer sb = new StringBuffer(saida);
            sb.reverse();
            
            System.out.println(saida+sb.toString());
        }

        sc.close();
    }

}

