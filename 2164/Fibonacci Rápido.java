import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int n = Integer.parseInt(br.readLine());
        
        double parcial = Math.pow(((1+Math.sqrt(5))/2),n);
        double parcial2 = Math.pow(((1-Math.sqrt(5))/2),n);
        double resultado = (parcial - parcial2)/Math.sqrt(5);
        
        System.out.printf("%.1f\n", resultado);
        
    }

}

