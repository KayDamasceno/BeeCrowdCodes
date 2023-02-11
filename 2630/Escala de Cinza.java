import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(sc.nextLine().trim());
        int i = 1;
        while (T-->0) {
            String tipo = sc.nextLine().trim();
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");
            int R = Integer.parseInt(partes[0]);
            int G = Integer.parseInt(partes[1]);
            int B = Integer.parseInt(partes[2]);
            int P = 0;
            if(tipo.equals("eye")) {
                P = (int)(0.3*R + 0.59*G + 0.11*B);
            }else if(tipo.equals("mean")) {
                P = (int)((R+G+B)/3);
            }else if(tipo.equals("min")) {
                if(R<=G && R<=B)
                    P = R;
                else if(G<=R && G<=B)
                    P = G;
                else if(B<=R && B<=G)
                    P = B;
            }else {
                if(R>=G && R>=B)
                    P = R;
                else if(G>=R && G>=B)
                    P = G;
                else if(B>=R && B>=G)
                    P = B;
            }
            
            System.out.println("Caso #"+ i+": "+P);
            i++;
        }
        

        sc.close();
    }

}

