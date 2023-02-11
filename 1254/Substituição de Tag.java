import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        
        Scanner sc = new Scanner(System.in);
    
        while(sc.hasNextLine()) {
            String first = sc.nextLine();
            String sec = sc.nextLine();
            String text = sc.nextLine();
        
            int count = 3;
            String output = "";
            String word = "";
            for(int i = 0 ; i < text.length(); i ++) {
                if(text.charAt(i)=='<') {
                    count=1;
                }else if(text.charAt(i)=='>') {
                    count=0;
                }
                
                if(count == 1) {
                    word = word + text.charAt(i);   
                    
                }else if(count == 0) {
                    word = word + text.charAt(i);
                    
                    word = word.replaceAll("(?i)"+first, sec);
                
                    output = output + word;
                    word = "";
                    count = 3;
                }else {
                    output = output+text.charAt(i);
                }
            }

            System.out.println(output);

        }
                sc.close();
    }

}
