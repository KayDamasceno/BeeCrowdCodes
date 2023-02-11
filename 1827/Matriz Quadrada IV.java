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

        while ((numero = br.readLine())!=null && numero.length()!=0) {
            
            number = Integer.parseInt(numero);


            int matriz[][] = new int[number][number];

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    matriz[i][j] = 0;
                }

            }
            
            int base = (int)number/3;
            int max = (number - 2*base) + base;
            
        
            for (int i = 0; i < number; i++) {

                for (int j = 0; j < number; j++) {
                    
                    if(i>=base && i<max && j>=base && j<max) {
                        matriz[i][j] = 1;
                    }
                    if(i==j) {
                        if((i<base)||(i>=max)) {
                            matriz[i][j] = 2;
                        }
                    }else if(i+j == number -1) {
                        if((i<base)||(i>=max)) {
                            matriz[i][j] = 3;
                        }
                    }
                    
                    if(number%2!=0)
                        matriz[(int)(number/2)][(int)(number/2)] = 4;
                }

            }

        
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }

        
            System.out.println();
        }

        out.close();
    }


}

