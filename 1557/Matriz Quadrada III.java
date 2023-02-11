import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int number = Integer.parseInt(br.readLine());

        while (number != 0) {

            int matriz[][] = new int[number][number];

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    matriz[i][j] = 1;
                }

            }

            for (int i = 0; i < number; i++) {

                for (int j = 0; j < number; j++) {
                    matriz[i][j] = (int) Math.pow(2, i + j);
                }

            }

            String tamanho = Integer.toString(matriz[number - 1][number - 1]);
            int valor = tamanho.length();
            int valor1;
            String saida;

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    saida = "";
                    if (j == 0) {
                        
                        valor1 = tamanho(i, j, matriz);
                        //System.out.println(valor + " " + valor1);
                        for (int k = 0; k < (valor - valor1); k++) {
                            saida = saida + " ";
                        }
                        saida = saida + matriz[i][j];
                        //System.out.println(saida);
                        out.print(saida);
                    } else {
                        valor1 = tamanho(i, j, matriz);
                        for (int k = 0; k < (valor + 1 - valor1); k++) {
                            saida = saida + " ";
                        }
                        saida = saida + matriz[i][j];
                        out.print(saida);
                        
                    }
                }
                out.println();
            }

            number = Integer.parseInt(br.readLine());
            out.println();
        }

        out.close();
    }

    public static int tamanho(int number1, int number2, int[][] matriz) {
        String tamanho = Integer.toString(matriz[number1][number2]);
        int valor = tamanho.length();
        return valor;
    }

}

