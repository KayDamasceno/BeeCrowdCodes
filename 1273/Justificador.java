import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static String leftPad(String originalString, int length, char padCharacter) {
        String paddedString = originalString;
        while (paddedString.length() < length) {
            paddedString = padCharacter + paddedString;
        }
        return paddedString;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while (N != 0) {
            int max = 0;
            String[] vetor = new String[N];
            for (int i = 0; i < N; i++) {
                String temp = br.readLine();
                if (temp.length() > max)
                    max = temp.length();

                vetor[i] = temp;
            }
        
            for (int i = 0; i < N; i++) {
                System.out.println(leftPad(vetor[i], max ,' '));
            }
            
            
            N = Integer.parseInt(br.readLine());
            if(N == 0)
                break;
            System.out.println();
        }
    }

}

