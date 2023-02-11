import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] texto = sc.nextLine().trim().split(" ");
        String N = texto[0];
        String M = texto[1];
        
        while (!N.equals("0") || !M.equals("0")) {
            
            
            
            //System.out.println(N + " " + M);
            while(N.length()!=1) {
                int somaN = 0;
                for(int i = 0; i < N.length(); i++) {
                    somaN = somaN+Integer.parseInt(Character.toString(N.charAt(i)));
                }
                
                N = Integer.toString(somaN);
            }
            
            while(M.length()!=1) {
                int somaM = 0;
                for(int i = 0; i < M.length(); i++) {
                    somaM = somaM+Integer.parseInt(Character.toString(M.charAt(i)));
                    //System.out.println(somaM);
                }
                
                M = Integer.toString(somaM);
                //System.out.println(M);
            //  System.exit(2);
            }
            
            if(Integer.parseInt(N)>Integer.parseInt(M))
                System.out.println(1);
            else if(Integer.parseInt(M)>Integer.parseInt(N))
                System.out.println(2);
            else
                System.out.println(0);
            
            texto = sc.nextLine().trim().split(" ");
            N = texto[0];
            M = texto[1];
            
        }
        
        sc.close();
    }
}

