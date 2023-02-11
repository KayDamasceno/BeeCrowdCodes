import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String entrada = sc.nextLine();
            String cent = sc.nextLine();
            if(Integer.parseInt(cent) < 10)
                cent ="0"+cent;
            double amount = Double.parseDouble(entrada+"."+cent);
            
            Locale locale = new Locale("en","US");
            NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
            System.out.println(currency.format(amount));
        }
    }
}

