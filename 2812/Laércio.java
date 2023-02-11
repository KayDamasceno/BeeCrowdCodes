import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> original = new ArrayList<Integer>();
    static ArrayList<Integer> saida = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine().trim());
        while (casos-- > 0) {
            int n = Integer.parseInt(sc.nextLine().trim());
            String[] numeros = sc.nextLine().trim().split(" ");

            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(numeros[i]) % 2 != 0)
                    original.add(Integer.parseInt(numeros[i]));
            }

            // for (Integer a : original)
            // System.out.print(a);
            int number = original.size();
            for (int i = 0; i < number; i++) {
                if (i % 2 == 0) {
                    // System.out.println("Entrei 1");
                    Collections.sort(original, Collections.reverseOrder());
                    // System.out.println(original.get(0));
                    saida.add(original.get(0));
                    original.remove(0);
                } else {
                    // System.out.println("Entrei 2");
                    Collections.sort(original);
                    // System.out.println(original.get(0));
                    saida.add(original.get(0));
                    original.remove(0);
                }

            }
            if (saida.size() != 0) {
                for (int i = 0; i < saida.size() - 1; i++)
                    System.out.print(saida.get(i) + " ");

                System.out.println(saida.get(saida.size() - 1));
            }else
                System.out.println();
            original.clear();
            saida.clear();

        }
    }
}

