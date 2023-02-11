import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        
        Scanner sc = new Scanner(System.in);
        
        String[] a = new String[40];
        String[] b = new String[40];
        String[] c = new String[40];
        String entrada = sc.nextLine();
        a = entrada.split("");
        int aT = a.length;
        entrada = sc.nextLine();
        b = entrada.split("");
        int bT = b.length;
        entrada = sc.nextLine();
        c = entrada.split("");
        int cT = c.length;
        
        for(int i=0 ; i<aT ; i++) System.out.printf("%s",a[i]);
        for(int i=0 ; i<bT ; i++) System.out.printf("%s",b[i]);
        for(int i=0 ; i<cT ; i++) System.out.printf("%s",c[i]);
        System.out.println();

        for(int i=0 ; i<bT ; i++) System.out.printf("%s",b[i]);
        for(int i=0 ; i<cT ; i++) System.out.printf("%s",c[i]);
        for(int i=0 ; i<aT ; i++) System.out.printf("%s",a[i]);
        System.out.println();
        

        for(int i=0 ; i<cT ; i++) System.out.printf("%s",c[i]);
        for(int i=0 ; i<aT ; i++) System.out.printf("%s",a[i]);
        for(int i=0 ; i<bT ; i++) System.out.printf("%s",b[i]);
        System.out.println();
        
        if(aT > 10) aT = 10;
        if(bT > 10) bT = 10;
        if(cT > 10) cT = 10;
        
        for(int i=0 ; i<aT ; i++) System.out.printf("%s",a[i]);
        for(int i=0 ; i<bT ; i++) System.out.printf("%s",b[i]);
        for(int i=0 ; i<cT ; i++) System.out.printf("%s",c[i]);
        System.out.println();
        
        sc.close();
    }

}

