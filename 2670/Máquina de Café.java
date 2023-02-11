import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine().trim());
        int b = Integer.parseInt(sc.nextLine().trim());
        int c = Integer.parseInt(sc.nextLine().trim());
        int[] vetor = new int[3];
        //Primeiro Andar
        vetor[0] = 2*b+4*c;
        //Segundo andar
        vetor[1] = 2*a + 2*c;
        //Terceiro andar
        vetor[2] = 4*a + 2*b;
        
        Arrays.sort(vetor);
        
        System.out.println(vetor[0]);
        

        sc.close();
    }

}

