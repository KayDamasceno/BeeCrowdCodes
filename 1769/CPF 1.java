import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String[] entrada = sc.nextLine().trim().split("");
            
            int um = Integer.parseInt(entrada[0]);
            int dois = Integer.parseInt(entrada[1]);
            int tres = Integer.parseInt(entrada[2]);
            int quatro = Integer.parseInt(entrada[4]);
            int cinco = Integer.parseInt(entrada[5]);
            int seis = Integer.parseInt(entrada[6]);
            int sete = Integer.parseInt(entrada[8]);
            int oito = Integer.parseInt(entrada[9]);
            int nove = Integer.parseInt(entrada[10]);
            int dez = Integer.parseInt(entrada[12]);
            int onze =Integer.parseInt(entrada[13]);

            int ver = um * 1 + dois * 2 + tres * 3 + quatro * 4 + cinco * 5 + seis * 6 + 7 * sete + 8 * oito + 9 * nove;
            int b1 = ver % 11;
            if (b1 == 10)
                b1 = 0;
            int ver1 = um * 9 + dois * 8 + tres * 7 + quatro * 6 + cinco * 5 + seis * 4 + 3 * sete + 2 * oito
                    + 1 * nove;
            int b2 = ver1 % 11;
            if (b2 == 10)
                b2 = 0;
            
            if(b1 == dez && b2 == onze)
                System.out.println("CPF valido");
            else
                System.out.println("CPF invalido");
        }
        sc.close();

    }

}

