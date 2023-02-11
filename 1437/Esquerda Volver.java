import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int casos = Integer.parseInt(br.readLine());
        
        while    (casos != 0) {
            String entrada = br.readLine();
            char state = 'N';
            for(int i = 0; i < entrada.length(); i ++) {
                if(entrada.charAt(i) == 'D') {
                    if(state == 'N') {
                        state = 'L';
                    } else if (state == 'L') {
                        state = 'S';
                    } else if (state == 'S') {
                        state = 'O';
                    } else if (state == 'O') {
                        state = 'N';
                    }
                } else if (entrada.charAt(i) == 'E') {
                    if(state == 'N') {
                        state = 'O';
                    } else if (state == 'L') {
                        state = 'N';
                    } else if (state == 'S') {
                        state = 'L';
                    } else if (state == 'O') {
                        state = 'S';
                    }
                }
            }
            System.out.println(state);
            casos = Integer.parseInt(br.readLine());
        }

    }
}

