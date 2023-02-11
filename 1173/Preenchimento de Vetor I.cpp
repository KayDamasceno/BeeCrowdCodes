#include <stdio.h>

int main (){
    
    int N, x[10],i;
    scanf ("%d",&N) ;
    
    x[0]=N;
    printf ("N[0] = %d\n", N);
    
    for (i=1; i<10; i++){
        x[i] = 2*N;
        printf ("N[%d] = %d\n", i, x[i]);
        
        N = x[i];
    }
    
}
