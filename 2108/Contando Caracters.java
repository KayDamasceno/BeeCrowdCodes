import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String biggest ="";
        int maior = 0;
        while (!input.equals("0")) {
            String[] words = input.split(" ");
            
        
            for(int i = 0; i < words.length; i++) {
                if(i == words.length -1) {
                    System.out.println(words[i].length());
                }else {
                    System.out.print(words[i].length()+"-");
                }
                
                if(words[i].length() >= maior) {
                    maior = words[i].length();
                    biggest = words[i];
                }
            }
            
            input = sc.nextLine();
            
        }
        System.out.println();
        System.out.println("The biggest word: "+biggest);
        
        sc.close();
    }

}
