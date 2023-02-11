import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.nextLine().trim());
        String placa;
        String pattern = "[A-Z]{3}-[0-9]{4}";
        while(N-- > 0) {
            placa = sc.nextLine().trim();
            boolean matches = placa.matches(pattern);
        //  System.out.println(matches);
            if(matches) {
                if(placa.charAt(7)=='1' || placa.charAt(7) == '2')
                    out.println("MONDAY");
                else if(placa.charAt(7)=='3' || placa.charAt(7) == '4')
                    out.println("TUESDAY");
                else if(placa.charAt(7)=='5' || placa.charAt(7) == '6')
                    out.println("WEDNESDAY");
                else if(placa.charAt(7)=='7' || placa.charAt(7) == '8')
                    out.println("THURSDAY");
                else if(placa.charAt(7)=='9' || placa.charAt(7) == '0')
                    out.println("FRIDAY");      
            }else
                out.println("FAILURE");
        }
        
        out.close();
        sc.close();
    }   

}

