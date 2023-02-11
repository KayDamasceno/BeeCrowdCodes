#include <stdio.h>

int main (){
    
    int N,i;
    scanf ("%d", &N);
    float a,b,c;
    
    for (i=0; i<N; i++){
        scanf ("%f %f %f", &a, &b, &c);
        
        printf ("%.1f\n", (2*a+3*b+5*c)/10.0);
    }
}
