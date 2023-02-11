import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int Ca = Integer.parseInt(input[0]);
        int Ba = Integer.parseInt(input[1]);
        int Pa = Integer.parseInt(input[2]);
        input = sc.nextLine().split(" ");
        int Cr = Integer.parseInt(input[0]);
        int Br = Integer.parseInt(input[1]);
        int Pr = Integer.parseInt(input[2]);
        int total = 0;
        if(Cr>Ca)
            total = total + (Cr-Ca);
        if(Br>Ba)
            total = total + (Br-Ba);
        
        if(Pr > Pa)
            total = total + (Pr-Pa);
        
        System.out.println(total);
        sc.close();
    }
}

