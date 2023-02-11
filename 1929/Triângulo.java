import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String numeros = br.readLine();
        String[] partes = numeros.split(" ");
        
        int  A = Integer.parseInt(partes[0]);
        int  B = Integer.parseInt(partes[1]);
        int  C = Integer.parseInt(partes[2]);
        int  D = Integer.parseInt(partes[3]);
        
        if (A<(B+C)&&A>(Math.abs(B-C))) {
            out.println("S");
        }else if(A<(B+D)&&A>(Math.abs(B-D))) {
            out.println("S");
        }else if(A<(D+C)&&A>(Math.abs(D-C))) {
            out.println("S");
        }else if(B<(A+C)&&B>(Math.abs(A-C))) {
            out.println("S");
        }else if(B<(A+D)&&B>(Math.abs(A-D))) {
            out.println("S");
        }else if(B<(D+C)&&B>(Math.abs(D-C))) {
            out.println("S");
        }else if(C<(A+B)&&C>(Math.abs(B-A))) {
            out.println("S");
        }else if(C<(A+D)&&C>(Math.abs(A-D))) {
            out.println("S");
        }else if(C<(B+D)&&C>(Math.abs(B-D))) {
            out.println("S");
        }else if(D<(A+B)&&D>(Math.abs(B-A))) {
            out.println("S");
        }else if(D<(A+C)&&D>(Math.abs(A-C))) {
            out.println("S");
        }else if(D<(B+C)&&D>(Math.abs(B-C))) {
            out.println("S");
        }else {
            out.println("N");
        }
        
        out.close();
    }
}

