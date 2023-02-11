import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    
    
        public static void main(String[] args) throws IOException {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(System.out);
            
            int number = Integer.parseInt(br.readLine());
            
            while(number!=0){
            
            int matriz [][] = new int[number][number];
            
            for(int i = 0; i < number; i++) {
                for(int j = 0; j < number; j++) {
                    matriz[i][j] = 1;
                }
                
            }
            
            int base = (int)(Math.round(number*1.0/2));
            int valor1 = 0, valor2 = 01;
            
            if((number%2) == 0) {
                valor1 = base-1;
                valor2 = base;
            }else {
                valor1 = base-1;
                valor2 = base-1;
            }
            
            
            while(base>0) {
                for(int i = 0; i < number; i++) {
                    for(int j = 0; j < number; j++) {
                        if((i == valor1)||(j == valor2)||(i==valor2)||(j==valor1))
                            matriz[i][j] = base;
                    }
                }
                base--;
                valor1 = valor1-1;
                valor2 = valor2+1;
            }
            
            
            for(int i = 0; i < number; i++) {
                for(int j = 0; j < number; j++) {
                    if(j == 0) {
                        if(number == 1) {
                            out.print("  "+matriz[i][j]);
                        }else {
                            out.print("  "+matriz[i][j]+"   ");
                        
                        }
                    }
                    else if(j == number - 1)
                        out.print(matriz[i][j]);
                    else {
                        if(matriz[i][j+1] < 10)
                            out.print(matriz[i][j]+"   ");
                        else
                            out.print(matriz[i][j]+"  ");
                    }
                        
                }
                out.println();
            }
            
            number = Integer.parseInt(br.readLine());
            out.println();
            }
            
            out.close();
        }

}

