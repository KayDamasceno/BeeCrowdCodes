import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        String entrada = sc.nextLine();
        
        if(entrada.toLowerCase().contains("zelda"))
            System.out.println("Link Bolado");
        else
            System.out.println("Link Tranquilo");
    }
}

