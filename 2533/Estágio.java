import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int M = Integer.parseInt(sc.nextLine().trim());
            double resultado = 0;
            double num = 0, den = 0;
            double[] N = new double[M];
            double[] C = new double[M];

            for (int i = 0; i < M; i++) {
                String segunda = sc.nextLine().trim();
                String[] numeros = segunda.split(" ");
                double Ni = Double.parseDouble(numeros[0]);
                double Ci = Double.parseDouble(numeros[1]);

                N[i] = Ni;
                C[i] = Ci;
            }

            for (int i = 0; i < M; i++) {
                num = num + (N[i]*C[i]);
            }
            for (int i = 0; i < M; i++) {
                den = den + (C[i]);
            }
            den = den*100;
            
            resultado = num/den;
            
            System.out.printf("%.4f\n", resultado);

        }

        sc.close();
    }

}

