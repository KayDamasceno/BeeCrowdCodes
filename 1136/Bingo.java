import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] fst = sc.nextLine().split(" ");
        ArrayList<Integer> sub = new ArrayList<Integer>();
        
        int N = Integer.parseInt(fst[0]);
        int B = Integer.parseInt(fst[1]);

        while (N != 0 || B != 0) {

            int[] vetor = new int[B];

            fst = sc.nextLine().split(" ");
            for (int j = 0; j < B; j++) {
                vetor[j] = Integer.parseInt(fst[j]);
            }
            
            for(int i = 0; i < B; i++) {
                for(int j = 0; j < B; j++) {
                    if(i!=j) {
                        if(!sub.contains(Math.abs(vetor[i]-vetor[j])))
                                sub.add(Math.abs(vetor[i]-vetor[j]));
                    }
                }
            }
            
            if(sub.size() == N) {
                System.out.println("Y");
            }else {
                System.out.println("N");
            }
            
            fst = sc.nextLine().split(" ");

            N = Integer.parseInt(fst[0]);
            B = Integer.parseInt(fst[1]);
            sub.clear();

        }

    }
}

