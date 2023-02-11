import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double O = sc.nextDouble();
        double B = sc.nextDouble();
        double I = sc.nextDouble();
        
        if(O<B && O<I) {
            System.out.println("Otavio");
        }else if(B<O && B<I) {
            System.out.println("Bruno");
        }else if(I<O && I<B) {
            System.out.println("Ian");
        }else
            System.out.println("Empate");
        
        
        sc.close();
        
    }
    

}

