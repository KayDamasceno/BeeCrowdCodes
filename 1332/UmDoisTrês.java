import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine().trim());
        while (casos-- > 0) {
            String palavra = sc.nextLine().trim();
            int um = 0, dois = 0;
            if (palavra.length() == 5) {
                System.out.println(3);
            } else {

                if (palavra.charAt(0) == 'o' && palavra.charAt(1) == 'n') {
                    System.out.println(1);
                }else if(palavra.charAt(0) == 'o' && palavra.charAt(2)=='e')
                    System.out.println(1);
                else if(palavra.charAt(1) == 'n' && palavra.charAt(2)=='e')
                    System.out.println(1);
                else
                    System.out.println(2);

                
            }
        }
        sc.close();
    }

}

