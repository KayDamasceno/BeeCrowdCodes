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
        
        int p = Integer.parseInt(partes[0]);
        int j1 = Integer.parseInt(partes[1]);
        int j2 = Integer.parseInt(partes[2]);
        int r = Integer.parseInt(partes[3]);
        int a = Integer.parseInt(partes[4]);
        
        if(r == 1 && a == 1) {
            System.out.println("Jogador 2 ganha!");
        }else if(a == 0 && r==1) {
            System.out.println("Jogador 1 ganha!");
        }else if(a==1 && r==0) {
            System.out.println("Jogador 1 ganha!");
        }else {
            if((j1+j2)%2==0 && p == 1) {
                System.out.println("Jogador 1 ganha!");
            }else if((j1+j2)%2!=0 && p == 1){
                System.out.println("Jogador 2 ganha!");
            }else if((j1+j2)%2==0 && p == 0){
                System.out.println("Jogador 2 ganha!");
            }else if((j1+j2)%2!=0 && p == 0){
                System.out.println("Jogador 1 ganha!");
            }
        }
        out.close();
    }

}

