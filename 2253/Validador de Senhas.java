import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String entrada = sc.nextLine().trim();

            if (entrada.matches("^(?=.{6,32}$)(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])^\\S*^[a-zA-Z0-9_.-]*$"))
                System.out.println("Senha valida.");
            else
                System.out.println("Senha invalida.");
        }
        sc.close();
    }

}

