import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> st = new Stack<Character>();
        String temp;
        int casos = Integer.parseInt(br.readLine());
        while (casos-- > 0) {
            int counter = 0;
            temp = br.readLine();
            for(int i = 0; i < temp.length(); i++) {
                if(temp.charAt(i)=='<')
                    st.push(temp.charAt(i));
                else if(temp.charAt(i)=='>') {
                    try {
                        st.pop();
                        counter ++;
                    }catch(Exception e) {
                        
                    }
                }
            }
            st.clear();
            
            System.out.println(counter);
        }

    }

}

