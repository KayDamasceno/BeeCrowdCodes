#include <stdio.h>

int main (){
    
    int N,i;
    float x, y;
    scanf ("%d", &N);
    
    for (i=0;i<N;i++){
        scanf ("%f %f", &x, &y);
        
        if ((x==0)&&(y==0))
            printf ("divisao impossivel\n");
        else if (y==0)
            printf ("divisao impossivel\n");
        else
            printf ("%.1f\n", x/y); 
        
        
    }
    
}
