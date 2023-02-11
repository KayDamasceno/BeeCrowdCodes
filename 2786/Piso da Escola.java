import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int L = sc.nextInt();

        
        double tipo3 = 0.5; //0.5 de comprimento
        double tipo2 = 1;
        
        //Pras paredes
        
        double saldoC = (C-2*tipo3)*2;
        double saldoL = (L-2*tipo3)*2;
        double saldoCL = saldoC+saldoL;
        double areaTotal = C*L;
        double areaTipo1 = 0.5;
        double areaTipo2 = 0.25;
        double areaTipo3 = 0.125;
        double saldoT1 = (areaTotal-(4*areaTipo3)-(saldoCL*0.25))/areaTipo1;
        
        System.out.println((int)saldoT1);
        System.out.println((int)saldoCL);
        
        sc.close();

        
    }
}

