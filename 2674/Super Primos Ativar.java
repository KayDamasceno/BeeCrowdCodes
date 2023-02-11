import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String a = sc.nextLine().trim();
            int contador = 0;
            for(int i = 0; i<a.length(); i++) {
                if(Character.getNumericValue(a.charAt(i)) == 2)
                    contador++;
                else if(isPrime(Character.getNumericValue(a.charAt(i))))
                    contador++;
            }
            //System.out.println(contador);
            if(isPrime(Integer.parseInt(a))&&contador==a.length())
                System.out.println("Super");
            else if(isPrime(Integer.parseInt(a)))
                System.out.println("Primo");
            else
                System.out.println("Nada");
        }
        sc.close();
    }
    
    public static boolean isPrime(int number) {
        if(number == 2)
            return true;
        return number > 2
          && IntStream.rangeClosed(2, (int) Math.sqrt(number))
          .noneMatch(n -> (number % n == 0));
    }

}

