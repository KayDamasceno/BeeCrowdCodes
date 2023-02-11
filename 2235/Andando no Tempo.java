import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String entrada = br.readLine();
        String[] partes = entrada.split(" ");
        int A = Integer.parseInt(partes[0]);
        int B = Integer.parseInt(partes[1]);
        int C = Integer.parseInt(partes[2]);
        
        int resultado = 0;
        
        if(2016 + A + B == 2016) {
            resultado++;
        }else if(2016 + A - B == 2016) {
            resultado++;
        }else if(2016 - A + B == 2016) {
            resultado++;
        }else if(2016 - A - B == 2016) {
            resultado++;
        }else if(2016 + A + C == 2016) {
            resultado++;
        }else if(2016 + A - C == 2016) {
            resultado++;
        }else if(2016 - A - C == 2016) {
            resultado++;
        }else if(2016 - A + C == 2016) {
            resultado++;
        }else if(2016 + B + C == 2016) {
            resultado++;
        }else if(2016 + B - C == 2016) {
            resultado++;
        }else if(2016 -B + C == 2016) {
            resultado++;
        }else if(2016 -B - C == 2016) {
            resultado++;
        }else if(2016 + A + B +C == 2016) {
            resultado++;
        }else if(2016 + A + B -C == 2016) {
            resultado++;
        }else if(2016 + A - B +C == 2016) {
            resultado++;
        }else if(2016 + A - B -C == 2016) {
            resultado++;
        }else if(2016 - A + B +C == 2016) {
            resultado++;
        }else if(2016 - A + B -C == 2016) {
            resultado++;
        }else if(2016 - A - B +C == 2016) {
            resultado++;
        }else if(2016 - A - B -C == 2016) {
            resultado++;
        }
        
        if(resultado!=0)
            System.out.println("S");
        else
            System.out.println("N");

    }

}

