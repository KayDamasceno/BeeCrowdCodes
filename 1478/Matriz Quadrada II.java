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

            int base;
            

            for (int i = 0; i < number; i++) {
                base = 1;
                for (int j = 0; j < number; j++) {
                    if (i == j) {
                        for (int k = i; k < number; k++) {
                            matriz[k][j] = base;
                            base++;
                        }
                        base = 1;
                        for (int k = i; k >= 0; k--) {
                            matriz[k][j] = base;
                            base++;
                        }
                    }

                }
            }

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (j == 0) {
                        if (number == 1) {
                            out.print("  " + matriz[i][j]);
                        } else {
                            if(matriz[i][j]<10)
                                out.print("  " + matriz[i][j] + "   ");
                            else if(matriz[i][j] == 100)
                                out.print(matriz[i][j] + "  ");
                            else {
                                if(matriz[i][j+1]<10)
                                    out.print(" " + matriz[i][j] + "   ");
                                else if(matriz[i][j+1]==100)
                                    out.print(" " + matriz[i][j] + " ");
                                else
                                    out.print(" " + matriz[i][j] + "  ");
                            }
                        }
                    } else if (j == number - 1)
                        out.print(matriz[i][j]);
                    else {
                        if (matriz[i][j + 1] < 10)
                            out.print(matriz[i][j] + "   ");
                        else if(matriz[i][j+1] == 100)
                            out.print(matriz[i][j] + " ");
                        else
                            out.print(matriz[i][j] + "  ");
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

