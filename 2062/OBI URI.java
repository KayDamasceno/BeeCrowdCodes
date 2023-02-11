import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String entrada = sc.nextLine().trim();
        String[] partes = entrada.split(" ");
        
        for(int i = 0; i<N-1; i++) {

            if(partes[i].substring(0, 2).equals("UR") && partes[i].length() == 3) {
                System.out.print("URI ");
            }else if(partes[i].substring(0, 2).equals("OB") && partes[i].length() == 3)
                System.out.print("OBI ");
            else
                System.out.print(partes[i]+" ");
        }
        
        if(partes[N-1].substring(0, 2).equals("UR")&& partes[N-1].length() == 3) {
            System.out.print("URI");
        }else if(partes[N-1].substring(0, 2).equals("OB")&& partes[N-1].length() == 3)
            System.out.print("OBI");
        else
            System.out.print(partes[N-1]);
        
        System.out.println();
        sc.close();
    }

}

