import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(sc.nextLine().trim());
        String entrada;
        int contador = 0;   
        int dia = 1;
        double soma = 0;
        int kg = 0;
        double valor = 0;
        while (T-- > 0) {
            valor = Double.parseDouble(sc.nextLine().trim());
            entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");
            soma = soma + valor;
            out.println("day "+dia+": "+partes.length+" kg");
            kg = kg + partes.length;
            contador++;
            dia++;
        }
        
        out.printf("%.2f kg by day\n", (kg*1.0/contador));
        out.printf("R$ %.2f by day\n", (soma/contador));
        out.close();
        sc.close();
    }

}

