import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int P = Integer.parseInt(entrada[0]);
        int R = Integer.parseInt(entrada[1]);
        
        if(P == 0 && R == 0)
            System.out.println("C");
        else if(P == 1 && R == 0)
            System.out.println("B");
        else if(P == 0 && R == 1)
            System.out.println("C");
        else if(P == 1 && R == 1)
            System.out.println("A");
    }
}

