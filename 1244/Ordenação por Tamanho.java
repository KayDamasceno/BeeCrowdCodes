import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        while (N-- > 0) {
            String[] input = sc.nextLine().split(" ");

            Arrays.sort(input, new java.util.Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                 
                    return s2.length() - s1.length();// comparision
                }
            });

            for (int i = 0; i < input.length; i++) {
                if(i == input.length - 1)
                    System.out.println(input[i]);
                else
                    System.out.print(input[i]+ " ");
            }
        }

    }
}

