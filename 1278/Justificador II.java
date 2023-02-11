import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<String> array = new ArrayList<String>();
        int N = Integer.parseInt(sc.nextLine());
        while (N != 0) {

            int max = 0;
            
            for(int i = 0; i < N; i++) {
                String entrada = sc.nextLine();
                String[] values = entrada.replaceAll("^[.,\\s]+", "").split("[.,\\s]+");
                //System.out.println(values.length);
                String text = "";
                for(int j = 0; j< values.length; j++) {
                    if(j == values.length-1)
                        text = text + values[j]+"\n";
                    else
                        text = text + values[j]+" ";
                }
                //System.out.println(text);
                if(text.length() > max)
                    max = text.length();
                
                array.add(text);
            }
            //System.out.println(max);
            String output = "%"+max+"s";
            
            for(int i = 0; i < array.size(); i++) {
                String padded = String.format(output, array.get(i));
                System.out.printf(padded);
            }
            
            array.clear();
            N = Integer.parseInt(sc.nextLine());
            if(N!=0)
                System.out.println();
        }
        out.close();
    }
}

