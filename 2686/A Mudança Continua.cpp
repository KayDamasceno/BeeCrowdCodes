#include <iostream>
#include <stdio.h>
using namespace std;

int main(int argc, char** argv)
{
    
    double M;
    int horas, minutos, segundos;
    double temp;
    
    while (cin >> M){
        if(0<=M && M<90){
            temp = (21600*M)/90;
            horas =  (temp/3600);
            minutos = (temp - (3600*horas))/60;
            segundos = (temp - (3600*horas) - (minutos*60));
            
            horas = horas + 6;
            cout << "Bom Dia!!"<<endl;
            //cout << (6 +horas) <<":" << minutos << ":" << segundos <<endl;
                
        }   
        else if(90<=M && M<180){
            temp = (21600*M)/90;
            horas =  (temp/3600);
            minutos = (temp - (3600*horas))/60;
            segundos = (temp - (3600*horas) - (minutos*60));
            
            horas = horas + 6;
            cout << "Boa Tarde!!"<<endl;
        }   
        else if(180<=M && M<270){
            cout << "Boa Noite!!"<<endl;
            temp = (21600*M)/90;
            horas =  (temp/3600);
            minutos = (temp - (3600*horas))/60;
            segundos = (temp - (3600*horas) - (minutos*60));
            
            horas = horas + 6;  
        }   
        else if(270<=M && M<360){
            temp = (21600*M)/90;
            horas =  (temp/3600);
            minutos = (temp - (3600*horas))/60;
            segundos = (temp - (3600*horas) - (minutos*60));
            horas = horas + 6;
            if(horas>=24)
                horas = horas - 24;
            cout << "De Madrugada!!"<<endl;
                
        }   
        else if(M==360){
            
            
            horas = 6;
            minutos = 0;
            segundos = 0;
            cout << "Bom Dia!!"<< endl;
        }
        
    (horas < 10) ? (printf("0%d:", horas)) : (printf("%d:", horas));
    (minutos < 10) ? (printf("0%d:", minutos)) : (printf("%d:", minutos));
    (segundos < 10) ? (printf("0%d\n", segundos)) : (printf("%d\n", segundos));
    }
    
    return 0;
}
