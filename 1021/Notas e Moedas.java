import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    
public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        double numero = sc.nextDouble();
        double auxiliar = numero;
        int cem = -1, cqt = -1, vt = -1, dz = -1, cnc = -1, dois = -1;
        int um = 0, cqtcts = 0, vtcnccts = 0, dzcts = 0, cnccts = 0, umcts = 0;
        //CEM
        while(auxiliar>0) {
            auxiliar = auxiliar - 100;
            cem++;
        }
        auxiliar = numero - cem*100;
        numero = auxiliar;
        
        //Cinquenta
        while(auxiliar>0) {
            auxiliar = auxiliar - 50;
            cqt++;
        }
        auxiliar = numero - cqt*50;
        numero = auxiliar;
        
        //vinte
        while(auxiliar>0) {
            auxiliar = auxiliar - 20;
            vt++;
        }
        auxiliar = numero - vt*20;
        numero = auxiliar;
        
        //Dez
        while(auxiliar>0) {
            auxiliar = auxiliar - 10;
            dz++;
        }
        auxiliar = numero - dz*10;
        numero = auxiliar;
        
        //Cinco
        while(auxiliar>0) {
            auxiliar = auxiliar - 5;
            cnc++;
        }
        auxiliar = numero - cnc*5;
        numero = auxiliar;
        
        //dois
        dois = (int)(numero/2);
        numero =  (numero - (dois*2));
        numero = (Math.round(numero * 100.0) / 100.0);
        
        
        //um
        um = (int)numero/1;
        numero = numero - um*1;
        
        //cinquenta cts
        cqtcts = (int)(numero/0.50);
        numero =  (numero - (cqtcts*0.50));
        numero = (Math.round(numero * 100.0) / 100.0);
        
        //vinte e cinco cts
        vtcnccts = (int)(numero/0.25);
        numero = (numero - (vtcnccts*0.25));
        numero = (Math.round(numero * 100.0) / 100.0);
        
        //dez cents
        dzcts = (int)(numero/0.10);
        numero = (numero - (dzcts*0.10));
        numero = (Math.round(numero * 100.0) / 100.0);
        
        //cinco cents
        cnccts = (int)(numero/0.05);
        numero =  (numero - (cnccts*0.05));
        numero = (Math.round(numero * 100.0) / 100.0);
        
        //um cents
        umcts = (int)(numero/0.01);
        
        System.out.println("NOTAS:");
        System.out.println(cem + " " + "nota(s) de R$ 100.00");
        System.out.println(cqt + " " + "nota(s) de R$ 50.00");
        System.out.println(vt + " " + "nota(s) de R$ 20.00");
        System.out.println(dz + " " + "nota(s) de R$ 10.00");
        System.out.println(cnc + " " + "nota(s) de R$ 5.00");
        System.out.println(dois + " " + "nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(um + " " + "moeda(s) de R$ 1.00");
        System.out.println(cqtcts + " " + "moeda(s) de R$ 0.50");
        System.out.println(vtcnccts + " " + "moeda(s) de R$ 0.25");
        System.out.println(dzcts + " " + "moeda(s) de R$ 0.10");
        System.out.println(cnccts + " " + "moeda(s) de R$ 0.05");
        System.out.println(umcts + " " + "moeda(s) de R$ 0.01");
        
        sc.close();
    }
}

