import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String[] entrada;
        int T = Integer.parseInt(sc.nextLine());
        ArrayList<String> path = new ArrayList<String>();
        while(T-->0) {
            int N = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < N; i++) {
                entrada = sc.nextLine().split(" ");
            //  System.out.println(entrada.length);
                if(entrada.length == 1)
                    path.add(entrada[0]);
                else {
                    path.add(path.get(Integer.parseInt(entrada[2])-1));
                }
            }
            int pos = 0;
            for(int i = 0; i < N; i++) {
                if(path.get(i).equals("LEFT"))
                    pos = pos - 1;
                else
                    pos = pos + 1;
            }
            System.out.println(pos);
            path.clear();
        }
    }
}

