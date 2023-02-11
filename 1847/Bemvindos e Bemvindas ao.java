import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inteiros = br.readLine();
        String[] partInteiros = inteiros.split(" ");

        int A = Integer.parseInt(partInteiros[0]);
        int B = Integer.parseInt(partInteiros[1]);
        int C = Integer.parseInt(partInteiros[2]);

        if (A == B && B == C)
            System.out.println(":(");
        else if (A > B && C >= B)
            System.out.println(":)");
        else if (A < B && C <= B)
            System.out.println(":(");
        else if (A < B && C > B && ((C - B) < (B - A)))
            System.out.println(":(");
        else if (A < B && C > B && ((C - B) >= (B - A)))
            System.out.println(":)");
        else if (A > B && C < B && ((B - C) < (A - B)))
            System.out.println(":)");
        else if (A > B && C < B && ((B - C) >= (A - B)))
            System.out.println(":(");
        else if (A == B) {
            if (C > B)
                System.out.println(":)");
            if (C < B)
                System.out.println(":(");
        }

    }

}

