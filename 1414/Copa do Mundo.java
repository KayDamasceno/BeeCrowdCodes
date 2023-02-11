import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String numeros = sc.nextLine().trim();
        String[] div = numeros.split(" ");
        int T = Integer.parseInt(div[0]);
        int N = Integer.parseInt(div[1]);
        while(T!=0 || N!=0) {
            int soma = 0;
            int aux = N;
            
            while(T-->0) {
                String time = sc.nextLine().trim();
                //System.out.println(time);
                String[] partes = time.split(" ");
                
                soma = soma + Integer.parseInt(partes[1]);
                
            }
            System.out.println((aux*3-soma));
            numeros = sc.nextLine().trim();
            div = numeros.split(" ");
            T = Integer.parseInt(div[0]);
            N = Integer.parseInt(div[1]);
        }
        
        sc.close();
    }

}

