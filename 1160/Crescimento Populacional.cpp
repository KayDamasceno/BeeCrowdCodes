#include <stdio.h>

int main (){
    
    int T, i, PA, PB, t=0;
    double G1, G2;
    scanf ("%d", &T);
        
    for (i=0; i<T; i++){
        scanf ("%d %d %lf %lf", &PA, &PB, &G1, &G2);
        
        while (PA<=PB){
            PA = PA + ((G1*PA)/100);
            PB = PB + ((G2*PB)/100);
            t++;
            
            if(t>100)
                break;
        }
        
        if (t<=100)
            printf ("%d anos.\n", t);
        else
            printf ("Mais de 1 seculo.\n");
        
        t = 0;
    }
}
