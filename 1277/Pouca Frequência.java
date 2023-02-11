import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<String> repro = new ArrayList<String>();
        int T = Integer.parseInt(sc.nextLine());
        while(T-->0) {
            int N = Integer.parseInt(sc.nextLine());
            String[] alunos = sc.nextLine().split(" ");
            String[] buff = sc.nextLine().split(" ");
            
            
            for(int i = 0; i < N; i++) {
                int contador = 0;
                String text = buff[i].replaceAll("M","");
                //System.out.println("Text "+ text);
                for(int j = 0; j < text.length(); j++) {
                    if(text.charAt(j) == 'P')
                        contador++;
                }
            //  System.out.println(alunos[i]);
                //System.out.println(contador);
                double pct = ((contador*1.0)/text.length())*100;
                //System.out.println(pct);
                if(pct < 75)
                    repro.add(alunos[i]);
                
                
            }
            
            for(int i = 0; i < repro.size(); i++) {
                if(i == repro.size() - 1)
                    out.println(repro.get(i));
                else
                    out.print(repro.get(i)+" ");
            }
            if(repro.isEmpty())
                out.println();
            
            repro.clear();
            
            
        }
        out.close();
    }

    

}

