import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int T = Integer.parseInt(sc.nextLine());

        while (T-- > 0) {
            String input = sc.nextLine();
            int output = 1;
            
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'a' || input.charAt(j) == 'A') 
                    output = output*3;
                else if (input.charAt(j) == 'e' || input.charAt(j) == 'E')
                    output = output*3;
                else if (input.charAt(j) == 'i' || input.charAt(j) == 'I')
                    output = output*3;
                else if (input.charAt(j) == 'o' || input.charAt(j) == 'O')
                    output = output*3;
                else if (input.charAt(j) == 's' || input.charAt(j) == 'S')
                    output = output*3;
                else
                    output = output*2;
            }

            System.out.println(output);
        }
    }
}

