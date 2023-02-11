import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.nextLine());
        
        while(N-->0) {
            String[] input = sc.nextLine().trim().split(" ");
            
            int M = Integer.parseInt(input[0]);
            int C = Integer.parseInt(input[1]);
            String[] text = new String[M];
            

            input = sc.nextLine().trim().split(" ");
            
            for(int i = 0; i < C; i++) {
                text[Integer.parseInt(input[i])%M] = text[Integer.parseInt(input[i])%M] + "-> "+input[i]+" ";
            }
            for(int i = 0; i < M; i++) {
                text[i] = text[i]+"-> \\";
                text[i] = text[i].replaceAll("null", "");
            }
            for(int i = 0; i < M; i++) {
                out.println(i+" "+text[i]);
            }
            if(N != 0)
                out.println();
            
        }
        out.close();
    }
}

