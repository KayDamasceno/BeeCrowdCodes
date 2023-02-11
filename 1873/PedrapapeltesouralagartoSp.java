import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.nextLine());
        
        while(N-->0) {
            String[] buff = sc.nextLine().split(" ");
            String rajesh = buff[0];
            String sheldon = buff[1];
            
            if(rajesh.equals("tesoura")) {
                if(sheldon.equals("papel") || sheldon.equals("lagarto"))
                    System.out.println("rajesh");
                else if(sheldon.equals("spock")||sheldon.equals("pedra"))
                    System.out.println("sheldon");
                else
                    System.out.println("empate");
            }else if(rajesh.equals("papel")) {
                if(sheldon.equals("pedra") || sheldon.equals("spock"))
                    System.out.println("rajesh");
                else if(sheldon.equals("lagarto")||sheldon.equals("tesoura"))
                    System.out.println("sheldon");
                else
                    System.out.println("empate");
            }else if(rajesh.equals("pedra")) {
                if(sheldon.equals("lagarto") || sheldon.equals("tesoura"))
                    System.out.println("rajesh");
                else if(sheldon.equals("papel")||sheldon.equals("spock"))
                    System.out.println("sheldon");
                else
                    System.out.println("empate");
            }else if(rajesh.equals("lagarto")) {
                if(sheldon.equals("spock") || sheldon.equals("papel"))
                    System.out.println("rajesh");
                else if(sheldon.equals("pedra")||sheldon.equals("tesoura"))
                    System.out.println("sheldon");
                else
                    System.out.println("empate");
            }else if(rajesh.equals("spock")) {
                if(sheldon.equals("tesoura") || sheldon.equals("pedra"))
                    System.out.println("rajesh");
                else if(sheldon.equals("papel")||sheldon.equals("lagarto"))
                    System.out.println("sheldon");
                else
                    System.out.println("empate");
            }
        }
    
        sc.close();
        out.close();
    }

    

}

