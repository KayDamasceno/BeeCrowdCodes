import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Set<String> set = new TreeSet<String>();
        ArrayList<String> array;
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String[] text = input.replaceAll(" ", "").split("");

            if (!input.isEmpty()) {
                for (int i = 0; i < text.length; i++)
                    set.add(text[i]);
                array = new ArrayList<String>(set);

                char first = array.get(0).charAt(0);
                char temp = array.get(0).charAt(0);
                for (int i = 1; i < array.size(); i++) {

                    if (array.get(i).charAt(0) != temp + 1) {
                        System.out.print(first + ":" + temp + ", ");
                        first = array.get(i).charAt(0);
                        temp = array.get(i).charAt(0);
                    } else {
                        temp = array.get(i).charAt(0);
                    }
                }
                System.out.println(first + ":" + temp);
                set.clear();
                array.clear();

            } else {
                System.out.println();
            }
        }

    }
}

