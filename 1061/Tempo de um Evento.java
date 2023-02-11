import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    
        public static void main(String[] args) throws IOException {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String diaInicio = br.readLine();
            String tempoInicio = br.readLine();
            String diaFinal = br.readLine();
            String tempoFinal = br.readLine();
            
            int hI, mI, sI, dI;
            int hF, mF, sF, dF;
            
            String[] inicio = tempoInicio.split(" : ");
            String[] dInicio = diaInicio.split(" ");
            hI = Integer.parseInt(inicio[0]);
            mI = Integer.parseInt(inicio[1]);
            sI = Integer.parseInt(inicio[2]);
            dI = Integer.parseInt(dInicio[1]);
            
            String[] final1 = tempoFinal.split(" : ");
            String[] dFinal = diaFinal.split(" ");
            hF = Integer.parseInt(final1[0]);
            mF = Integer.parseInt(final1[1]);
            sF = Integer.parseInt(final1[2]);
            dF = Integer.parseInt(dFinal[1]);
            
            
            int segundoInicio = hI*3600+mI*60+sI;
            int segundoFinal = hF*3600+mF*60+sF;
            
            int resultadoSegundo = 0;
            
            while(dI<=dF) {
                
                if((dI == dF)&&(segundoInicio == segundoFinal)) {
                    break;
                }
                
                if(segundoInicio==86400) {
                    dI++;
                    segundoInicio = 0;
                }
                
                resultadoSegundo++;
                segundoInicio++;
                
                
            }
            
            
            int dias=0, horas=0, minutos=0, segundos=0;
            
            minutos = resultadoSegundo/60;
            horas = minutos/60;
            dias = horas/24;
            
            horas = horas - dias*24;
            minutos = minutos - horas*60-dias*24*60;
            segundos = resultadoSegundo - (minutos+horas*60+dias*24*60)*60;
            
            
            System.out.println(dias+" " + "dia(s)");
            System.out.println(horas+" " + "hora(s)");
            System.out.println(minutos+" " + "minuto(s)");
            System.out.println(segundos+" " + "segundo(s)");
            
            
            
            
        
        }


}

