import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A, D;
        A = sc.nextInt();
        D = sc.nextInt();

        while (A != 0 || D != 0) {
            
            int[] qtA = new int[A];
            int[] qtD = new int[D];
            
            for(int i = 0; i<A; i++) {
                qtA[i] = sc.nextInt();
            }
            for(int i = 0; i<D; i++) {
                qtD[i] = sc.nextInt();
            }
            
            Arrays.sort(qtA);
            Arrays.sort(qtD);
            
            if(qtA[0] >= qtD[1])
                System.out.println("N");
            else
                System.out.println("Y");
            
            A = sc.nextInt();
            D = sc.nextInt();
        }

    }

}

