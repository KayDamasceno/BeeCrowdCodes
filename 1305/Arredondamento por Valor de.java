import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] entrada;

        while (sc.hasNext()) {
            entrada = sc.nextLine().split("\\.");
            // System.out.println(entrada.length);
            // System.out.println(entrada[0]);
            int pre = 0;
            if (!entrada[0].equals(""))
                pre = Integer.valueOf(entrada[0]);

            double pos = 0;
            if (entrada.length == 1)
                pos = 0;
            else if (!entrada[1].equals("")) {
                entrada[1] = "0"+"."+entrada[1];
                pos = Double.parseDouble(entrada[1]);

            }

            double input = Double.parseDouble(sc.nextLine());
            
            //System.out.println(pos + " " + input);
            
            if(pos >= input)
                pre++;
            
            System.out.println(pre);

            
        }

    }
}

