import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Long> fibo = new ArrayList<Long>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] pos = sc.nextLine().trim().split(" ");
        String[] in = pos[0].split("");
        String[] out = pos[1].split("");
        int value = 0;
        if(in[0].equals("a")) {
            value = 1;
        }else if(in[0].equals("b")) {
            value = 2;
        }else if(in[0].equals("c")) {
            value = 3;
        }else if(in[0].equals("d")) {
            value = 4;
        }else if(in[0].equals("e")) {
            value = 5;
        }else if(in[0].equals("f")) {
            value = 6;
        }else if(in[0].equals("g")) {
            value = 7;
        }else if(in[0].equals("h")) {
            value = 8;
        }
        
        int value1 = 0;
        if(out[0].equals("a")) {
            value1 = 1;
        }else if(out[0].equals("b")) {
            value1 = 2;
        }else if(out[0].equals("c")) {
            value1 = 3;
        }else if(out[0].equals("d")) {
            value1 = 4;
        }else if(out[0].equals("e")) {
            value1 = 5;
        }else if(out[0].equals("f")) {
            value1 = 6;
        }else if(out[0].equals("g")) {
            value1 = 7;
        }else if(out[0].equals("h")) {
            value1 = 8;
        }
        int a = Integer.parseInt(in[1]);
        int b = Integer.parseInt(out[1]);
        
        if(Math.abs(value-value1) + Math.abs(a-b) == 3) {
            System.out.println("VALIDO");
        }else {
            System.out.println("INVALIDO");
        }
        
    }
}

