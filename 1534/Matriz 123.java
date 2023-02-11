import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String numero;
        int number;
        while ((numero = br.readLine())!=null && numero.length()!=0){
            number = Integer.parseInt(numero);
            int matriz[][] = new int[number][number];

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    matriz[i][j] = 1;
                }

            }

            int base = number -1;
            

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if(i+j==base) {
                        matriz[i][j] = 2;
                    }else if(i==j) {
                        matriz[i][j] = 1;
                    } else {
                        matriz[i][j] = 3;
                    }
                }
            }

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }

            
        }

    
    }

}

