import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

public class Main {
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] input;
        int saindo = 0;
        int voltando = 0;
        Stack<Integer> st = new Stack<Integer>();
        while((input = br.readLine().split(" "))!=null && !input[0].equals("ABEND")) {
            
            
            if(input[0].equals("SALIDA")) {
                saindo = saindo + Integer.parseInt(input[1]);
                st.push(1);
            }
            else {
                voltando = voltando + Integer.parseInt(input[1]);
                try {
                    st.pop();
                }catch(Exception e) {
                    
                }
            }
            
            
        }
        out.println(Math.abs(saindo-voltando));
        out.println(st.size());
        
        out.close();
        
        
    }
}

