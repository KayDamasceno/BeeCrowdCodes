import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String entrada;

        while ((entrada = br.readLine()) != null) {
            String[] parts = entrada.split(" ");
            int D = Integer.parseInt(parts[0]);
            int VF = Integer.parseInt(parts[1]);
            int VG = Integer.parseInt(parts[2]);
        
            double tempoF = 12*1.0/VF;
            double H = Math.sqrt(D*D + 12*12);
            double tempoG = H/VG;
            
            if(tempoF >= tempoG) {
                System.out.println("S");
            }else
                System.out.println("N");
        //  System.out.println(tempoF+" "+tempoG);
        }

    }
}

