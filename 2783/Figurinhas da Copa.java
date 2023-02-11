import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] input = br.readLine().split(" ");
        ArrayList<String> array = new ArrayList<String>();
        int N = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int M = Integer.parseInt(input[2]);
        
        input = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        for(int i = 0; i < input2.length; i++) {
            array.add(input2[i]);
        }
        int contador = 0;
        for(int i = 0; i < input.length; i++) {
            if(!array.contains(input[i]))
                contador++;
        }
        System.out.println(contador);
        
        
        
    }
}

