import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        String[] buff;
        Set<Character> set = new HashSet<Character>();
        int N = Integer.parseInt(sc.nextLine());
        while(N-->0) {
            buff = sc.nextLine().split("");

            for(int i = 0; i < buff.length; i++) {
                if(Character.isAlphabetic(buff[i].charAt(0))) {
                        set.add(buff[i].charAt(0));
                }
            }
            
            if(set.size() == 26)
                System.out.println("frase completa");
            else if(set.size() >= 13 && set.size() < 26) {
                System.out.println("frase quase completa");
            }else
                System.out.println("frase mal elaborada");
            
            set.clear();
        }
        
    }

}

