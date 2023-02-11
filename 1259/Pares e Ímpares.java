import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer> cresc;
        ArrayList<Integer> decresc;
        
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int e = Integer.parseInt(br.readLine());
            number.add(e);
        }
        
        Collections.sort(number);
        cresc = new ArrayList<Integer>(number);
        Collections.sort(number, Collections.reverseOrder());
        decresc = new ArrayList<Integer>(number);
        
        for(int i = 0; i < cresc.size(); i++) {
            if(cresc.get(i)%2 == 0)
                System.out.println(cresc.get(i));
        }
        
        for(int i = 0; i <decresc.size(); i++) {
            if(decresc.get(i)%2 !=0){
                System.out.println(decresc.get(i));
            }
        }
        
    }

}

