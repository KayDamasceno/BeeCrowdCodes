import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String numeros;
        int aux = 1;
        int dias = 0;
        int resultado = 0;
        while ((numeros = br.readLine()) != null && numeros.length() != 0) {
            String[] partes = numeros.split(" ");
            
            int dia = Integer.parseInt(partes[1]);
            int mes = Integer.parseInt(partes[0]);
            
            if(dia == 24 && mes == 12)
                System.out.println("E vespera de natal!");
            else if(dia == 25 && mes == 12)
                System.out.println("E natal!");
            else {
                while(aux<mes) {
                
                    if(aux==1||aux==3||aux==5||aux==7||aux==8||aux==10||aux==12) {
                        dias = dias+31;
                    }else if(aux==2) {
                        dias = dias+29;
                    }else
                        dias = dias+30;
                    aux++;
                }
                
                dias = dias + dia;
                resultado = 360 -dias;
                
                if(resultado<0) {
                    System.out.println("Ja passou!");
                }else
                    System.out.println("Faltam "+resultado+" dias para o natal!");
            }
            
            resultado = 0;
            aux = 1; 
            dias = 0;
        }

        out.close();
    }

}

