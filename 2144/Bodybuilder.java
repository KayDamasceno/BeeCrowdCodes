import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int W1 = Integer.parseInt(entrada[0]);
        int W2 = Integer.parseInt(entrada[1]);
        int R = Integer.parseInt(entrada[2]);
        double mediaTotal = 0;
        while(W1!=0 || W2!=0 || R!=0) {
            double media = 0;
            double media1 = 0;
            double media2 = 0;
            
            media1 = media1 + ((W1))*(1 + (R*1.0/30));
            media2 = media2 + ((W2))*(1 + (R*1.0/30));
            media = (media1 + media2)/2;
            if(media >= 1 && media < 13 ) {
                System.out.println("Nao vai da nao");
            } else if(media >= 13 && media <14) {
                System.out.println("E 13");
            } else if(media >= 14 && media <40) {
                System.out.println("Bora, hora do show! BIIR!");
            } else if(media >=40 && media <=60) {
                System.out.println("Ta saindo da jaula o monstro!");
            } else if(media > 60) {
                System.out.println("AQUI E BODYBUILDER!!");
            }
            
            mediaTotal = mediaTotal + media;
            
            
            entrada = sc.nextLine().split(" ");
            W1 = Integer.parseInt(entrada[0]);
            W2 = Integer.parseInt(entrada[1]);
            R = Integer.parseInt(entrada[2]);
        }
        System.out.println();
        if(mediaTotal > 40)
            System.out.println("Aqui nois constroi fibra rapaz! Nao e agua com musculo!");
        
        
    }
}

