import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int casos = Integer.parseInt(br.readLine());
        while(casos-->0) {
            String jogador1 = br.readLine();
            String jogador2 = br.readLine();
            
            if(jogador1.equals("ataque")) {
                if(jogador2.equals("pedra")||jogador2.equals("papel")) {
                    out.println("Jogador 1 venceu");
                }else {
                    out.println("Aniquilacao mutua");
                }
            }else if(jogador1.equals("pedra")) {
                if(jogador2.equals("papel")) {
                    out.println("Jogador 1 venceu");
                }else if(jogador2.equals("ataque")) {
                    out.println("Jogador 2 venceu");
                }else {
                    out.println("Sem ganhador");
                }
            }else if(jogador1.equals("papel")) {
                if(jogador2.equals("papel")) {
                    out.println("Ambos venceram");
                }else {
                    out.println("Jogador 2 venceu");
                }
            }
        }
        out.close();
    }

}

