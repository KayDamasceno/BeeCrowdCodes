import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        int matriz[][] = new int[N+1][N+1];
        for(int i = 0; i<N+1; i++) {
            String linha1 = br.readLine();
            String[] partes = linha1.split(" ");
            for(int j = 0; j<N+1; j++) {
                matriz[i][j] = Integer.parseInt(partes[j]);
            }
        }
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                if(matriz[i][j]+matriz[i][j+1]+matriz[i+1][j]+matriz[i+1][j+1] >=2)
                    out.print("S");
                else
                    out.print("U");
            }
            out.println();
        }
        
        out.close();
    }
    
    

}

