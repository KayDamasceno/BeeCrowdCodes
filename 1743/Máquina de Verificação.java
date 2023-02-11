import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] primeiro = sc.nextLine().trim().split(" ");
        String[] segundo = sc.nextLine().trim().split(" ");
        

        int contador = 0;
        
        for(int i = 0; i < 5; i++) {
            
            if(!primeiro[i].equals(segundo[i]))
                contador++;
                
            
        }
        
        if(contador == 5)
            System.out.println("Y");
        else
            System.out.println("N");
        sc.close();
    }

}

