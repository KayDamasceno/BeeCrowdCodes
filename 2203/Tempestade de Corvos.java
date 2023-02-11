import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String entrada;
        while ((entrada = br.readLine()) != null && entrada.length() != 0) {

            String[] partes = entrada.split(" ");

            double Xf = Double.parseDouble(partes[0]);
            double Yf = Double.parseDouble(partes[1]);
            double Xi = Double.parseDouble(partes[2]);
            double Yi = Double.parseDouble(partes[3]);
            double Vi = Double.parseDouble(partes[4]);
            double R1 = Double.parseDouble(partes[5]);
            double R2 = Double.parseDouble(partes[6]);
            
            double d1 = Math.sqrt((Xf-Xi)*(Xf-Xi)+(Yf-Yi)*(Yf-Yi))+1.5*Vi;
            double d2 = R1+R2;

            if(d2>=d1)
                System.out.println("Y");
            else
                System.out.println("N");
        /*  double posicaoFinalInvasorX = Xi + 1.5 * Vi;
            double posicaoFinalInvasorY = 0;

            double posicaoFinalFiddleX = Xf + R1;
            double posicaoFinalFiddleY = 0;
        
            double posicaoFinalFiddle = 0;
            double posicaoFinalInvasor = 0;

            double ajudaF = Math.sqrt(Xf * Xf + Yf * Yf);
            double ajudaI = Math.sqrt(Xi * Xi + Yi * Yi);

            if (Yf == Yi) {

                posicaoFinalFiddleX = Xf + R1;
                posicaoFinalInvasorX = Xi + 1.5 * Vi;

                if (posicaoFinalInvasorX <= (posicaoFinalFiddleX + R2)
                        && posicaoFinalInvasorX >= (posicaoFinalFiddleX - R2))
                    System.out.println("Y");
                else
                    System.out.println("N");
            } else if (Xf == Xi) {
                posicaoFinalFiddleY = Yf + R1;
                posicaoFinalInvasorY = Yi + 1.5 * Vi;

                if (posicaoFinalInvasorY <= (posicaoFinalFiddleY + R2)
                        && posicaoFinalInvasorY >= (posicaoFinalFiddleY - R2))
                    System.out.println("Y");
                else
                    System.out.println("N");
            } else {
                

                if (ajudaF < ajudaI) {
                    posicaoFinalFiddle = ajudaF + R1;
                    posicaoFinalInvasor = ajudaI + 1.5 * Vi;
                    // System.out.println(ajudaF+" "+ posicaoFinalFiddle+" "+ajudaI+"
                    // "+posicaoFinalInvasor);
                    if (posicaoFinalInvasor <= (posicaoFinalFiddle + R2)
                            && posicaoFinalInvasor >= (posicaoFinalFiddle - R2))
                        System.out.println("Y");
                    else
                        System.out.println("N");
                    
                }
                else {
                    posicaoFinalFiddle = ajudaF - R1;
                    posicaoFinalInvasor = ajudaI - 1.5 * Vi;
                     System.out.println(ajudaF+" "+ posicaoFinalFiddle+" "+ajudaI+" "+posicaoFinalInvasor);
                    if (posicaoFinalInvasor <= (posicaoFinalFiddle + R2)
                            && posicaoFinalInvasor >= (posicaoFinalFiddle - R2))
                        System.out.println("Y");
                    else
                        System.out.println("N");
                }
            }
    */
        }
    }

}

