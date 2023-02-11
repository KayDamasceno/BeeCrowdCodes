import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        int N = Integer.parseInt(br.readLine());
        
        while(N!=0) {
            for(int i = 1; i<=N; i++) {
                q.add(i);
            }
            while(q.size()!=1) {
                //System.out.println(q);
                int removed = q.remove();
                array.add(removed);
                int head = q.peek();
                q.add(head);
                q.remove();
            }
            System.out.print("Discarded cards: ");
            for(int i = 0; i < array.size(); i++) {
                if(i == array.size()-1) {
                    System.out.println(array.get(i));
                }else
                    System.out.print(array.get(i)+", ");
                
            }
            System.out.println("Remaining card: "+ q.peek());
            q.clear();
            array.clear();
            N = Integer.parseInt(br.readLine());
        }
    }

}

