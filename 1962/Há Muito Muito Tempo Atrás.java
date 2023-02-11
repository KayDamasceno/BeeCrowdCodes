import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int casos = Integer.parseInt(br.readLine());
        
        while(casos-->0) {
            int numero = Integer.parseInt(br.readLine());
            
            if(2014-numero < 0) {
                out.println(numero-2014 + " A.C.");
            } else if(numero == 15){
                out.println("2000 D.C.");
            }
            else {
                out.println(2015 - numero+" D.C.");
            }
        }
        
        out.close();
    }

}

