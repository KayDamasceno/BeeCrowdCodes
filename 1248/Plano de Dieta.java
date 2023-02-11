import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine().trim());
        ArrayList<String> dieta = new ArrayList<String>();
        while(casos-->0) {
            String linha1 = sc.nextLine().trim();
            String[] linha2 = sc.nextLine().trim().split("");
            String[] linha3 = sc.nextLine().trim().split("");
            
            for(int i = 0; i < linha1.length(); i++) {
                dieta.add(Character.toString(linha1.charAt(i)));
            }
            
            int contador = 0;
            
            for(int i = 0; i <linha2.length; i++) {
                if(dieta.contains(linha2[i])) {
                    dieta.remove(linha2[i]);
                }else if(!linha2[i].equals("")){
                    //System.out.println(linha2[i]);
                    contador++;
                }
            }
            
            for(int i = 0; i <linha3.length; i++) {
                if(dieta.contains(linha3[i])) {
                    dieta.remove(linha3[i]);
                }else if(!linha3[i].equals("")) {
                //  System.out.println(linha3[i]);
                    contador++;
                }
            }
            
            Collections.sort(dieta);
            if(contador!=0) {
                System.out.println("CHEATER");
            }else {
                for(String s : dieta)
                    System.out.print(s);
                
                System.out.println();
            }
            
            dieta.clear();
            
            
        }
        sc.close();
    }

}

