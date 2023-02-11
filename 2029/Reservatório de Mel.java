import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String numeroTexto;
        String numeroTexto1;
        while((numeroTexto = br.readLine())!=null && numeroTexto.length()!=0) {
            numeroTexto1 = br.readLine();
            
            double volume = Double.parseDouble(numeroTexto);
            double diametro = Double.parseDouble(numeroTexto1);
            
            double altura = ((volume/(3.14*((diametro/2)*(diametro/2)))));
            double area = (3.14*(diametro*1.0/2)*(diametro/2));
            
            System.out.println("ALTURA = "+new DecimalFormat("0.00").format(altura));
            System.out.println("AREA = "+new DecimalFormat("0.00").format(area));
        }
    }

}

