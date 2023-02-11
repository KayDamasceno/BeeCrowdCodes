import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Set<Integer> album = new HashSet<Integer>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int aux;
        for(int i = 0; i < M; i++) {
            aux = sc.nextInt();
            album.add(aux);
        }
        
        System.out.println(N-album.size());
    }

}

