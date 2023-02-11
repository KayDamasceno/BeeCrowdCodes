import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String A, B, C;

        int um, dois, tres;
        um = sc.nextInt();
        dois = sc.nextInt();
        tres = sc.nextInt();
        
        A = Integer.valueOf(um).toString();
        B = Integer.valueOf(dois).toString();
        C = Integer.valueOf(tres).toString();
        
        

        System.out.println("A = " + A + ", B = " + B + ", C = " + C);
        // PRIMEIRA //

        System.out.print("A = ");
        for (int i = 0; i < 10 - (A).length(); i++) {
            System.out.print(" ");
        }
        System.out.print(A + ", B = ");
        for (int i = 0; i < 10 - (B).length(); i++) {
            System.out.print(" ");
        }
        System.out.print(B + ", C = ");
        for (int i = 0; i < 10 - (C).length(); i++) {
            System.out.print(" ");
        }
        System.out.print(C);
        System.out.println();
        // SEGUNDA
        if (A.charAt(0) == '-') {
            System.out.print("A = -");

            for (int i = 1; i < 11 - (A).length(); i++) {
                System.out.print("0");

            }
            System.out.print(A.substring(1, A.length()) + ",");
        } else {
            System.out.print("A = ");

            for (int i = 0; i < 10 - (A).length(); i++) {
                System.out.print("0");

            }
            System.out.print(A + ",");
        }
        if (B.charAt(0) == '-') {
            System.out.print(" B = -");

            for (int i = 1; i < 11 - (B).length(); i++) {
                System.out.print("0");

            }
            System.out.print(B.substring(1, B.length()) + ",");
        } else {
            
            System.out.print(" B = ");

            for (int i = 0; i < 10 - (B).length(); i++) {
                System.out.print("0");

            }
            System.out.print(B + ",");
        }
        if (C.charAt(0) == '-') {
            System.out.print(" C = -");

            for (int i = 1; i < 11 - (C).length(); i++) {
                System.out.print("0");

            }
            System.out.print(C.substring(1, C.length()));
        } else {
            System.out.print(" C = ");

            for (int i = 0; i < 10 - (C).length(); i++) {
                System.out.print("0");

            }
            System.out.print(C);
        }
    
        System.out.println();
        // TERCEIRA

        System.out.print("A = " + A);
        for (int i = 0; i < 10 - (A).length(); i++) {
            System.out.print(" ");
        }
        System.out.print(", B = " + B);
        for (int i = 0; i < 10 - (B).length(); i++) {
            System.out.print(" ");
        }
        System.out.print(", C = " + C);
        for (int i = 0; i < 10 - (C).length(); i++) {
            System.out.print(" ");
        }

        System.out.println();

        sc.close();
    }

}

