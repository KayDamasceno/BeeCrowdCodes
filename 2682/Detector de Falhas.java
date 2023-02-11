import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int valor = 0;
        ArrayList<Integer> num = new ArrayList<Integer>();
        while (sc.hasNext()) {
            int N = Integer.parseInt(sc.nextLine().trim());
            num.add(N);
            if (num.size() > 1 && flag == 0) {
                if (num.get(num.size() - 1) < num.get(num.size() - 2)) {
                    valor = num.get(num.size()-2)+1;
                    flag++;
                    
                }
            } else
                num.add(N);
        }
        if(flag==0)
            System.out.println(num.get(num.size()-1)+1);
        else
            System.out.println(valor);
        sc.close();
    }

}

