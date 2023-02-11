import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> st = new Stack<Character>();
        String temp;
        while ((temp = br.readLine()) != null) {
            int aux = 0;
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '(')
                    st.push(temp.charAt(i));
                else if (temp.charAt(i) == ')')
                    try {
                        st.pop();
                    } catch (Exception e) {
                        System.out.println("incorrect");
                        aux++;
                        break;
                    }

            }
            if (aux == 0) {
                if (st.isEmpty()) {
                    System.out.println("correct");
                } else
                    System.out.println("incorrect");
            }
            st.clear();
        }

    }

}

