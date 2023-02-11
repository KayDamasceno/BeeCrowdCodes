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
        
        double A = Double.parseDouble(partes[0]);
        double B = Double.parseDouble(partes[1]);
        double C = Double.parseDouble(partes[2]);
        
        
        
        if(A<B+C && B<A+C && C<B+A && A>Math.abs(B-C)&&B>Math.abs(A-C)&&C>Math.abs(B-A)) {
            if((A ==B) && (A== C)&&(A==B)) {
                out.println("Valido-Equilatero");
                if(A>B && A>C && A == Math.sqrt(B*B + C*C))
                    out.println("Retangulo: S");
                else if(B>A && B>C && B==Math.sqrt(A*A + B*B))
                    out.println("Retangulo: S");
                else if(C>A && C>B && C==Math.sqrt(A*A + B*B))
                    out.println("Retangulo: S");
                else
                    out.println("Retangulo: N");
            }else if(((A==B)&&(A!=C))||((A==C)&&(A!=B))||((B==C)&&(B!=A))||((B==A)&&(B!=C))||((C==A)&&(C!=B))||((B==C)&&(C!=A))){
                out.println("Valido-Isoceles");
                if(A>B && A>C && A == Math.sqrt(B*B + C*C))
                    out.println("Retangulo: S");
                else if(B>A && B>C && B==Math.sqrt(A*A + B*B))
                    out.println("Retangulo: S");
                else if(C>A && C>B && C==Math.sqrt(A*A + B*B))
                    out.println("Retangulo: S");
                else
                    out.println("Retangulo: N");
            }else {
                out.println("Valido-Escaleno");
                if(A>B && A>C && A == Math.sqrt(B*B + C*C))
                    out.println("Retangulo: S");
                else if(B>A && B>C && B==Math.sqrt(A*A + B*B))
                    out.println("Retangulo: S");
                else if(C>A && C>B && C==Math.sqrt(A*A + B*B))
                    out.println("Retangulo: S");
                else
                    out.println("Retangulo: N");
                
                
            }
        }else {
            out.println("Invalido");
        }
        out.close();
    }

}

