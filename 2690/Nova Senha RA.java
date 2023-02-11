import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("G",0); map.put("Q",0); map.put("a",0); map.put("k",0); map.put("u",0);
        map.put("I",1); map.put("S",1); map.put("b",1); map.put("l",1); map.put("v",1);
        map.put("E",2); map.put("O",2); map.put("Y",2); map.put("c",2); map.put("m",2); map.put("w",2);
        map.put("F",3); map.put("P",3); map.put("Z",3); map.put("d",3); map.put("n",3); map.put("x",3);
        map.put("J",4); map.put("T",4); map.put("e",4); map.put("o",4); map.put("y",4);
        map.put("D",5); map.put("N",5); map.put("X",5); map.put("f",5); map.put("p",5); map.put("z",5); 
        map.put("A",6); map.put("K",6); map.put("U",6); map.put("g",6); map.put("q",6);
        map.put("C",7); map.put("M",7); map.put("W",7); map.put("h",7); map.put("r",7);
        map.put("B",8); map.put("L",8); map.put("V",8); map.put("i",8); map.put("s",8);
        map.put("H",9); map.put("R",9); map.put("j",9); map.put("t",9);
        
        
        int casos = Integer.parseInt(sc.nextLine().trim());
        
        while(casos-->0) {
            String saida = "";
            String[] entrada = sc.nextLine().trim().split("");
            int contador = 0;
            for(int i = 0; i<entrada.length; i++) {
                if(map.containsKey(entrada[i]) && !entrada[i].equals(" ")) {
                    saida = saida+map.get(entrada[i]);
                    contador++;
                }
                if(contador==12)
                    break;
            }
            
            System.out.println(saida);
        }
    }

}

